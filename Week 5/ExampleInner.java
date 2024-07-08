class Outer {
     static class Inner {
        void show() {
            System.out.println("Method outer class");
        }
//        class Inner1{
//            void show1(){
//                System.out.println("Outer class");
//            }
        }
    }

public class ExampleInner {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        in.show();
    }

}
