public class TernaryOperator {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        boolean bol = n1>n2? true:false;
        System.out.println(bol);
        int n3 = 40;
        String result = (n3>80)? "positive":"non positive";
        System.out.println(result);
        String res = (n3%3==0)?"even":"odd";
        System.out.println(res);
        int age = 18;
        String eligble = (age>=18)?"eligible":"not eligible";
        System.out.println(eligble);
        int n4= n1>n2&&n1>n3?n2>n3?n1:n2:n3;
        System.out.println(n4);
    }
}
