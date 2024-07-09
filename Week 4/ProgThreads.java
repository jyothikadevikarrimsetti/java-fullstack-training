public class ProgThreads extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(i+" : "+currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
}
