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



//            1 1
//            2 2
//            3 3
//            4 4
//            5 5
        }
//        String s = null;
//        System.out.println(s.length());
    }
}
