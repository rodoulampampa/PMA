package com.pma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class ProjectNameActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ArrayList<ProjectName> projectName;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_name);

        //Get the spinner from the xml.
        Spinner dropdown = findViewById(R.id.spinner1);

        //Create a list of items for the spinner.
        String[] items = new String[]{"Select Category:", "Games", "Auto & Vehicles", "Beauty", "Art & Design", "Music & Audio", "Family", "Disabled", "Communication", "Shopping",
                "Entertainment", "Photography", "Augmented Reality", "Business", "Books & References", "Events", "Food", "Pets"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        dropdown.setAdapter(adapter);
        dropdown.setOnItemSelectedListener(this);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        projectName = new ArrayList<>();

        if (pos == 0) { }
        else if (pos == 1) {
            projectName.add(new ProjectName("Cafe Panic" ));
            projectName.add(new ProjectName("Heart’s Medicine" ));
            projectName.add(new ProjectName("Baker Business" ));
            projectName.add(new ProjectName("Castle Story" ));
            projectName.add(new ProjectName("ColorPlanet" ));
            projectName.add(new ProjectName("Kitchen Craze" ));
            projectName.add(new ProjectName("Atomas" ));
            projectName.add(new ProjectName("Cooking Crush" ));
            projectName.add(new ProjectName("Best Friends" ));
            projectName.add(new ProjectName("Home Designer" ));
            projectName.add(new ProjectName("FarmVille" ));
            projectName.add(new ProjectName("Township" ));
            projectName.add(new ProjectName("Bottle Flip" ));
            projectName.add(new ProjectName("Sweet House" ));
            projectName.add(new ProjectName("Shopping Mall" ));
            projectName.add(new ProjectName("Paradise Island" ));
            projectName.add(new ProjectName("Coin Master" ));
            projectName.add(new ProjectName("Music Play" ));
            projectName.add(new ProjectName("Kings & Queens" ));
        }
        else if (pos == 2) {
            projectName.add(new ProjectName("Smart Car" ));
            projectName.add(new ProjectName("My Car " ));
            projectName.add(new ProjectName("Total Car Check" ));
            projectName.add(new ProjectName("Simply Auto" ));
            projectName.add(new ProjectName("Automate" ));
            projectName.add(new ProjectName("Car Problems" ));
            projectName.add(new ProjectName("Drivvo" ));
            projectName.add(new ProjectName("Drive me in" ));
            projectName.add(new ProjectName("Car Simulation" ));
            projectName.add(new ProjectName("Used Car" ));
            projectName.add(new ProjectName("Second Hand Cars" ));
            projectName.add(new ProjectName("AutoGuard" ));
            projectName.add(new ProjectName("Mister Auto" ));
            projectName.add(new ProjectName("Master Auto" ));
            projectName.add(new ProjectName("AutoUncle" ));
            projectName.add(new ProjectName("CarDiag" ));
            projectName.add(new ProjectName("Vehicle Smart" ));
            projectName.add(new ProjectName("Car Management" ));
            projectName.add(new ProjectName("Car Service" ));
            projectName.add(new ProjectName("Cars & Trucks" ));
        }
        else if (pos == 3) {
            projectName.add(new ProjectName("Beauty Plus" ));
            projectName.add(new ProjectName("Virtual Beauty" ));
            projectName.add(new ProjectName("Clean Beauty" ));
            projectName.add(new ProjectName("Daily Beauty" ));
            projectName.add(new ProjectName("Bestie" ));
            projectName.add(new ProjectName("Chic" ));
            projectName.add(new ProjectName("Perfect Me" ));
            projectName.add(new ProjectName("Cute" ));
            projectName.add(new ProjectName("Pixl" ));
            projectName.add(new ProjectName("YesStyle" ));
            projectName.add(new ProjectName("Beauty Salon" ));
            projectName.add(new ProjectName("Frou Frou" ));
            projectName.add(new ProjectName("Kylie" ));
            projectName.add(new ProjectName("Beauty Idol" ));
            projectName.add(new ProjectName("Looks" ));
            projectName.add(new ProjectName("Boutiqaat" ));
            projectName.add(new ProjectName("Fresh" ));
            projectName.add(new ProjectName("Fresha" ));
            projectName.add(new ProjectName("Pictail" ));
        }
        else if (pos == 4) {
            projectName.add(new ProjectName("Smoke Art" ));
            projectName.add(new ProjectName("Paper Color" ));
            projectName.add(new ProjectName("Art Flow" ));
            projectName.add(new ProjectName("Post Maker" ));
            projectName.add(new ProjectName("Magic Poser" ));
            projectName.add(new ProjectName("Assemblr" ));
            projectName.add(new ProjectName("Smart Art" ));
            projectName.add(new ProjectName("Easy Draw" ));
            projectName.add(new ProjectName("Beautiful" ));
            projectName.add(new ProjectName("Vintage" ));
            projectName.add(new ProjectName("StoryArt" ));
            projectName.add(new ProjectName("PixelMaker" ));
            projectName.add(new ProjectName("Daily Art" ));
            projectName.add(new ProjectName("Nailbook" ));
            projectName.add(new ProjectName("Draw" ));
            projectName.add(new ProjectName("Border Design" ));
            projectName.add(new ProjectName("Text Art" ));
            projectName.add(new ProjectName("Concept Art" ));
            projectName.add(new ProjectName("Canvas" ));
            projectName.add(new ProjectName("3D Drawing" ));
            projectName.add(new ProjectName("Art of Glow" ));
        }
        else if (pos == 5) {
            projectName.add(new ProjectName("Smart Music" ));
            projectName.add(new ProjectName("Piano Kids" ));
            projectName.add(new ProjectName("Real Piano" ));
            projectName.add(new ProjectName("Dream Piano" ));
            projectName.add(new ProjectName("Magic Twist" ));
            projectName.add(new ProjectName("Harmonium" ));
            projectName.add(new ProjectName("Dynamix" ));
            projectName.add(new ProjectName("Incredibox" ));
            projectName.add(new ProjectName("One more line" ));
            projectName.add(new ProjectName("The mask singer" ));
            projectName.add(new ProjectName("Dancing Road" ));
            projectName.add(new ProjectName("DEEMO" ));
            projectName.add(new ProjectName("Singing Monsters" ));
            projectName.add(new ProjectName("Music Trainer" ));
            projectName.add(new ProjectName("Just Dance" ));
            projectName.add(new ProjectName("Smart Dance" ));
            projectName.add(new ProjectName("Super Sound" ));
            projectName.add(new ProjectName("Waves" ));
            projectName.add(new ProjectName("Wave Sound" ));
            projectName.add(new ProjectName("Go music" ));
        }
        else if (pos == 6) {
            projectName.add(new ProjectName("Family Organizer" ));
            projectName.add(new ProjectName("Family Island" ));
            projectName.add(new ProjectName("Family Hotel" ));
            projectName.add(new ProjectName("Virtual Family" ));
            projectName.add(new ProjectName("Virtual Mother" ));
            projectName.add(new ProjectName("Family House" ));
            projectName.add(new ProjectName("Family Zoo" ));
            projectName.add(new ProjectName("Family Locator" ));
            projectName.add(new ProjectName("We together" ));
            projectName.add(new ProjectName("Family Matters" ));
            projectName.add(new ProjectName("Dream Family" ));
            projectName.add(new ProjectName("My Family" ));
            projectName.add(new ProjectName("Be Closer" ));
            projectName.add(new ProjectName("Family Tree" ));
            projectName.add(new ProjectName("Family Gatherings " ));
            projectName.add(new ProjectName("Super Dad" ));
            projectName.add(new ProjectName("Happy Family" ));
        }
        else if (pos == 7) {
            projectName.add(new ProjectName("Living with Disability" ));
            projectName.add(new ProjectName("Personal Assistant" ));
            projectName.add(new ProjectName("Wheelchair Exercises" ));
            projectName.add(new ProjectName("Autism" ));
            projectName.add(new ProjectName("HelpTalk" ));
            projectName.add(new ProjectName("LetMeTalk" ));
            projectName.add(new ProjectName("HelpMeTalk" ));
            projectName.add(new ProjectName("Disability Knowledge " ));
            projectName.add(new ProjectName("Speech Therapy" ));
            projectName.add(new ProjectName("WheelMate" ));
            projectName.add(new ProjectName("EasyMove" ));
            projectName.add(new ProjectName("DISability" ));
            projectName.add(new ProjectName("Brain Fitness" ));
            projectName.add(new ProjectName("Handiplanet" ));
            projectName.add(new ProjectName("Symbo Talk" ));
            projectName.add(new ProjectName("Accessibility Suite" ));
            projectName.add(new ProjectName("Wheel Guide" ));
            projectName.add(new ProjectName("Right Hear" ));
            projectName.add(new ProjectName("Recover Brain" ));
            projectName.add(new ProjectName("TalkinPictures" ));
        }
        else if (pos == 8) {
            projectName.add(new ProjectName("Walkie-talkie" ));
            projectName.add(new ProjectName("BizChat" ));
            projectName.add(new ProjectName("Professional Communication" ));
            projectName.add(new ProjectName("JABtalk" ));
            projectName.add(new ProjectName("Satellite" ));
            projectName.add(new ProjectName("LINE" ));
            projectName.add(new ProjectName("IC (International Communication)" ));
            projectName.add(new ProjectName("Discord" ));
            projectName.add(new ProjectName("Kik" ));
            projectName.add(new ProjectName("twinme" ));
            projectName.add(new ProjectName("SOMA" ));
            projectName.add(new ProjectName("Connector" ));
            projectName.add(new ProjectName("Opentalk" ));
            projectName.add(new ProjectName("Talkie" ));
            projectName.add(new ProjectName("LetMeTalk" ));
            projectName.add(new ProjectName("JustTalk" ));
            projectName.add(new ProjectName("FiberTalk" ));
            projectName.add(new ProjectName("Telegram" ));
            projectName.add(new ProjectName("Group me" ));
            projectName.add(new ProjectName("KakaoTalk" ));
            projectName.add(new ProjectName("OnOff" ));
        }
        else if (pos == 9 ) {
            projectName.add(new ProjectName("Crazy Shopping" ));
            projectName.add(new ProjectName("Smart Shopping" ));
            projectName.add(new ProjectName("We love fashion" ));
            projectName.add(new ProjectName("Roomin" ));
            projectName.add(new ProjectName("Geek" ));
            projectName.add(new ProjectName("New Look" ));
            projectName.add(new ProjectName("Smart Market" ));
            projectName.add(new ProjectName("MarketPlace" ));
            projectName.add(new ProjectName("Dresslily" ));
            projectName.add(new ProjectName("Shopping Spree" ));
            projectName.add(new ProjectName("Best Brands" ));
            projectName.add(new ProjectName("Chic to Chip" ));
            projectName.add(new ProjectName("Fashion Days" ));
            projectName.add(new ProjectName("New Chic" ));
            projectName.add(new ProjectName("ICONIC" ));
            projectName.add(new ProjectName("Idle Shopping" ));
            projectName.add(new ProjectName("Stop Fashion" ));
            projectName.add(new ProjectName("Deals" ));
            projectName.add(new ProjectName("Wanna" ));
            projectName.add(new ProjectName("Bella" ));
            projectName.add(new ProjectName("Butterfly" ));
            projectName.add(new ProjectName("Fingo" ));
        }
        else if (pos == 10) {
            projectName.add(new ProjectName("Just Watch" ));
            projectName.add(new ProjectName("Smart Watch" ));
            projectName.add(new ProjectName("YuppTV" ));
            projectName.add(new ProjectName("Wipi" ));
            projectName.add(new ProjectName("Aloha" ));
            projectName.add(new ProjectName("OK" ));
            projectName.add(new ProjectName("ivi" ));
            projectName.add(new ProjectName("Bongo" ));
            projectName.add(new ProjectName("Artisto" ));
            projectName.add(new ProjectName("TV go" ));
            projectName.add(new ProjectName("Smart TV" ));
            projectName.add(new ProjectName("Kous kous" ));
            projectName.add(new ProjectName("Tiki Tiki" ));
            projectName.add(new ProjectName("WeTV" ));
            projectName.add(new ProjectName("Viki" ));
            projectName.add(new ProjectName("Youku" ));
            projectName.add(new ProjectName("Reddit" ));
            projectName.add(new ProjectName("Genius" ));
            projectName.add(new ProjectName("Telly" ));
            projectName.add(new ProjectName("Ipla" ));
            projectName.add(new ProjectName("Tell me" ));
            projectName.add(new ProjectName("Perfect Player" ));
            projectName.add(new ProjectName("Football TV" ));
        }
        else if (pos == 11) {
            projectName.add(new ProjectName("Photo Editor" ));
            projectName.add(new ProjectName("Photography Lomo Art" ));
            projectName.add(new ProjectName("Agora" ));
            projectName.add(new ProjectName("GuruShots" ));
            projectName.add(new ProjectName("LightRoom" ));
            projectName.add(new ProjectName("ViewBug" ));
            projectName.add(new ProjectName("Photographer’s Companion" ));
            projectName.add(new ProjectName("Photo Studio" ));
            projectName.add(new ProjectName("Snapseed" ));
            projectName.add(new ProjectName("PhotoDirector" ));
            projectName.add(new ProjectName("Photo Lab" ));
            projectName.add(new ProjectName("AirBrush" ));
            projectName.add(new ProjectName("Mirror Lab" ));
            projectName.add(new ProjectName("Learn Photography" ));
            projectName.add(new ProjectName("PicLab" ));
            projectName.add(new ProjectName("EyeEm" ));
            projectName.add(new ProjectName("Selfix" ));
            projectName.add(new ProjectName("LightX" ));
            projectName.add(new ProjectName("Kooky" ));
            projectName.add(new ProjectName("Toolwiz" ));
            projectName.add(new ProjectName("Camrilla" ));
            projectName.add(new ProjectName("Artful" ));
            projectName.add(new ProjectName("Graphionica" ));
            projectName.add(new ProjectName("LALALAB" ));
            projectName.add(new ProjectName("Chroma Lab" ));
        }
        else if (pos == 12) {
            projectName.add(new ProjectName("Smart House" ));
            projectName.add(new ProjectName("Houzz" ));
            projectName.add(new ProjectName("Snaappy" ));
            projectName.add(new ProjectName("Sketchfab" ));
            projectName.add(new ProjectName("Augmented Car" ));
            projectName.add(new ProjectName("AR Photography" ));
            projectName.add(new ProjectName("Find My Car" ));
            projectName.add(new ProjectName("3DTuning" ));
            projectName.add(new ProjectName("Helicopter AR" ));
            projectName.add(new ProjectName("Shooter AR" ));
            projectName.add(new ProjectName("AR Park" ));
            projectName.add(new ProjectName("AR Ruler" ));
            projectName.add(new ProjectName("Dinosaur AR" ));
            projectName.add(new ProjectName("Digital Magic" ));
            projectName.add(new ProjectName("Paint Draw AR" ));
            projectName.add(new ProjectName("Reality Crash" ));
            projectName.add(new ProjectName("AR Real Animals" ));
            projectName.add(new ProjectName("AR Market" ));
            projectName.add(new ProjectName("UniteAR" ));
            projectName.add(new ProjectName("Menu AR" ));
            projectName.add(new ProjectName("AR Sensor" ));
        }
        else if (pos == 13) {
            projectName.add(new ProjectName("Business Strategy " ));
            projectName.add(new ProjectName("Business Board" ));
            projectName.add(new ProjectName("My Business" ));
            projectName.add(new ProjectName("Business Tasks" ));
            projectName.add(new ProjectName("Shopify" ));
            projectName.add(new ProjectName("Business Ideas" ));
            projectName.add(new ProjectName("Business Manager" ));
            projectName.add(new ProjectName("Business Management" ));
            projectName.add(new ProjectName("Entrepreneurs" ));
            projectName.add(new ProjectName("B & M (Business and Marketing)" ));
            projectName.add(new ProjectName("Partners" ));
            projectName.add(new ProjectName("Startups" ));
            projectName.add(new ProjectName("Business Education" ));
            projectName.add(new ProjectName("Smart Business" ));
            projectName.add(new ProjectName("Start your Business" ));
            projectName.add(new ProjectName("CRM" ));
        }
        else if (pos == 14) {
            projectName.add(new ProjectName("InKitt" ));
            projectName.add(new ProjectName("Goodreads" ));
            projectName.add(new ProjectName("Bookmate" ));
            projectName.add(new ProjectName("eBoox" ));
            projectName.add(new ProjectName("Scribd" ));
            projectName.add(new ProjectName("ReadEra" ));
            projectName.add(new ProjectName("E-books" ));
            projectName.add(new ProjectName("Ebook Reader" ));
            projectName.add(new ProjectName("ThriftBooks" ));
            projectName.add(new ProjectName("Epic" ));
            projectName.add(new ProjectName("eReader" ));
            projectName.add(new ProjectName("PocketBook" ));
            projectName.add(new ProjectName("SABA reader" ));
            projectName.add(new ProjectName("Book Manager" ));
            projectName.add(new ProjectName("Skoobe" ));
            projectName.add(new ProjectName("OverDrive" ));
            projectName.add(new ProjectName("Moon+ Reader" ));
            projectName.add(new ProjectName("Blinkist" ));
            projectName.add(new ProjectName("iReader" ));
            projectName.add(new ProjectName("Librera" ));
            projectName.add(new ProjectName("BookBeat" ));
            projectName.add(new ProjectName("Dreame" ));
            projectName.add(new ProjectName("Bookshelf" ));
        }
        else if (pos == 15) {
            projectName.add(new ProjectName("Event Manager" ));
            projectName.add(new ProjectName("Event Planner" ));
            projectName.add(new ProjectName("Scheduling an Event" ));
            projectName.add(new ProjectName("Eventbrite" ));
            projectName.add(new ProjectName("Meetup" ));
            projectName.add(new ProjectName("Smart settlement" ));
            projectName.add(new ProjectName("Event Assistant" ));
            projectName.add(new ProjectName("Nearfy" ));
            projectName.add(new ProjectName("Event Organizer" ));
            projectName.add(new ProjectName("Event Guide" ));
            projectName.add(new ProjectName("Dance Events" ));
            projectName.add(new ProjectName("Day widget" ));
            projectName.add(new ProjectName("OnSchedule" ));
            projectName.add(new ProjectName("Schedule Assistant" ));
            projectName.add(new ProjectName("Dreamie Planner" ));
        }
        else if (pos == 16) {
            projectName.add(new ProjectName("Tasty" ));
            projectName.add(new ProjectName("Box" ));
            projectName.add(new ProjectName("Cookpad" ));
            projectName.add(new ProjectName("Yumm" ));
            projectName.add(new ProjectName("Fasting App" ));
            projectName.add(new ProjectName("Kitchen Stories" ));
            projectName.add(new ProjectName("Uber Eats" ));
            projectName.add(new ProjectName("Healthy Recipes" ));
            projectName.add(new ProjectName("Weight Loss Recipes" ));
            projectName.add(new ProjectName("Magic Fridge" ));
            projectName.add(new ProjectName("Deliveroo" ));
            projectName.add(new ProjectName("Cooking Mania" ));
            projectName.add(new ProjectName("Recipe Book" ));
            projectName.add(new ProjectName("Yum Recipes" ));
            projectName.add(new ProjectName("iEatBetter" ));
            projectName.add(new ProjectName("Food Diary" ));
            projectName.add(new ProjectName("My CookBook" ));
            projectName.add(new ProjectName("Hello Fresh" ));
            projectName.add(new ProjectName("Super Food" ));
            projectName.add(new ProjectName("Smart Eat" ));
            projectName.add(new ProjectName("Super Cook" ));
            projectName.add(new ProjectName("TheFork" ));
            projectName.add(new ProjectName("EasyOrder" ));
            projectName.add(new ProjectName("EasyDelivery" ));
            projectName.add(new ProjectName("FastDelivery" ));
        }
        else {
            projectName.add(new ProjectName("Pet Hotel" ));
            projectName.add(new ProjectName("Pet World" ));
            projectName.add(new ProjectName("Cat Hotel" ));
            projectName.add(new ProjectName("Dog Hotel" ));
            projectName.add(new ProjectName("Dog Town" ));
            projectName.add(new ProjectName("Family Zoo" ));
            projectName.add(new ProjectName("ZooCraft" ));
            projectName.add(new ProjectName("Real Pets" ));
            projectName.add(new ProjectName("Smart Pets" ));
            projectName.add(new ProjectName("Pet Shop" ));
            projectName.add(new ProjectName("Animal Forest " ));
            projectName.add(new ProjectName("Cat Simulator" ));
            projectName.add(new ProjectName("Dog Simulator" ));
            projectName.add(new ProjectName("Pet Paradise" ));
            projectName.add(new ProjectName("Pet Island" ));
            projectName.add(new ProjectName("Pet Idle" ));
            projectName.add(new ProjectName("Animal Hospital" ));
            projectName.add(new ProjectName("Zoo mania" ));
            projectName.add(new ProjectName("Paws In Style" ));
            projectName.add(new ProjectName("Dr. Cares" ));
            projectName.add(new ProjectName("Pet Clinic" ));
            projectName.add(new ProjectName("Animal Rescue" ));
        }

        ListView listView = findViewById(R.id.category_names);
        listView.setAdapter(new ProjectNameAdapter());

    }
    public void onNothingSelected(AdapterView<?> parent) {}

    class ProjectNameAdapter extends ArrayAdapter<ProjectName> {

        public ProjectNameAdapter() {
            super(ProjectNameActivity.this, R.layout.add_to_my_project);
        }
        @NonNull
        @Override
        public View getView(int position, View convertView, @NonNull ViewGroup parent){
            View itemview = convertView;
            if(itemview == null){
                itemview = ProjectNameActivity.this.getLayoutInflater().inflate(R.layout.add_to_my_project, parent, false);
            }


            TextView text1 = itemview.findViewById(R.id.text1);

            text1.setText(projectName.get(position).name);

            return itemview;
        }

        @Override
        public int getCount(){ return projectName.size(); }
    }

    /** Called when the user taps the Floating Action Button*/
    public void add_a_project_name(View view) {

        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(ProjectNameActivity.this);
        builder.setTitle("Add a name:");

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();

    }
}