//public class ThreadProg {
//    private static ThreadLocal<Integer> th1 = ThreadLocal.withInitial(()->0);
//    public static void main(String args[]) throws InterruptedException{
//
//        Thread thread1 = new Thread(()-> {
//            th1.set(th1.get()+1);
//            System.out.println("Thread1:Print threadlocal present:"+th1.get());
//        });
//        Thread thread2 = new Thread (()->{
//            th1.set(th1.get()+1);
//            System.out.println("Thread2:Print threadlocal present:"+th1.get());
//        });
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
//        System.out.println("After threadlocal:"+th1.get());
//
//
//
//
//    }
//}
public class ThreadProg {
    // Define a ThreadLocal variable
    private static ThreadLocal<Integer> threadLocalValue = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) throws InterruptedException {
        // Create and start multiple threads
        Thread thread1 = new Thread(() -> {
            // Increment threadLocalValue for thread1
            threadLocalValue.set(threadLocalValue.get() + 1);
            System.out.println("Thread 1: ThreadLocal value = " + threadLocalValue.get());
        });

        Thread thread2 = new Thread(() -> {
            // Increment threadLocalValue for thread2
            threadLocalValue.set(threadLocalValue.get() + 1);
            System.out.println("Thread 2: ThreadLocal value = " + threadLocalValue.get());
        });

        thread1.start();
        thread2.start();

        // Wait for threads to complete
        thread1.join();
        thread2.join();

        // Print final value of threadLocalValue (main thread)
        System.out.println("Main thread: ThreadLocal value = " + threadLocalValue.get());
    }
}

