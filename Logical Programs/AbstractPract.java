abstract class shape{
    public abstract void show();
}
class Circle extends shape{
   public void show(){
        System.out.println("circle");
    }
}
class Rectangle extends shape{
    public void show(){
        System.out.println("rectangle");
    }
}
public class AbstractPract {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.show();
        Rectangle r1 = new Rectangle();
        r1.show();
    }
}
