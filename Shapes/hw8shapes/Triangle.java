package hw8shapes;

public class Triangle  implements Shape{
    String name = "Triangle";
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "This is shape \" "+getName()+ '\"';
    }
}
