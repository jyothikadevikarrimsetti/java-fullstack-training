import java.util.ArrayList;

public class ThreadAnother implements Runnable  {
    int[] arr1 = {1,2,3,4,5};
//   public synchronized void run()
//    {
//
//        for (int i=0; i<arr1.length; i++){
//            System.out.print(arr1[i]+" ");
//        }
//        System.out.println();
//    }
//
//
//
//    public static void main(String[] args) throws InterruptedException {
//        Runnable runnable = new ThreadAnother() {
//        };
//
//        Thread t1 = new Thread(runnable);
//        Thread t2 = new Thread(runnable);
//
//        t1.start();
//        t2.start();
//
//       t1.join();
//        t2.join();
//
//
//    }
   public synchronized void run(){
       for (int i=0; i<arr1.length; i++){
           System.out.print(arr1[i]+" ");
       }
       System.out.println();

    }

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new ThreadAnother();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

}
