import java.util.Scanner;

public class RecipeApp {
    static Scanner scanner = new Scanner(System.in);

    public static void showPlan(CookingPlan plan) {
        String[] instructions = plan.cook();
        System.out.println(
            "Instructions: \n"
            + instructions[0] + "\n"
            + instructions[1] + "\n"
            + instructions[2] + "\n"
        );
    }
    public static void main(String[] args) {
        System.out.println("Input the name of the dish you are cooking:");
        String dishName = scanner.nextLine();
        CookingPlan plans[] = {
            new OvenPlan(dishName),
            new CampingPlan(dishName),
            new StovetopPlan(dishName)
        };

        while(true) {
            try {
                System.out.println("Input 1 for oven, 2 for camping/portable stove, 3 stovetop: ");
                int planInd = Integer.parseInt(scanner.nextLine());
                if(planInd != 1 && planInd != 2 && planInd != 3) {
                    System.out.println("Not a valid input.");
                } else {
                    showPlan(plans[planInd-1]);
                    break;
                }
            } catch(Exception e) {
                System.out.println("Not a valid input.");
            }
        }

    }
}
