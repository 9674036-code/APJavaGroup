//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    static class Node {
        String storyText;
        Node option1;
        Node option2;

        public Node(String storyText, Node option1, Node option2){ //CONSTRUCTOR
            this.storyText = storyText;
            this.option1 = option1;
            this.option2 = option2;
        }

        public Node(String storyText) { //ENDING OF STORY
            this.storyText = storyText;
            this.option1 = null;
            this.option2 = null ;
        }

        public boolean isEnding() { //if boolean is ending is true, give the user no options to choose
            return option1 == null && option2 == null;
        }
    }

    //Recursive Method
    public static void storyGame(Node currentGame) {
        System.out.println("\n" + currentGame.storyText);

        if (currentGame.isEnding()) {
            System.out.println("\n---GAME OVER---"); //BASE CASE
            return; //this will stop the recursion
        }

        System.out.print("Choose option 1 or 2: ");
        String choice = scanner.nextLine(); //takes user input

        if(choice.equals("1")) {
            storyGame(currentGame.option1);
        } else if (choice.equals("2")) {
            storyGame(currentGame.option2);
        } else {
            System.out.println("NOT AN OPTION!");
            storyGame(currentGame);
        }

    }

    public static void main(String[] args) {
        //  All endings
        Node endPeaceful = new Node("Ending: Shares food go home fed with friend ");
        Node endPreyCaptured = new Node("Ending: You were mauled to death");
        Node endPreyEscaped = new Node("Ending: Enjoy a peaceful day");
        Node endPurpleBerry = new Node("Ending: prey captured go home fed");
        Node endTealBerry = new Node("Ending: prey runs away, you die hungry");
        Node endFriend = new Node("Ending: go home fed");
        Node endDefeated = new Node("Ending: you ate a poison berry, you died ");

        //  endings to Choice Nodes
        Node attackPrey = new Node("Do you (1) Attack now or (2) Wait", endPreyCaptured, endPreyEscaped);
        Node pickBerry = new Node("Do you eat (1) Purple berry or (2) Teal berry?", endPurpleBerry, endTealBerry);
        Node investigateSound = new Node("Do you (1) Befriend creature or (2) Attack?", endFriend, endDefeated);

        // the middle paths
        Node deeperWoods = new Node("Go deeper into the woods. Do you (1) Look for prey or (2) Look for berry?", attackPrey, pickBerry);
        Node runAway = new Node("You run away. Do you (1) Go Home or (2) Go deeper into the woods?", endPeaceful, deeperWoods);

        // starting node
        Node start = new Node("In woods and hear a twig snap. Do you (1) Run away or (2) Investigate?", runAway, investigateSound);

        // Start game
        storyGame(start);
    }
}