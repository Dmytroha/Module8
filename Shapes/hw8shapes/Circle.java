package hw8shapes;

public class Circle implements Shape {
    private String name="Circle";
    private ShapePoint centrePoint;
    private int radius;

    public Circle(ShapePoint centrePoint, int radius) {
        this.centrePoint = centrePoint;
        this.radius = radius;
    }

    //                setter & getter  for centrePoint
    public ShapePoint getCentrePoint() {
        return centrePoint;
    }
    public void setCentrePoint(ShapePoint centrePoint) {
        this.centrePoint = centrePoint;
    }
    //                setter & getter  for  radius
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    //           getter for    name  override from Shape
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return "I am a \""+ this.getName()+'\"';
    }
}
