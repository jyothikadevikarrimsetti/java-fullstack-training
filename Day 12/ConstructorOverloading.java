public class ConstructorOverloading {
     static int plusMethodInt(int x , int y){
         return x+y;
    }
    static double plusMethodDouble(double x, double y){
         return x+y;
    }
    public static void main(String args[]){
         int mynum1 = plusMethodInt(8,10);
         double mynum2 = plusMethodDouble(4.6,5.2);
        System.out.println("int:"+mynum1);
        System.out.println("double:"+mynum2);
    }
}
