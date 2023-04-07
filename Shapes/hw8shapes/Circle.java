package hw8shapes;

public class Circle implements Shape {
    private String name="Circle";

    public shapePoint getCentrePoint() {
        return centrePoint;
    }

    public void setCentrePoint(shapePoint centrePoint) {
        this.centrePoint = centrePoint;
    }

    private shapePoint centrePoint;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;
    @Override
    public String getName() {
        return name;
    }
}
