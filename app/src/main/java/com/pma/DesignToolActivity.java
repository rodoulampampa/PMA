package com.pma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class DesignToolActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ArrayList<DesignTool> designTool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_tool);

        //Get the spinner from the xml.
        Spinner dropdown = findViewById(R.id.spinner2);

        //Create a list of items for the spinner.
        String[] items = new String[]{"Select", "Online Design Tools", "Design Tools with an application"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        dropdown.setAdapter(adapter);
        dropdown.setOnItemSelectedListener(this);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        designTool = new ArrayList<>();

        if (pos == 0) { }
        else if (pos == 1)
        {
            designTool.add(new DesignTool("<b>" + "1. Visual Paradigm <br/><br/>" + "</b>" +
                    "<b>" + "Visual Paradigm" + "</b>" + " (VP-UML) is a UML CASE Tool supporting UML 2, SysML and Business Process Modeling Notation (BRMN) from the Object Management Group (OMG)." +
                    "Visual Paradigm supports 14 types of diagrams: <br/><br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "1.Class Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "2.Use Case Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "3.Sequence Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "4.Communication Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "5.State Machine Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "6.Activity Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "7.Component Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "8. Deployment Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "9.Package Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "10.Object Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "11.Composite Structure Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "12.Profile Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "13.Timing Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "14.Interaction Overview Diagram <br/>",
                    "https://online.visual-paradigm.com/" ,
                    "https://www.visual-paradigm.com/download/"));
            designTool.add(new DesignTool("<b>" + "2. Creately <br/><br/>" + "</b>" +
                    "<b>" + "Creately" + "</b>" + " is diagramming and design software operated by Cinergix, Pty Ltd. It is a cloud-based diagram tool built on Adobe's Flex/Flash" +
                    "technologies and provides a visual communication platform for Virtual Communicating. It can be used to create infographics, flowcharts, Gantt charts, organisational charts," +
                    "website wireframes, UML designs, mind maps, circuit board designs, doodle art and many other diagram types. It features a drag-and-drop WYSIWYG interface and easy to use" +
                    "collaboration capabilities.<br/>" ,
                    "https://creately.com/" ,
                    "https://creately.com/creately-for-linux/"));
            designTool.add(new DesignTool("<b>" + "3. Gliffy <br/><br/>" + "</b>" +
                    "<b>" + "Gliffy" + "</b>" + " is software for diagramming via a HTML5 cloud-based app. It is used to create UML diagrams, floor plans, Venn diagrams, flowcharts" +
                    "and various other kinds of diagrams online. Gliffy diagrams can be shared with and edited by users in real time. The SaaS is supported in all modern web-browsers," +
                    "including Google Chrome, Firefox, Safari and Internet Explorer 9+.<br/>" ,
                    "https://www.gliffy.com/" ));
            designTool.add(new DesignTool("<b>" + "4. Lucidchart <br/><br/>" + "</b>" +
                    "<b>" + "Lucidchart" + "</b>" + " is a web-based proprietary platform that is used to allow users to collaborate on drawing, revising and sharing charts and diagrams." +
                    "It allows you to create effective and professional flowcharts, org charts, network diagrams, and other useful visuals to organize essential information, promote understanding," +
                    "and turn ideas into action <br/>" ,
                    "https://www.lucidchart.com/pages/" ,
                    "https://www.lucidchart.com/pages/lucidchart-for-android"));
            designTool.add(new DesignTool("<b>" + "5. SmartDraw <br/><br/>" + "</b>" +
                    "<b>" + "SmartDraw" + "</b>" + " is a diagram tool used to make flowcharts, organization charts, mind maps, project charts, and other business visuals." +
                    "SmartDraw has two versions: an online edition and a downloadable edition for Windows desktop.<br/>" ,
                    "https://www.smartdraw.com/" ,
                    "https://play.google.com/store/apps/details?id=ru.pulsar_ural.ceilings1c&hl=en"));
            designTool.add(new DesignTool("<b>" + "6. Cacoo <br/><br/>" + "</b>" +
                    "<b>" + "Cacoo" + "</b>" + " is web-based software for designing and drawing diagrams. Cacoo supports many types of diagrams: <br/><br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "1.AWS Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "2.Azure Diagram  <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "3.BPMN <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "4.Customer Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "5.Database <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "6.Fishbone Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "7.Flowchart <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "8.Gantt Chart <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "9.GCP Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "10.Kubernetes Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "11.Mind Map <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "12.Network Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "13.Office Layout <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "14.Org Chart <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "15.Pert Chart <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "16.Planning <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "17.Presentation <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "18.SWOT Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "19.UML Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "20.Wireframe <br/>" ,
                    "https://cacoo.com/" ));
            designTool.add(new DesignTool("<b>" + "7. yEd <br/><br/>" + "</b>" +
                    "<b>" + "yEd" + "</b>" + " is a general-purpose diagramming program with a multi-document interface. It is a cross-platform application written in Java that" +
                    "runs on Windows, Linux, Mac OS, and other platforms that support the Java Virtual Machine. yEd can be used to draw many different types of diagrams, including flowcharts," +
                    "network diagrams, UMLs, BPMN, mind maps, organization charts, and entity-relationship diagrams. yEd also allows the use of custom vector and raster graphics as diagram" +
                    "elements. yEd loads and saves diagrams from/to GraphML, an XML-based format. It can also print very large diagrams that span multiple pages.<br/>" ,
                    "https://www.yworks.com/yed-live/" ,
                    "https://www.yworks.com/products/yed/download"));
            designTool.add(new DesignTool("<b>" + "8. PlantUML <br/><br/>" + "</b>" +
                    "<b>" + "PlantUML" + "</b>" + " is an open-source tool allowing users to create UML diagrams from a plain text language. The language of PlantUML is an" +
                    "example of a Domain-specific language. It uses Graphviz software to lay out its diagrams. It has been used to allow blind students to work with UML. PlantUML also helps" +
                    "blind software engineers to design and read UML diagrams. <br/>" ,
                    "https://www.planttext.com/" ,
                    "https://play.google.com/store/apps/details?id=ru.gelin.android.plantuml&hl=en"));
            designTool.add(new DesignTool("<b>" + "9. StarUML <br/><br/>" + "</b>" +
                    "<b>" + "StarUML" + "</b>" + " is a UML tool by MKLab. The software was licensed under a modified version of GNU GPL until 2014, when a rewritten version 2.0.0" +
                    "was released for beta testing under a proprietary license. StarUML supports most of the diagram types specified in UML 2.0. It is currently missing timing and interaction" +
                    "overview diagrams. <br/>" ,
                    "http://staruml.io/" ,
                    "http://staruml.io/download"));
            designTool.add(new DesignTool("<b>" + "10. GenMyModel <br/><br/>" + "</b>" +
                    "<b>" + "GenMyModel" + "</b>" + " is the first free online UML tool with code generation features. GenMyModel supports the following diagrams: <br/><br/> " +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "1.Archimate Diagram 3.0 <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "2.BPMN Diagram 2 <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "3.Flowchart <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "4.DMN Diagram <br/>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;" + "5.UML Class Diagrams <br/>" +
                    "Or you can design your RDS (Radio Database System). <br/>",
                    "https://www.genmymodel.com/uml-online-tool"));
        }
        else if (pos == 2)
        {
            designTool.add(new DesignTool("<b>" + "1. E-draw Max <br/><br/>" + "</b>" +
                    "<b>" + "Edraw Max" + "</b>" + " is a 2D business technical diagramming software which help create flowcharts, organizational charts, mind map, network diagrams, floor plans, workflow diagrams," +
                    "business charts, and engineering diagrams. Edraw Max is a Visio-like diagramming tool. <br/>" ,
                    "https://www.edrawsoft.com/download-edrawmax.html"));
            designTool.add(new DesignTool("<b>" + "2. MagicDraw <br/><br/>" + "</b>" +
                    "<b>" + "MagicDraw" + "</b>" + " is a visual UML, SysML, BPMN, and UPDM modeling tool with team collaboration support. Designed for business analysts, software analysts, programmers," +
                    "and QA engineers, this dynamic and versatile development tool facilitates analysis and design of object oriented (OO) systems and databases. <br/>" ,
                    "https://www.magicdraw.com/main.php?ts=download_demo&cmd_go_to_login=1&menu=download_demo&back_cmd=cmd_show"));
            designTool.add(new DesignTool("<b>" + "3. CmapTools <br/><br/>" + "</b>" +
                    "<b>" + "CmapTools" + "</b>" + " is concept mapping software developed by the Florida Institute for Human and Machine Cognition (IHMC).It allows users to easily create graphical nodes" +
                    "representing concepts, and to connect nodes using lines and linking words to form a network of interrelated propositions that represent knowledge of a topic." +
                    "The software has been used in classrooms and research labs, and in corporate training.<br/>" ,
                    "https://cmap.ihmc.us/cmaptools/cmaptools-download/"));
            designTool.add(new DesignTool("<b>" + "4. ConceptDrawDIAGRAM <br/><br/>" + "</b>" +
                    "<b>" + "ConceptDrawDIAGRAM" + "</b>" + " (previously known as ConceptDraw PRO) is proprietary diagramming software used to create business graphics, including: diagrams, flowcharts," +
                    "Infographics, data visualization for business process models, data presentation and project management documentation. It can also be used for creating professional" +
                    "and technical diagrams, such as: UML diagrams, DFD, ERD, computer networks topology, engineering schemes, floor plans, and other technical graphic formats. <br/>" ,
                    "https://www.conceptdraw.com/products/drawing-tool"));
        }

        ListView listView = findViewById(R.id.design_tools);
        listView.setAdapter(new DesignToolAdapter());
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // setup the alert builder
                AlertDialog.Builder builder = new AlertDialog.Builder(DesignToolActivity.this);
                builder.setTitle("Choose a link");

                final DesignTool clicked = designTool.get(position);

                // add a list
                builder.setItems(clicked.links, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String link = clicked.links[which];

                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(link));
                        startActivity(i);
                    }
                });

                // create and show the alert dialog
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) { }

    class DesignToolAdapter extends ArrayAdapter<DesignTool> {

        public DesignToolAdapter() {
            super(DesignToolActivity.this, R.layout.description_design_tools);
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, @NonNull ViewGroup parent) {
            View itemview = convertView;
            if (itemview == null) {
                itemview = DesignToolActivity.this.getLayoutInflater().inflate(R.layout.description_design_tools, parent, false);
            }


            TextView text1 = itemview.findViewById(R.id.text1);

            text1.setText(Html.fromHtml(designTool.get(position).description));

            return itemview;
        }

        @Override
        public int getCount(){
            return designTool.size();
        }
    }
}