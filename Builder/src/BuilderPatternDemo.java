//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        System.out.println("Veg Burger Meal");
        Meal meal = mealBuilder.prepareVegMeal();
        meal.showItems();
        System.out.println("Total Money:" + meal.getTotal());

        System.out.println("Non Veg Burger Meal");
        meal = mealBuilder.prepareNonVegMeal();
        meal.showItems();
        System.out.println("Total Money:" + meal.getTotal());

        System.out.println("Custom Burger Meal");
        meal =  mealBuilder.prepareCustomMeal();
        meal.showItems();
        System.out.println("Total Money:" + meal.getTotal());
    }
}