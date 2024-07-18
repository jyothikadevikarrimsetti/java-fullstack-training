class Jyo extends Thread{
    public void run(){
        System.out.println("Hello");
    }
}

public class ThreadStart  implements Runnable{
    public void run(){
        System.out.println("Threads");
    }

    public static void main(String[] args) {
        Thread thread = new Thread();
        ThreadStart threadStart = new ThreadStart();
        System.out.println("ABCD");
        Thread t1 = new Thread(threadStart);
//        System.out.println("ABCD");
        t1.start();
        thread.start();

    }
}
