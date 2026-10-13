package EthanRecipe;
import java.util.Scanner;
import java.util.ArrayList;
public class EthanRecipe{
    static Scanner input = new Scanner(System.in);
    static int ans;
    static String dish;
    static ArrayList<CookingPlan> wPlan = new ArrayList<>();
    public static void main(String[] args){
        wPlan.add(new StoveTopPlan("dish"));
        wPlan.add(new OvenPlan("dish"));
        wPlan.add(new CampingPlan("dish"));
        while (true){
            System.out.println("Choose a CookingPlan to cook dish: \n 0. Stovetop \n 1. Oven \n 2. Camping ");
            while (true){
                try {
                    ans=Integer.parseInt(input.nextLine());
                    if (ans < 0 || ans >2){
                        throw new NumberFormatException();
                    }
                    System.out.println("Choose a dish displayed or input on of your own: steak or bread");
                    dish=input.nextLine();
                    if (! wPlan.get(ans).intTemp.containsKey(dish)){
                        System.out.println("You are about to add the new dish "+ dish +", please input the input the final internal temperature of the dish in F as an integer: ");
                        wPlan.get(ans).intTemp.put(dish, Integer.parseInt(input.nextLine()));
                    }
                    wPlan.get(ans).dish=dish;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Input one of the displayed integers or a integer temperature");
                    System.out.println("Choose a CookingPlan to cook dish: \n 0. Stovetop \n 1. Oven \n 2. Camping ");
                }
            }
            System.out.println(wPlan.get(ans).cook());
            System.out.println("Would you like to cook another dish? (y/n): ");
            if (!input.nextLine().equals("y")){
                break;
            }
        }
        
    }
}
