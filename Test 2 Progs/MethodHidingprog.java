public class MethodHidingprog {
    public void myMethod(){
        System.out.println("My method program1");
    }
}
 class MethodHidingprog1 extends MethodHidingprog {
     public void myMethod() {
         System.out.println("My method program2");
     }


     public static void main(String[] args) {
         MethodHidingprog1 methodHidingprog1 = new MethodHidingprog1();
         methodHidingprog1.myMethod();

     }
 }
