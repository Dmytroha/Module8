package hw8shapes;

public class Hexagon implements Shape {
    private String name="Hexagon";

    @Override
    public String toString(){
        return "Hi! I am a \""+ getName();
    }
    @Override
    public String getName(){
        return name;
    }
}
