//class jdk{
//    private void jdk(){
////        void m1();
//        System.out.println("klkjj");
//    }
//    void m1(){
//        System.out.println("gjugufug");
//    }
//}
//class kjd extends jdk{
//    void kjd(){
//        System.out.println("jkuyu");
//    }
//    void m1(){
//        System.out.println("gugiugu");
//    }
//}
//public class Methods {
//    public static void main(String[] args) {
//        Methods mth = new Methods();
////        mth.m1();

abstract class Animation{
    abstract void Cartoon();    //abstract method
    void Motupatlu(){          //concrete method
        System.out.println("motu patlu");
    }
}
class naruto extends Animation{          //sub class
    void Cartoon(){
        System.out.println("narutoo");
    }
}
public class Methods {
    public static void main(String[] args) {
        naruto m1 = new naruto();
        m1.Motupatlu();

    }
}