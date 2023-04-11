package hw8shapes;

public class Ellipse implements Shape {
    private String name = "Элипс";
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "My name is \"" + getName()+"\"";
    }

}
