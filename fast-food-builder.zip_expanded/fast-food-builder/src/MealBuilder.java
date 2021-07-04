import com.cognizant.builder.concrete.ChickenBurger;
import com.cognizant.builder.concrete.Coke;
import com.cognizant.builder.concrete.Pepsi;
import com.cognizant.builder.concrete.VegBurger;

public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
