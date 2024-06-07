public class StringBufferThread {

    public static void main(String args[]) throws InterruptedException {
        StringBuffer buffer = new StringBuffer();
//        int i;
        Thread thread1 = new Thread(() ->{
            for(int i=0 ; i<1000; i++){
                buffer.append("a");
            }
        });
        Thread thread2 = new Thread(() ->{
            for(int i=0; i<1000; i++){
                buffer.append("b");
            }
        });
        thread1.start();
        thread2.start();

            thread1.join();
            thread2.join();

        System.out.println("String buffer can execute:"+buffer.toString());
    }
}
