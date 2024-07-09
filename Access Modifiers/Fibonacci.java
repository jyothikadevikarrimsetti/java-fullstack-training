public class Fibonacci {
      int sum = 10;


    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= new Fibonacci().sum; i++ ){
            System.out.print(a+" ");
            int sum = a+b;
            a=b;
            b=sum;
        }
    }
}
