class Privateclass1{
    private class Privateclass2{
        void m1(){

            System.out.println("Private class");
        }
    }
    public Privateclass2 createInstance(){
        return new Privateclass2();
    }
}
class Protected{

}
public class Privateandprotected {
//    private class Privateclass3{
//        void m1(){
//            System.out.println("Privated");
//        }
//    }

    public static void main(String[] args) {
        Privateandprotected p1 = new Privateandprotected();
//        p1.m1();
        Privateclass1 pr1 = new Privateclass1();
        System.out.println(pr1.createInstance());
    }
}
