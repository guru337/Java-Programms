//has-a-relationship//composition
class Engine{
    static{
        System.out.println("engine started");
    }
}
public class Car{
    static{
        System.out.println("Static comment, Always printed ");
        System.out.println();
    }
    static int r;
    static String name;
    float f=90;
    public static void main(String[] args) {
        System.out.println("Before creating Engine object");
        Engine e=new Engine();
        System.out.println("Post creating engine object");
    }
}
