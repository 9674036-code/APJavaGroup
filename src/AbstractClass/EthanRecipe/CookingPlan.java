package EthanRecipe;
import java.util.HashMap;

public abstract class CookingPlan {
    String dish;
    static public HashMap<String, Integer> intTemp= new HashMap<>();

    protected CookingPlan(String dish){
        intTemp.put("steak",100);
        intTemp.put("bread",140);
        this.dish=dish;
    }
    abstract public String cook();
}
