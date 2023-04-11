package hw8shapes;

public class Quad implements Shape {


   private String name = "Quad";
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "This is a" +"\""+getName()+"\"";
    }
}
