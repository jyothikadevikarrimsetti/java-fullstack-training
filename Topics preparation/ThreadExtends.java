
public class ThreadExtends extends Thread {
    int[] arr = {1,2,3,4,5};
    public synchronized void run(){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new ThreadExtends();

//        thread.run();
        Thread t1 = new Thread(thread);
        Thread t2 = new Thread(thread);


        t1.start();
        t2.start();

        t1.join();
        t2.join();


    }

}
