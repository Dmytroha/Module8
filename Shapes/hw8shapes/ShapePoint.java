package hw8shapes;

public class ShapePoint {

    public ShapePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ShapePoint() {
        this.x = 0;
        this.y = 0;
    }
                    // coordinates
    private int x;
    private int y;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

}
