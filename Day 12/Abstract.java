public class Abstract {
    public static void main(String args[]) {
        class Myabstract {
            void caluculate(double x) {
                System.out.println("Square =" + (x * x));
            }
        }
        class used {
            public static void main(String args[]) {
                Myabstract obj1 = new Myabstract();
                Myabstract obj2 = new Myabstract();
                Myabstract obj3 = new Myabstract();
                obj1.caluculate(3);
                obj2.caluculate(2);
                obj3.caluculate(4);
            }
        }
    }
}

