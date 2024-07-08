import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadList implements Runnable{
   static ArrayList arrayList = new ArrayList();
//    static List arrayList1 = Collections.synchronizedList(arrayList);
   public synchronized void run()
    {
        for(int i = 0; i<6;i++){

           arrayList.add(i) ;
        }
    }

    public static void main(String[] args) throws InterruptedException {

//

        Runnable runnable = new ThreadList();

        Thread t1 = new Thread(runnable);


        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(new ThreadList().arrayList);
    }
}
