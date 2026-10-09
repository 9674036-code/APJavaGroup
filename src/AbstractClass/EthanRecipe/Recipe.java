package Recipe;
import java.util.Scanner;
import java.util.ArrayList;
public class Recipe{
    static Scanner input = new Scanner(System.in);
    static int ans;
    static ArrayList<CookingPlan> wPlan = new ArrayList<>();
    public static void main(String[] args){
        wPlan.add(new StoveTopPlan("dish"));
        wPlan.add(new OvenPlan("dish"));
        wPlan.add(new CampingPlan("dish"));
        System.out.println("Choose a CookingPlan to cook dish: \n 0. Stovetop \n 1. Oven \n 2. Camping ");
        while (true){
            try {
                ans=Integer.parseInt(input.nextLine());
                if (ans < 0 || ans >2){
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("input one of the displayed integers ");
            }
        }
        System.out.println(wPlan.get(ans).cook());

        
    }
}
