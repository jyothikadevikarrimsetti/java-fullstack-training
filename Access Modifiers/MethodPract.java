public class MethodPract {
//    static void myMethod(String name,int age){
//        System.out.println("My name is:"+name+"\n "+"age is:"+age);
    static void myCheck(int age){
        if (age<21){
            System.out.println("Correct");
        }else {
            System.out.println("Wrong");
        }

    }

    public static void main(String[] args) {
        myCheck(20);
    }
}
