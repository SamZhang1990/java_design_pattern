public class VegBurger extends Burger{
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public Packing packing() {
        return super.packing();
    }

    @Override
    public float price() {
        return 25.2f;
    }
}
