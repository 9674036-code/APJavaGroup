import java.util.Stack;
public class Main {
    public static void main(String[] args) {

        Stack<String> undoHistory = new  Stack<String>();

        undoHistory.push("Type Title");
        undoHistory.push("Insert Image");
        undoHistory.push("Change Color");


        System.out.println("Stack: " + undoHistory);
        System.out.println("Top item: " + undoHistory.peek());

        System.out.println("Undo: " + undoHistory.pop());

        if(!undoHistory.empty()) {
            undoHistory.pop();


        }

        System.out.println("LIFO fits because the most recent action is undone first.");

    }
}