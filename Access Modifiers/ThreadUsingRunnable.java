public class ThreadUsingRunnable implements Runnable {
    int[] arr1 = {1,2,3,4,5,6,7,8};
    public synchronized void run(){
        for (int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) throws InterruptedException {
        Runnable run = new ThreadUsingRunnable();

        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}
