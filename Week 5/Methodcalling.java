public class Methodcalling {
   static void n1(){
        System.out.println("hii");  //inside we can write method
//        n1();
    }
    static String m2(){
        System.out.println("m2");
        return "1";
    }
    static int m3(){
        System.out.println(123);
        return 0;
    }

    public static void main(String[] args) {
        n1();   // we cannot write static method inside the static method
//        void n2(){
        String i = "m2";
        System.out.println(i);
        int n = 123;
        System.out.println(n);
//

//  }
}
    }
