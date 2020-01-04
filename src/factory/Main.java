package factory;

public class Main {

    public static void main(String[] args) {
        Shape c = ShapeFactory.createShape(ShapeTypes.CIRCLE);
        c.draw();

        Shape t = ShapeFactory.createShape(ShapeTypes.TRIANGLE);
        t.draw();

        Shape r = ShapeFactory.createShape(ShapeTypes.RECTANGLE);
        r.draw();
    }
}
