public class MethodParameters {
//    static int x =10;
//    static int y = 5;

    static int add1(int x,int y) {
//        System.out.println(x+y);
        return x + y;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int c, int d) {
        return c*d;

    }
    static int div(int g, int h){
        return g/h;
    }

        public static void main (String[]args){
            int x=10;
            int y=5;
//        MethodParameters m1 = new MethodParameters();
            System.out.println(add1(x,y));
            System.out.println(sub(x,y));
            System.out.println(mul(x,y));
            System.out.println(div(x,y));
//            System.out.println(sub(50, 25));
//            System.out.println(mul(9,9));



        }
    }

