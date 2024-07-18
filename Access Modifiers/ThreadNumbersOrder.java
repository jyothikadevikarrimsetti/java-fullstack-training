public class ThreadNumbersOrder implements Runnable {
    int [] arr = {1,2,3,4,5};
    public synchronized void run(){
        for (int i=0; i<arr.length; i++){
//            int rev = arr.length-1-i;
            System.out.println(arr[i]+" "+arr[i]);
//            System.out.println(arr[i]+""+arr[rev]);
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new ThreadNumbersOrder();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();


    }
}
