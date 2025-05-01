import java.util.Hashtable;

public class CacheShape {
    private static Hashtable<String, Shape> hashtable = new Hashtable<>();

    public static Shape getShape(String shapeType) {
        Shape shape = hashtable.get(shapeType);
        return shape.clone();
    }

    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        hashtable.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("2");
        hashtable.put(square.getId(), square);

        Circle circle = new Circle();
        circle.setId("3");
        hashtable.put(circle.getId(), circle);
    }
}
