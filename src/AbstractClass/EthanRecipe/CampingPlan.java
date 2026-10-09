package Recipe;
import java.util.HashMap;

public abstract class CookingPlan {
    String dish;
    static public HashMap<String, Integer> intTemp= new HashMap<>();

    protected CookingPlan(String dish){
        intTemp.put("dish",100);
        this.dish=dish;
    }
    abstract public String cook();
}
