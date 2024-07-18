class CustomThread extends Thread {
     CustomThread(Runnable runnable){
         super(runnable);
    }
}
class Running implements Runnable{
    public void run(){
        System.out.println("Running Thread");

    }
}
class RunAway implements Runnable{
    public void run(){
        System.out.println("RunAway Thread");

    }
}
public class ThreadsJyo {
    public static void main(String[] args) throws InterruptedException {
        Running running = new Running();

        RunAway runAway = new RunAway();

        CustomThread customThread = new CustomThread(running);
        CustomThread customThread1 = new CustomThread(runAway);

//        customThread.start();

//        customThread.join();
//        Thread thread1 = new Thread(running);
//        Thread thread2 = new Thread(runAway);
        customThread.start();
        customThread1.start();

//        customThread.join();
//        customThread1.join();
//        thread2.start();

    }
}
