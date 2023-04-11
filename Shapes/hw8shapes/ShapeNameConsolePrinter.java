package hw8shapes;

public class ShapeNameConsolePrinter implements ShapeNamePrinter{
    @Override
    public void printShapeName(Shape shape) {
        System.out.println("Print name of \"" +
        shape.getName()+ "\" to  console, from ShapeNameConsolePrinter method");
    }
}
