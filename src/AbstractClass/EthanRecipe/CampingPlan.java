package Recipe;

public class CampingPlan extends CookingPlan{
    public String plan;
    public int temp=5;
    public CampingPlan(String dish){
        super(dish);
        plan = "Prepare the portable stove and pot.\nPlace " +dish+ " in the pot.\n";
    }
    public String cook () {
        return plan+"Cook for "+intTemp.get(dish)/temp+" minutes at the high end of medium";
    } 
}
