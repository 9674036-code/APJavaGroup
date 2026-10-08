package Recipie;

public abstract class CookingPlan {
    String dish;
    protected CookingPlan(String d){
        this.dish=d;
    }
    abstract public String[] cook();
}
