interface MyFunctionalInteface{
    void m1();
}

public class FunctionalInterfaceProgram {
    public static void main(String[] args) {
        MyFunctionalInteface functionalInteface = ()-> System.out.println("hii");
        functionalInteface.m1();

    }
}
