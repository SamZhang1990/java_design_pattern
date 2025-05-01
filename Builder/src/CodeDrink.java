public abstract class CodeDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
