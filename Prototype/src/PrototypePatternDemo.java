//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrototypePatternDemo {
    public static void main(String[] args) {
        CacheShape.loadCache();
        Shape rectangle = CacheShape.getShape("1");
        rectangle.draw();
        System.out.println("type:" + rectangle.getType());

        Shape square = CacheShape.getShape("2");
        square.draw();
        System.out.println("type:" + square.getType());

        Shape circle = CacheShape.getShape("3");
        circle.draw();
        System.out.println("type:" + circle.getType());
    }
}