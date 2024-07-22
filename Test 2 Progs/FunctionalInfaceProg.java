interface MyInterface1{
    void myMethod();
}
public class FunctionalInfaceProg {
    public static void main(String[] args) {
        MyInterface1 f1 = ()-> System.out.println("hello");
        f1.myMethod();

    }

}
