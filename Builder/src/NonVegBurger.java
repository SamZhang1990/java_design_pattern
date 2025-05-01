public class NonVegBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public Packing packing() {
        return super.packing();
    }

    @Override
    public float price() {
        return 50.1f;
    }
}
