public class MethodOverload {
    public double add(int x , double y){
        return x+y;
    }
    static double plusMethod(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
        System.out.println(plusMethod(2,4.9));
        double num2 = plusMethod(2.3,4.5);
//        System.out.println(num1);
        System.out.println(num2);
    }
}
