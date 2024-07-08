public class ThreadUsingLambda {


    public static void main(String[] args) throws InterruptedException {
        int[] arr1 = {1,2,3,4,5};

        Thread t1 = new Thread(()->{
            synchronized (arr1) {
                for (int i = 0; i < arr1.length; i++) {
                    System.out.print(arr1[i] +" ");
                }
                System.out.println();
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (arr1) {
                for (int i = 0; i < arr1.length; i++) {
                    System.out.print(arr1[i] + " ");
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
