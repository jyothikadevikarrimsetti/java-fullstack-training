import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract void draw();
}
class Rectangle1 extends Shape {
    void draw() {
        System.out.println("Rectangle");
    }
}
    class Circle1 extends Shape {
        void draw() {
            System.out.println("Circle");
        }
    }

        class GenericTest{
            public static void drawShapes(List<? extends Shape> lists){
                for (Shape shape:lists){
                    shape.draw();
                }
            }


            public static void main(String[] args) {
                List<Rectangle1> list1 = new ArrayList<>();
                list1.add(new Rectangle1());

                List<Circle1> list2 = new ArrayList<>();
                list2.add(new Circle1());

                drawShapes(list1);
                drawShapes(list2);
            }
        }
    
