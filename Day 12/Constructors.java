//public class Constructors {
//    public static <Private> void main(String args[]){
//        String name;
//        int age;
//        Person(); {
//            name = "raju";
//            age = 29;
//        }
//        void talk;()
//            System.out.println("hello iam"+name);
//            System.out.println("My age is"+age);
//        }
//    }
//    class details();
//    {
//        person Raju = new person();
//        Raju.talk();
//        Person sitha = new Person();
//        sitha.talk();
//    }
//
//    private static void Person() {
//    }
//}
class person{
    private String name;
    private int age;
    person(){
        name ="raji";
        age =29;
    }
    void talk(){
        System.out.println("hi iam" +name);
        System.out.println("my ade is" +age);
    }
}
class details
{
    public static void main(String args[]){
        person raju =new person();
        raju.talk();
        person sitha = new person();
        sitha.talk();
    }
}
