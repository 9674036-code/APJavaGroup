import java.util.Stack;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        Stack<String> browsingHistory = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> trace = new ArrayList<>();
        ArrayList<String> opTrace = new ArrayList<>();
        
        System.out.println("Welcome to Internet Explorer (budget edition)!");

        while(true) {
            System.out.println("Input the name of a website you would like to go to, or enter 'z' to return to the previous page, or enter 'f' to go forward. Enter 'q' to quit.");
            String input = scanner.nextLine();
            if(input == "z") {
                try {
                    trace.add(browsingHistory.pop());
                    opTrace.add("z");
                } catch(EmptyStackException e) {
                    System.out.println("No website to return to.");
                }
            } else if (input == "f") {
                if(opTrace.get(opTrace.size()-1) == "z") {
                    browsingHistory.push(trace.get(trace.size()-2));
                    opTrace.add("z");
                    trace.add(trace.get(trace.size()-2));
                } else {
                    System.out.println("No website to go forward to.");
                }
            } else if (input == "q") {
                break;
            } else {
                opTrace.add("search");
                trace.add(input);
                browsingHistory.push(input);
            }
            
            System.out.println("You are now at " + browsingHistory.peek() + ".");
            System.out.println("");
        }

        scanner.close();
    }
}