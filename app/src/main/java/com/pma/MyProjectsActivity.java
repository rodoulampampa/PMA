package com.pma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MyProjectsActivity extends AppCompatActivity {
    static ArrayList<Project> projects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_projects);

        projects = loadProjects(this);
        ListView listView = findViewById(R.id.projects_list);
        listView.setAdapter(new ProfileAdapter());
    }

    class ProfileAdapter extends ArrayAdapter<Project> {

        public ProfileAdapter() {
            super(MyProjectsActivity.this, R.layout.add_to_profile);
        }
        @NonNull
        @Override
        public View getView(int position, View convertView, @NonNull ViewGroup parent){
            View itemview = convertView;
            if(itemview == null){
                itemview = MyProjectsActivity.this.getLayoutInflater().inflate(R.layout.add_to_profile, parent, false);
            }

            TextView text1 = itemview.findViewById(R.id.text1);
            TextView text2 = itemview.findViewById(R.id.text2);

            text1.setText(Html.fromHtml(projects.get(position).project_name));
            text2.setText(Html.fromHtml(projects.get(position).project_description));

            return itemview;
        }

        @Override
        public int getCount(){
            return projects.size();
        }
    }

    /** Called when the user taps the Floating Action Button*/
    public void add_a_project_screen(View view) {
        Intent intent = new Intent(this, Add_a_project.class);
        startActivity(intent);
    }

    static ArrayList<Project> loadProjects(Activity activity) {
        ArrayList<Project> list = new ArrayList<>();

        File filesDir = activity.getFilesDir();

        for(File f : filesDir.listFiles()){
            try {
                BufferedReader reader = new BufferedReader(new FileReader(f));

                String name = reader.readLine();
                String desc = reader.readLine();

                list.add(new Project(name, desc));

                reader.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

        return list;
    }

    static void storeProjects(ArrayList<Project> projects, Activity activity) {
        File filesDir = activity.getFilesDir();

        for(File f : filesDir.listFiles()){
            f.delete();
        }

        int i = 0;
        for(Project p : projects){
            File file = new File(filesDir, i + ".txt");

            try {
                FileWriter writer = new FileWriter(file);
                writer.write(p.project_name);
                writer.write('\n');
                writer.write(p.project_description);
                writer.write('\n');
                writer.close();
            }catch(IOException e){
                e.printStackTrace();
            }

            i++;
        }
    }
}
