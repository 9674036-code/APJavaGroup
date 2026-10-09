package APCSA.RecipeApp;

public class StovetopPlan extends CookingPlan {

    public StovetopPlan(String dishName) {
        super(dishName);
    }  

    public String[] cook() {
        String[] instructions = new String[3];
        instructions[0] = "Prepare the stovetop and pan.";
        instructions[1] = "Place " + getDishName() + " in the pan.";
        instructions[2] = "Cook using the recipe's stovetop instructions";
        return(instructions);
    }

}
