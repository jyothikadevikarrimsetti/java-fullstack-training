public class Dolly {
//    Integer c;
    public static void main(String[] args) throws InterruptedException {
//        int ans = 10 + 20 / 2 * 3;
//        System.out.println(ans);
//        Integer[] b = new Integer[10];
//        System.out.println(b[0]);

//        System.out.println(new Dolly().c);
        int arr1[] = {1,2,3,4,5};
        Thread t1 = new Thread(()->{
//            synchronized (arr1) {
                for (int i = 0; i < arr1.length; i++) {
                    System.out.print(arr1[i] + " ");
                }
//            }
        });
        Thread t2 = new Thread(()->{
            for (int i =0; i<arr1.length; i++){
                System.out.print(arr1[i]+" ");
            }
        });
        t1.start();
        t1.join();

        t2.start();
        t2.join();
    }
}
