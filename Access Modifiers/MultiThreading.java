class Jyothika extends Thread{
    public void run(){
        System.out.println("Cheebaa");
    }
}

public class MultiThreading implements Runnable {
    public void run(){
        System.out.println("Subbu");

    }

    public static void main(String[] args) {
        Runnable runnable = new MultiThreading();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        Jyothika jyothika = new Jyothika();
        jyothika.start();



        t1.start();
        t2.start();
    }
}
