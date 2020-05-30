package com.pma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TeamBuildingGameActivity extends AppCompatActivity {

    ArrayList<TeamBuildingGame> teamBuildingGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        teamBuildingGame = new ArrayList<>();
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "1. Game of Possibilities <br/><br/>" + "</b>" +
                "<b>" + "Time:" + "</b>" + " 5-6 minutes <br/><br/>" +
                "<b>" + "Number of Participants:" + "</b>" + "One or multiple small groups <br/><br/>" +
                "<b>" + "Tools Needed:" + "</b>" + "Any random objects <br/><br/>" +
                "<b>" + "Rules:" + "</b>" + "This is a great 5-minute team building game. Give an object to one person in each group. One at a time, someone has to go up in front of the group and demonstrate a use for" +
                "that object. The rest of the team must guess what the player is demonstrating. The demonstrator cannot speak, and demonstrations must be original, possibly wacky, ideas. <br/><br/>" +
                "<b>" + "Objective:" + "</b>" + "This team building exercise inspires creativity and individual innovation."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "2. Winner/Loser <br/><br/>" + "</b>" +
                "<b>" + "Time:" + "</b>" + "5-6 minutes<br/><br/>" +
                "<b>" + "Number of Participants:" + "</b>" + "Two or more people<br/><br/>" +
                "<b>" + "Tools Needed:" + "</b>" + "None<br/><br/>" +
                "<b>" + "Rules:" + "</b>" + "Partner A shares something negative that happened in their life with Partner B. It can be a personal or work-related memory, but it has to be true. Then Partner A discusses" +
                "the same experience again, but focuses only on the positive aspects. Partner B helps explore the silver lining of the bad experience. Afterward, they switch roles.<br/><br/>" +
                "<b>" + "Objective:" + "</b>" + "Participants discover how to reframe negative situations into learning experiences together."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "3. Purpose Mingle<br/><br/>" + "</b>" +
                "<b>" + "Time:" + "</b>" + "1 - 2 minutes<br/><br/>" +
                "<b>" + "Number of Participants:" + "</b>" + "Any<br/><br/>" +
                "<b>" + "Tools Needed:" + "</b>" + "None<br/><br/>" +
                "<b>" + "Rules:" + "</b>" + "This one is for those of you looking for a great indoor team building game that won't take up much time. Before a meeting, have each individual walk around and share what they" +
                "hope to contribute to the meeting with as many people as possible. If you want, offer a prize for the person who shares with the most people, and another for the person who successfully" +
                "contributes what they shared.<br/><br/>" +
                "<b>" + "Objective:" + "</b>" + "Improves meeting productivity and makes attendees think about how they're going to contribute, rather than just what they hope to get out of the meeting."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "4. Scavenger Hunt<br/><br/>" + "</b>" +
                "<b>" + "Time:" + "</b>" + "> 1 hour<br/><br/>" +
                "<b>" + "Number of Participants:" + "</b>" + "Two or more small groups<br/><br/>" +
                "<b>" + "Tools Needed:" + "</b>" + "Pen and Paper<br/><br/>" +
                "<b>" + "Rules:" + "</b>" + "Break the group into teams of two or more. Make a list of goofy tasks for each team to do as a group. Tasks can include taking a selfie with a stranger, taking a picture of a" +
                "building or object around the office, etc. Give the list to each team, along with a deadline by which they must complete all tasks. Whoever completes the most tasks the quickest, wins!" +
                "(You can even create your own point system according to task difficulty if you want!)<br/><br/>" +
                "<b>" + "Objective:" + "</b>" + "Great team bonding exercise that helps break up office cliques by encouraging people to work with colleagues from other teams, departments, or just social circles."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "5. Human Knot<br/><br/>" + "</b>" +
                "<b>" + "Time:" + "</b>" + "15 - 30 minutes<br/><br/>" +
                "<b>" + "Number of Participants:" + "</b>" + "8 - 20 people<br/><br/>" +
                "<b>" + "Tools Needed:" + "</b>" + "None<br/><br/>" +
                "<b>" + "Rules:" + "</b>" + "Have everyone stand in a circle facing each other, shoulder to shoulder. Instruct everyone to put their right hand out and grab a random hand of someone across from them." +
                "Then, tell them to put their left hand out and grab another random hand from a different person across the circle. Within a set time limit, the group needs to untangle the knot of arms" +
                "without releasing their hands. If the group is too large, make multiple smaller circles and have the separate groups compete.<br/><br/>" +
                "<b>" + "Objective:" + "</b>" + "This game for team building relies heavily on good communication and teamwork. It also results in a lot of great stories for the water cooler chat in the workplace."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "6. The Perfect Square<br/><br/>" + "</b>" +
                "<b>" + "Time:" + "</b>" + "15 - 30 minutes<br/><br/>" +
                "<b>" + "Number of Participants:" + "</b>" + "5 - 20 people<br/><br/>" +
                "<b>" + "Tools Needed:" + "</b>" + "Long piece of rope tied together and a blindfold for each person<br/><br/>" +
                "<b>" + "Rules:" + "</b>" + "Have your coworkers stand in a circle holding a piece of the rope. Then instruct everyone to put on their blindfold and set the rope on the floor. Have everyone take walk" +
                "a short distance away from the circle. Next, ask everyone to come back and try to form a square with the rope without removing their blindfolds. Set a time limit to make it more" +
                "competitive. To make it even more difficult, instruct some team members to stay silent.<br/><br/>" +
                "<b>" + "Objective:" + "</b>" + "Focuses on strong communication and leadership skills. By instructing some team members to be silent, this game also requires an element of trust across the team, allowing" +
                "team members to guide each other in the right direction."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "7. The Mine Field<br/><br/>" + "</b>" +
                "<b>" + "Time:" + "</b>" + "15 - 30 minutes<br/><br/>" +
                "<b>" + "Number of Participants:" + "</b>" + "4 - 10 people (even numbers)<br/><br/>" +
                "<b>" + "Tools Needed:" + "</b>" + "Various handheld objects, several blindfolds<br/><br/>" +
                "<b>" + "Rules:" + "</b>" + "Find an open space such as an empty parking lot or a park. Place the objects (cones, balls, bottles, etc.) sporadically across the open space. Have everyone pair up, and make" +
                "one person on from each pair put on the blindfold. The other person must lead their teammate from one side of the open space to the other without stepping on the objects — using only" +
                "the verbal instructions. The blindfolded person cannot speak at all. To make it more difficult, create specific routes the blindfolded team members must walk.<br/><br/>" +
                "<b>" + "Objective:" + "</b>" + "This game focuses on trust, communication, and effective listening. This activity makes a great team building beach game as well."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "8. The Egg Drop<br/><br/>" + "</b>" +
                "<b>" + "Time:" + "</b>" + "1 - 2 hours<br/><br/>" +
                "<b>" + "Number of Participants:" + "</b>" + "Two or more small groups<br/><br/>" +
                "<b>" + "Tools Needed:" + "</b>" + "Assorted office supplies<br/><br/>" +
                "<b>" + "Rules:" + "</b> "+ "Split everyone off into groups of three to five people and give each group an uncooked egg. Put all the office supplies in a pile. They have 15 to 30 minutes to use the" +
                "supplies to build a contraption around the egg that will keep the egg from breaking when dropped. Some suggestions for supplies are: tape, pencils, straws, plastic utensils," +
                "packing material, newspapers, rubber bands. Once time is up, drop each egg contraption from the second or third floor of your building and see which eggs survive the Eggpocalypse.<br/><br/>" +
                "<b>" + "Objective:" + "</b>" + "This classic team building game is an engaging (and messy) exercise. It uses teamwork and problem solving to bond team members. The more people the better, so this makes" +
                "for an \"eggcellent\" corporate team building game! Make sure you have an extra supply of eggs in case some break (ew!) during the construction process."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "9. The Barter Puzzle<br/><br/>" + "</b>" +
                "<b>" + "Time:" + "</b>" + "1 - 2 hours<br/><br/>" +
                "<b>" + "Number of Participants:" + "</b>" + "Four or more small groups<br/><br/>" +
                "<b>" + "Tools Needed:" + "</b>" + "Different jigsaw puzzles for each group<br/><br/>" +
                "<b>" + "Rules:" + "</b>" + "Have everyone break off into small, equal-sized groups. Give each group a different jigsaw puzzle with the same difficulty level. The goal is to see which group can complete" +
                "their jigsaw puzzle the fastest. However! Some pieces will be mixed around in other group's jigsaw puzzles. It's up to the team to come up with a way to get those pieces back — either" +
                "through negotiating, trading, exchanging team members, etc. Whatever they decide to do, they must decide as a group.<br/><br/>" +
                "<b>" + "Objective:" + "</b>" + "This activity will rely heavily on problem solving and leadership skills. Some team members might stand out and some might stand back, but it's important to remember that" +
                "the entire team must come to a consensus before a decision is made."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "10. Truth and Lies<br/><br/>" + "</b>" +
                "<b>" + "Time:" + "</b>" + "10 - 15 minutes<br/><br/>" +
                "<b>" + "Number of Participants:" + "</b>" + "Five or more people<br/><br/>" +
                "<b>" + "Tools Needed:" + "</b>" + "None<br/><br/>" +
                "<b>" + "Rules:" + "</b>" + "Sit everyone in a circle facing each other. Have each person come up with three facts about themselves and one lie. The lie should be realistic instead of extravagant." +
                "Go around the circle and have each person state the three facts and a lie in a random order, without revealing which is the lie. After someone shares, the others must guess which" +
                "is the lie.<br/><br/>" +
                "<b>" + "Objective:" + "</b>" + "This is a great ice breaker game, especially for new teams. Helps eliminate snap judgements of colleagues, and gives introverts an equal chance to share some facts about" +
                "themselves."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "11. Blind Drawing<br/><br/>" + "</b>" +
                "<b>" + "Time:" + "</b>" + "10 - 15 minutes<br/><br/>" +
                "<b>" + "Number of Participants:" + "</b>" + "Two or more people<br/><br/>" +
                "<b>" + "Tools Needed:" + "</b>" + "A picture, pen, and paper<br/><br/>" +
                "<b>" + "Rules:" + "</b>" + "Divide everyone into groups of two. Have the two individuals sitting back-to-back. Give one person the pen and paper and the other person the picture. The person with the" +
                "picture describes the picture to their teammate without actually saying what it is. For example, if the image is a worm in an apple, do not say, \"Draw an apple with a worm in it.\" " +
                "The person with the pen and paper draws what they think the picture depicts, based on the verbal description. Set a time limit for 10 - 15 minutes.<br/><br/>" +
                "<b>" + "Objective:" + "</b>" + "This is an activity that focuses on interpretation and communication. Once the drawing is finished, it's always interesting to see how the drawer interprets their partner's" +
                "description."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "12. This is Better Than That<br/><br/>" + "</b>" +
                "<b>" + "Time:" + "</b>" + "15 - 20 minutes<br/><br/>" +
                "<b>" + "Number of Participants:" + "</b>" + "Any<br/><br/>" +
                "<b>" + "Tools Needed:" + "</b>" + "Four or more objects<br/><br/>" +
                "<b>" + "Rules:" + "</b>" + "Pick four or more objects that are different (or the same objects that look different). Split all your participants into even teams. Describe a scenario where each team has to" +
                "solve a problem using only those objects. This can be anything from \"You're stranded on a desert island\" to \"You're saving the world from Godzilla!\" Have each team rank the objects" +
                "based on their usefulness in that specific scenario, along with their reasoning.<br/><br/>" +
                "<b>" + "Objective:" + "</b>" + "This exercise inspires team creativity in problem solving. The idea is to not make the scenarios too easy so it becomes obvious which objects are most useful."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "13. Back-to-Back Drawing<br/><br/>" + "</b>" +
                "<b>" + "For:" + "</b>" + "Communication Skills<br/><br/>" +
                "<b>" + "What you'll need:" + "</b>" + "Paper, pens/markers, printouts of simple line drawings or basic shapes.<br/><br/>" +
                "<b>" + "Instructions:" + "</b>" + "Split your group into pairs and have each pair sit back to back. One person gets a picture of a shape or simple image, and the other gets a piece of paper and pen." +
                "The person holding the picture gives verbal instructions to their partner on how to draw the shape or image they've been given (without simply telling them what the shape or" +
                "image is). After a set amount of time, have each set of partners compare their images and see which team drew the most accurate replica."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "14. Office Trivia<br/><br/>" + "</b>" +
                "<b>" + "For:" + "</b>" + "Team Bonding<br/><br/>" +
                "<b>" + "What you'll need:" + "</b>" + "20-25 trivia questions about your workplace<br/><br/>" +
                "<b>" + "Instructions:" + "</b>" + "Looking for a quick and easy team building activity? Come up with a series of questions specific to your workplace and test your team's knowledge. \"What color are" +
                "the kitchen tiles?\" \"How many people are in the IT department?\" \"How many windows are there in the entire office?\" \"What brand are the computer monitors?\" \"What month of" +
                "the year is most common for birthdays among our employees?\" This is a quick team building activity that tests how observant your team is."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "15. Marshmallow Spaghetti Tower<br/><br/>" + "</b>" +
                "<b>" + "For:" + "</b>" + "Creative Problem Solving & Collaboration Exercise<br/><br/>" +
                "<b>" + "What you'll need:" + "</b>" + "20 sticks of uncooked spaghetti, 1 roll of masking tape, 1 yard of string, and 1 marshmallow for every team.<br/><br/>" +
                "<b>" + "Instructions:" + "</b>" + "Using just these supplies, which team can build the tallest tower? The marshmallow has to be at the very top of the spaghetti tower, and the whole structure has to" +
                "stand on its own (that means no hands or other objects supporting it!) for five seconds."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "16. Community Service<br/><br/>" + "</b>" +
                "<b>" + "For:" + "</b>" + "Team Bonding & Icebreakers<br/><br/>" +
                "<b>" + "What you'll need:" + "</b>" + "A few hours out of the workday<br/><br/>" +
                "<b>" + "Instructions:" + "</b>" + "Participate in Adopt-a-Family programs during the holidays, organize a beach clean up, take on a community beautification project— find an activity that appeals" +
                "to your team or reflects your company values, get out of the office, and do some good for your community and your team."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "17. Masterpiece Murals<br/><br/>" + "</b>" +
                "<b>" + "For:" + "</b>" + "Team Bonding & Icebreakers<br/><br/>" +
                "<b>" + "What you'll need:" + "</b>" + "Pre-drawn canvases, paints and brushes, a drop cloth or tarp<br/><br/>" +
                "<b>" + "Instructions:" + "</b>" + "Give each member of your team a canvas and brush, and let everyone create a colorful masterpiece on their canvas. Once they're dry, they can be put together and" +
                "displayed in your office as a mural, or placed throughout your workspace."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "18. Campfire/Memory Wall<br/><br/>" + "</b>" +
                "<b>" + "For:" + "</b>" + "Team Bonding & Icebreakers<br/><br/>" +
                "<b>" + "What you'll need:" + "</b>" + "Post-It notes or a whiteboard<br/><br/>" +
                "<b>" + "Instructions:" + "</b>" + "Write a few general work-related topics on the whiteboard or on sticky notes posted to the wall: “My first day,” “Teamwork,” “Work travel,” etc. Gather your team" +
                "together and have everyone choose one of the topics and share a story from their time with your company to laugh and bond over shared experiences. Or, pass out sticky notes" +
                "and have everyone write down positive memories of working together or special team accomplishments. They can use words or pictures to record these memories. Then have everyone" +
                "share their memory and post it on the wall, forming a positive memory cloud."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "19. Plane Crash<br/><br/>" + "</b>" +
                "<b>" + "For:" + "</b>" + "Creative Problem Solving & Collaboration Skills<br/><br/>" +
                "<b>" + "What you'll need:" + "</b>" + "20-30 minutes<br/><br/>" +
                "<b>" + "Instructions:" + "</b>" + "Imagine this: the plane carrying your team has crashed on a desert island. Have your group work with 12 items from around the office that they think would be most" +
                "useful in their survival, ranking each item in order of importance. Alternatively, have individuals make their selections first and then have the group discuss and come to a" +
                "consensus. This game focuses on communication and negotiation skill building."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "20. Spider Web <br/><br/>" + "</b>" +
                "<b>" + "For:" + "</b>" + "Creative Problem Solving & Collaboration Exercise<br/><br/>" +
                "<b>" + "What You'll Need:" + "</b>" + "String and tape<br/><br/>" +
                "<b>" + "Instructions:" + "</b>" + "Tape two pieces of string across a doorway, one at about three-and-a-half feet and the other around five feet. This string is the poisonous spider web. Teams must" +
                "get all their members through the opening between the strings without touching it. Increase the difficulty by taping more pieces of string across the doorway."));
        teamBuildingGame.add(new TeamBuildingGame("<b>" + "21.Whose Office Is It, Anyway?<br/><br/>" + "</b>" +
                "<b>" + "For:" + "</b>" + "Team Bonding & Icebreakers<br/><br/>" +
                "<b>" + "What you'll need:" + "</b>" + "Internet connection, file sharing tool<br/><br/>" +
                "<b>" + "Instructions:" + "</b>" + "Have your team members send a photo of their home offices, and then have everyone guess whose workspace is whose. Keep the game going with photos of everyone's" +
                "coffee mugs, desktop backgrounds, or the view outside their window."));

        ListView listView = findViewById(R.id.game_list);
        listView.setAdapter(new TeamBuildingGameAdapter());
    }
    class TeamBuildingGameAdapter extends ArrayAdapter<TeamBuildingGame> {

        public TeamBuildingGameAdapter() {
            super(TeamBuildingGameActivity.this, R.layout.list_of_games);
        }
        @NonNull
        @Override
        public View getView(int position, View convertView, @NonNull ViewGroup parent){
            View itemview = convertView;
            if(itemview == null){
                itemview = TeamBuildingGameActivity.this.getLayoutInflater().inflate(R.layout.list_of_games, parent, false);
            }

            TextView Game_description = itemview.findViewById(R.id.Game_description);

            Game_description.setText(Html.fromHtml(teamBuildingGame.get(position).game));

            return itemview;
        }

        @Override
        public int getCount(){
            return teamBuildingGame.size();
        }
    }
}
