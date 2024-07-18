interface MyInterface{
    void myMethod();
}
public class LambdaFunctionExample {
    public static void main(String[] args) {
        MyInterface myInterface = ()->{
            System.out.println("jyo");
        };
        myInterface.myMethod();
    }

}
