package com.pma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.pma.MyProjectsActivity.loadProjects;
import static com.pma.MyProjectsActivity.projects;
import static com.pma.MyProjectsActivity.storeProjects;


public class ProposedProjectsActivity extends AppCompatActivity {
    ArrayList<ProposedProject> proposedProjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proposed_projects);

        proposedProjects = new ArrayList<>();

        proposedProjects.add(new ProposedProject("Continuation of the development of export of responsibilities per unit in public sector organizations by the Government Gazette.",
                "The aim of this project is to expand the existing text mining code by the Government Gazette, with the addition of database support and the creation of an automatic detection system." +
                "The existing code contains Named Entity Recognition features that will allow the identification of public sector administrative units, addresses and departments with the responsibilities" +
                "assigned to them and the types of services they must provide in accordance with their institutional framework."));
        proposedProjects.add(new ProposedProject("Create a better user interface in LibreOffice and OpenOffice.", "The aim of this project is to customize the LibreOffice 6.0 user interface and create a better user interface for the average user. These are essentially the creation of add-ons in LibreOffice and OpenOffice, some of which are:" +
                "Simplify page number input, a function that is extremely difficult for the new user." + "Use automatic texts in parallel with the editing of the document." +
                "Change the interface of icons, toolbar and menu to achieve the same menu functionality as Microsoft Word."));
        proposedProjects.add(new ProposedProject("Development of an application for digitization of the collections and functions of the Byzantine Museum.", "The aim of this project is the overall, digital management of the collections and functions of the Byzantine Museum and the development of interactive cultural applications," +
                "for online access to the museum's collections of many different groups at the national and international level: general audience and audiences with special interests." +
                "(eg educational community, researchers and scientists, groups of visitors, families, tourists)."));
        proposedProjects.add(new ProposedProject("Developing an application that is going to help the user search for fellow travelers where they intend to go to the same destination.",
                "The purpose of this project is to help the user of the application to search for fellow traveler/ fellow travelers who wish to head to the same destination as the user of the application." +
                "The application will provide the user security in the selection of his fellow travelers and will be adapted to his needs."));
        proposedProjects.add(new ProposedProject("Development of a mobile application that detects diseases and ailments.", "The main goal of this project is to ensure human health and early diagnosis of possible diseases or illnesses that the user of the application may suffer. The user will place parts of his body" +
                "on mobile parts (such as the camera) and through special programs and sensors used in medical and microbiological laboratories the application will inform the user about the results of his" +
                "examination."));
        proposedProjects.add(new ProposedProject("Development of an application for mobile phones that makes the stops of public transport \"smarter\".",
                "The aim of this project is the smarter and more efficient management of public transport routes. The application will provide up-to-date traffic information, possible accidents or traffic jams" +
                "and allow passengers to perform daily tasks such as paying bills, sending parcels or filling out a phone."));
        proposedProjects.add(new ProposedProject("Development of application and support of online space for resale of products and services.",
                "The goal of this project is to create an application that is easy to use by the average user where it will be based on reselling products and services. By creating his own profile," +
                "the user will be given the opportunity to sell his own products that he no longer uses or to offer services. It will also be informed about the products and services announced" +
                "by other users of the application."));
        proposedProjects.add(new ProposedProject("Development of an application that is addressed to both professionals and individuals, who want to easily and quickly transfer their parcels from city to city and from country " +
                "to country.", "This is an application whose main purpose is to facilitate both senders and recipients of parcels sent from country to country and from city to city every day. The sender will be" +
                "able to monitor the progress of his parcel through application by any transport company.Through the application, the transport company will be able to offer offers on specific" +
                "itineraries. "));
        proposedProjects.add(new ProposedProject("Development of a mobile phone application for stress detection.",
                "The goal of this application is to improve people's living conditions. The main problem for most people due to the modern pace of life is stress. This application will be connected" +
                "wirelessly to vital signs that change when the person is stressed and when this happens will notify the user."));
        proposedProjects.add(new ProposedProject("Application development for people with disabilities.",
                "A disabled person will be able to use a map that will facilitate his movements, locate parking spaces in his city and enable him to report access problems. Citizens will be able to" +
                "contribute to the identification of the inaccessible parts of the city by making a report. Institutions such as banks, public services, schools, universities will also participate" +
                "in the overall project. They will have the opportunity to contact the disabled who will plan their arrival so that if there is no proper infrastructure, they can be welcomed by an" +
                "employee to help them access."));
        proposedProjects.add(new ProposedProject("Creating a website where student work is organized.",
                "The purpose of this project is to help students categorize and sort their work. The assignments of each student will be categorized according to the current courses and priority" +
                "will be given to these assignments. The user will receive reminder notifications in tasks that have not been delivered. When the teacher announces the grades of the delivered" +
                "assignments, they will be automatically integrated in the application and will diagrammatically represent his course in the assignments of his school."));
        proposedProjects.add(new ProposedProject("Application development for missing animals.",
                "The aim of this project is to inform citizens by area about missing animals or animals found on the road. Through the application, the user will be able to announce," +
                "depending on the area in which it is located, an animal (or more) that was found abandoned on the road and most likely the owner is looking for it. Also, any owner who has" +
                "lost their pet will have the opportunity to announce it through the application and help find it.Each user of the application will also see the announcements of the other users of" +
                "the application from any region of Greece."));
        proposedProjects.add(new ProposedProject("Develop an application that will allow you to locate bicycles according to the current location of the user.",
                "description 13The aim of this project is to protect the environment and make it easier for cyclists to find possible places where they could rent a bicycle." +
                "Depending on the location of the user, the application will suggest all the possible points where it is either for bicycle shops or for rent. In the case of bicycle rental," +
                "the application will inform him about the prices and the time priced by each store in the surrounding area."));
        proposedProjects.add(new ProposedProject("Creating a website for student career guidance.",
                "The main purpose of this project is to help students, especially of the school, to follow the right professional orientation according to their interests and preferences." +
                "It is a website where the user will enter some data concerning his interests and as a result he will be offered suggested professional fields that he could follow."));



        ListView listView = findViewById(R.id.project_list);
        listView.setAdapter(new ProposedProjectsAdapter());


    }

    class ProposedProjectsAdapter extends ArrayAdapter<ProposedProject> {

        public ProposedProjectsAdapter() {
            super(ProposedProjectsActivity.this, R.layout.add_to_my_projects);
        }
        @NonNull
        @Override
        public View getView(final int position, View convertView, @NonNull ViewGroup parent){
            View itemview = convertView;
            if(itemview == null){
                itemview = ProposedProjectsActivity.this.getLayoutInflater().inflate(R.layout.add_to_my_projects, parent, false);
            }

            TextView text1 = itemview.findViewById(R.id.project_name_tv_suggested);
            TextView text2 = itemview.findViewById(R.id.project_description_tv_suggested);

            text1.setText(proposedProjects.get(position).name);
            text2.setText(proposedProjects.get(position).description);

            Button addButton = itemview.findViewById(R.id.add_to_my_projects);
            addButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    proposedProjects.get(position);
                    projects = loadProjects(ProposedProjectsActivity.this);
                    MyProject newProject = new MyProject(proposedProjects.get(position).name, proposedProjects.get(position).description);
                    projects.add(newProject);
                    storeProjects(projects,ProposedProjectsActivity.this);

                    Toast.makeText(ProposedProjectsActivity.this, "Project Saved", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(ProposedProjectsActivity.this, MyProjectsActivity.class);
                    startActivity(intent);

                }
            });

            return itemview;
        }

        @Override
        public int getCount(){ return proposedProjects.size(); }
    }
}