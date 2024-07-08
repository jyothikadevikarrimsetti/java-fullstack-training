//interface  Greeting{
//    void greet();
//
//}
class Maths{
    void addition(){
        System.out.println("Addition");
    }
}
public class AnonymousClassesProgs {
    public static void main(String[] args) {
        Maths maths = new Maths() {
            @Override
            public void addition() {
                System.out.println("hi hi hi");
            }
        };
        maths.addition();
    }
}
