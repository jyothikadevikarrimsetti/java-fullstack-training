public class Threads123 implements Runnable {
    int arr[] = {1,2,3,4,5};
    synchronized public void run(){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }

    public static void main(String[] args) throws InterruptedException {
        Threads123 runnable = new Threads123();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}
