//interface InterfaceLaptop {
//    void systems();
//}
//class lenovo implements InterfaceLaptop{
//    public void systems(){
//
//    }
//    public void quality(){
//    System.out.println("good quality");
//}
//class feature implements InterfaceLaptop{
//        public void systems(){
//
//        }
//}
//    public void performance(){
//        System.out.println("Good performance");
//    }
//
//}
//public class feature{
//    public static void main(String[] args) {
//        lenovo l1 = new lenovo();
//        l1.quality();
//        feature f1 = new feature();
//        f1.performance();
//    }
//}
//

interface pets{
    void sound();
}
class Buffalo implements pets {
    public void sound() {
        System.out.println("Woof");
    }
}
class Cow implements pets {
    public void sound() {
        System.out.println("Meow");
    }
}
public class InterfaceAnimal{
    public static void main(String[] args) {
        Buffalo d1 = new Buffalo();
        d1.sound();
        Cow c1 = new Cow();
        c1.sound();

    }
}