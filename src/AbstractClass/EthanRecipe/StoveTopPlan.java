package Recipe;

public class StoveTopPlan extends CookingPlan{
    public String plan;
    public int temp=10;
    public StoveTopPlan(String dish){
        super(dish);
        plan = "Prepare the stovetop and pan.\nPlace " +dish+ " in the pan with a little oil.\n";
    }
    public String cook () {
        return plan+"Cook for "+intTemp.get(dish)/temp+" minutes at the low end of medium high";
    } 
}
