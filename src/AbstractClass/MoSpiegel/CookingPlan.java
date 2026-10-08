package RecipeApp;

public abstract class CookingPlan {
    private String dishName;
    
    protected CookingPlan(String dishName) {
        this.dishName = dishName;
    }

    public String getDishName() {
        return(dishName);
    }

    public abstract String[] cook();
}
