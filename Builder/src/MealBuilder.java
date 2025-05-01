public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItems(new VegBurger());
        meal.addItems(new Coke());
        return  meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItems(new NonVegBurger());
        meal.addItems(new Pepsi());
        return meal;
    }

    public Meal prepareCustomMeal() {
        Meal meal = new Meal();
        meal.addItems(new NonVegBurger());
        meal.addItems(new Coke());
        return meal;
    }
}
