abstract class Abstractclass {
    abstract void run();
}
class hero extends Abstractclass {
    void run() {
        System.out.println("Drive safely");
    }

    static class maruthi extends Abstractclass {
        void run() {
            System.out.println("Go slowly");
        }
    }

    static class hundai extends Abstractclass {
        void run() {
            System.out.println("Good car");
        }
    }

    public static void main(String args[]) {
        Abstractclass obj = new hero();
        Abstractclass obj1 = new maruthi();
        Abstractclass obj2 = new hundai();
        obj.run();
        obj1.run();
        obj2.run();
//            int a = 2;
//            int b = 3;
//            int c = a + b;
//        System.out.println("c="+c);
        }
    }


//    class Addition {
//        public static void main(String args[]) {
//            int a = 2;
//            int b = 3;
//            int c = a + b;
//            System.out.println("c" + c);
//        }
//    }