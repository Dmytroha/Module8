package hw8shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle1=new Circle(new ShapePoint(10,5),18);
        System.out.println( circle1); // test toString method
        // use ShapeNameConsolePrinter
        (new ShapeNameConsolePrinter()).printShapeName((Shape) circle1);

        Quad quad1=new Quad();
        System.out.println( quad1); // test toString method
        (new ShapeNameConsolePrinter()).printShapeName((Shape) quad1);

        Triangle triangle1 = new Triangle();
        System.out.println( triangle1); // test toString method
        (new ShapeNameConsolePrinter()).printShapeName((Shape) triangle1);

        Ellipse ellipse1 = new Ellipse();
        System.out.println( ellipse1); // test toString method
        (new ShapeNameConsolePrinter()).printShapeName((Shape) ellipse1);

        Hexagon hexagon1 = new Hexagon();
        System.out.println(hexagon1); // test toString method
        (new ShapeNameConsolePrinter()).printShapeName((Shape) hexagon1);

    }
}
