public class StringBuilderThread {
    public static void main(String args[]) throws InterruptedException{
        StringBuilder builder = new StringBuilder();
        Thread thread1 = new Thread(() -> {
            for(int i=0; i<1000; i++){
                builder.append("Jyothika");
            }
        });
        Thread thread2 = new Thread(() -> {
            for(int i=0; i<1000; i++){
                builder.append("devi");
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("String builder can be:"+builder.toString());

    }

}
