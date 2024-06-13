//public class Polymorphism {
//        static class one {
//            void caluculate(double x) {
//                System.out.println("square value=" + (x * x));
//            }
//        }
//        class two extends one {
//            void caluculate(double x) {
//                System.out.println("square root=" + Math.sqrt(x));
//            }
//        }
//            public static void main(String[] args) {
//                two t = new two();
//                t.caluculate(81);
//        }
//}
public class Polymorphism {
    public static void main(String[] args) {
        class one {
            void caluculate(double x) {
                System.out.println("square value=" + (x * x));
            }
        }
        class two extends one {
            void caluculate(double x) {
                System.out.println("square root=" + Math.sqrt(x));
            }
        }
        class poly {
            public static void main(String[] args) {
                two t = new two();
                t.caluculate(81);
            }
        }
    }
}