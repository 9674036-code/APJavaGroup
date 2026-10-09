package APCSA.RecipeApp;

public class CampingPlan extends CookingPlan {

    public CampingPlan(String dishName) {
        super(dishName);
    }  

    public String[] cook() {
        String[] instructions = new String[3];
        instructions[0] = "Prepare the portable stove and camping pot.";
        instructions[1] = "Place " + getDishName() + " in the camping pot.";
        instructions[2] = "Cook using the recipe's portable-stove instructions";
        return(instructions);
    }

}
