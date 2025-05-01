import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItems(Item item) {
        items.add(item);
    }

    public float getTotal() {
        float total = 0f;
        total = (float) items.stream().mapToDouble(Item::price).sum();
        return total;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("name:" + item.name() + ", packing:" + item.packing().pack() + ", price:" + item.price());
        }
    }

}
