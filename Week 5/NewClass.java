// class Outerclass{


import com.sun.source.doctree.ThrowsTree;

//public class NewClass {
//    void display(){
//        System.out.println("nested class");
//    }
//
//
//}
//    public static int staticvar = 10;
//    public static int add(int a, int b){
//        System.out.println(a+b);
//        return 0;
//    }
//static {
//    System.out.println("static block is executed");
//}
//
//    public static void main(String[] args) throws InterruptedException {
//        int[] arr = {1,2,3,4,5};
//        Thread t1 = new Thread(()->{
//            synchronized(arr) {
//                for (int i = 0; i < arr.length; i++) {
//                    System.out.print(arr[i] + " ");
//                }
//                System.out.println();
//            }
//
//        });
//        Thread t2 = new Thread(()->{
//            synchronized (arr) {
//                for (int i = 0; i < arr.length; i++) {
//                    System.out.print(arr[i] + " ");
//                }
//            }
//        });
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
////        add(4,5);
////        System.out.println(NewClass.staticvar);
////        System.out.println("main is executed");
////        Outerclass.NewClass nested = new Outerclass.NewClass();
////        nested.display();
//    }
//}
// class NewClass extends Thread {
//class NewClass implements  Runnable {

//     public void run(){
//         System.out.println("run");
//     }
//public static void main(String[] args) {
//         Runnable n1 = new NewClass();
//         Thread t3 = new Thread();
//         n1.run();

//}
//}
class Counter{
    public Integer count =0;
//    public void increment(){
    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }

    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();
        Thread thread1 = new Thread(()->{
//            synchronized (Counter.count){
            for (int i =0; i<1000; i++) {
                counter.increment();
//            }
            }
        });
        Thread thread2 = new Thread(()->{
//            synchronized (Counter.count) {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
//            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("count:"+counter.getCount());
    }
}
