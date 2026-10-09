package APCSA.RecipeApp;

public class OvenPlan extends CookingPlan {

    public OvenPlan(String dishName) {
        super(dishName);
    }  

    public String[] cook() {
        String[] instructions = new String[3];
        instructions[0] = "Prepare the oven and baking dish.";
        instructions[1] = "Place " + getDishName() + " in the baking dish.";
        instructions[2] = "Bake using the recipe's oven instructions";
        return(instructions);
    }

}
