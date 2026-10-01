// Mo Spiegel | Basic web search functionality, with backward and forwards movement

import java.util.Stack;
import java.util.Scanner;
import java.util.ArrayList;

public class searchStack {
    public static void main(String[] args) {
        Stack<String> browsingHistory = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> trace = new ArrayList<>();
        ArrayList<String> opTrace = new ArrayList<>();
        
        System.out.println("Welcome to Internet Explorer (budget edition)!");

        while(true) {
            System.out.println("Input the name of a website you would like to go to, or enter 'z' to return to the previous page, or enter 'f' to go forward. Enter 'q' to quit.");
            String input = scanner.nextLine();
            if(input.equals("z")) {
                if(browsingHistory.size() > 1) {
                    browsingHistory.pop();
                    trace.add(browsingHistory.peek());
                    opTrace.add("z");
                } else {
                    System.out.println("No website to return to.");
                    System.out.println("");
                } 
            } else if (input.equals("f")) {
                if(opTrace.get(opTrace.size()-1).equals("z")) {
                    browsingHistory.push(trace.get(trace.size()-2));
                    opTrace.add("f");
                    trace.add(trace.get(trace.size()-2));
                } else {
                    System.out.println("No website to go forward to.");
                    System.out.println("");
                }
            } else if (input.equals("q")) {
                System.out.println("");
                break;
            } else {
                opTrace.add("search");
                trace.add(input);
                browsingHistory.push(input);
            }
            
            try {
                System.out.println("You are now at " + browsingHistory.peek() + ".");
            } catch(Exception e) {
                continue;
            }
            System.out.println("");
        }
        
        System.out.println("Current stack: " + browsingHistory);
        System.out.println("Stack trace: " + trace);
        System.out.println("User operation trace: " + opTrace);

        scanner.close();
    }
} 
