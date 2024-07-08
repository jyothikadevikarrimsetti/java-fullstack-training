public class ActualOrder {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1,2,3,4,5};

        Thread t1 = new Thread(()->{
//            synchronized (arr) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
//            }

        });
        Thread t2 = new Thread(()->{
           for (int i=0; i<arr.length; i++){
               System.out.print(arr[i]+" ");
           }
        });
        t1.start();
        t1.join();

        t2.start();
        t2.join();

    }
}
