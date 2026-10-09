package Recipe;

public class OvenPlan extends CookingPlan{
    public String plan;
    public int temp=20;
    public OvenPlan(String dish){
        super(dish);
        plan = "Prepare the oven and baking dish.\nPlace " +dish+ " in the baking dish.\n";
    }
    public String cook () {
        return plan+"Cook for "+intTemp.get(dish)/temp+" minutes at 275 F.";
    } 
}
