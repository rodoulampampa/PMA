package com.pma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
    static ArrayList<MyProject> projects;
    MyProfileAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_projects);

        projects = loadProjects(this);

        ListView listView = findViewById(R.id.projects_list);
        adapter = new MyProfileAdapter();
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                PopupMenu popup = new PopupMenu(MyProjectsActivity.this, view);
                popup.getMenu().add("Delete");
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        projects.remove(position);
                        storeProjects(projects, MyProjectsActivity.this);
                        projects = loadProjects(MyProjectsActivity.this);
                        adapter.notifyDataSetChanged();
                        return true;
                    }
                });
                popup.show();
            }
        });
    }

    final class MyProfileAdapter extends ArrayAdapter<MyProject> {

        public MyProfileAdapter() {
            super(MyProjectsActivity.this, R.layout.list_of_projects);
        }
        @NonNull
        @Override
        public View getView(int position, View convertView, @NonNull ViewGroup parent){
            View itemview = convertView;
            if(itemview == null){
                itemview = MyProjectsActivity.this.getLayoutInflater().inflate(R.layout.list_of_projects, parent, false);
            }

            TextView text1 = itemview.findViewById(R.id.project_name_tv);
            TextView text2 = itemview.findViewById(R.id.project_description_tv);

            text1.setText(projects.get(position).name);
            text2.setText(projects.get(position).description);

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

    static ArrayList<MyProject> loadProjects(Activity activity) {
        ArrayList<MyProject> list = new ArrayList<>();

        File filesDir = activity.getFilesDir();

        for(File f : filesDir.listFiles()){
            try {
                BufferedReader reader = new BufferedReader(new FileReader(f));

                String name = reader.readLine();
                String desc = reader.readLine();

                list.add(new MyProject(name, desc));

                reader.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return list;
    }

    static void storeProjects(ArrayList<MyProject> projects, Activity activity) {
        File filesDir = activity.getFilesDir();

        for(File f : filesDir.listFiles()){
            f.delete();
        }

        int i = 0;
        for(MyProject p : projects){
            File file = new File(filesDir, i + ".txt");

            try {
                FileWriter writer = new FileWriter(file);
                writer.write(p.name);
                writer.write('\n');
                writer.write(p.description);
                writer.write('\n');
                writer.close();
            }catch(IOException e){
                e.printStackTrace();
            }

            i++;
        }
    }
}