
public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("veg Meal");
		vegMeal.showItems();
		System.out.println("Total cost: " + vegMeal.price());
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Non veg meal");
		nonVegMeal.showItems();
		System.out.println("Total cost: "+ nonVegMeal.price());
	}

}
