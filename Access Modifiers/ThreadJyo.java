class Threadpract extends Thread{
    Threadpract(Runnable run){
        System.out.println("hi hi hi");
    }
}



public class ThreadJyo implements Runnable {
   public void run(){
       int[] arr = {1,2,3,4,5};
//       System.out.println("Thread running");
       for(int i=0; i<arr.length; i++){
           System.out.print(arr[i]+" ");
       }
       System.out.println();
    }

    public static void main(String[] args)   {
//        Thread thread = new Thread(new ThreadJyo());
        ThreadJyo threadJyo = new ThreadJyo();
        Threadpract threadpract = new Threadpract(new ThreadJyo());
        Threadpract threadpract1 = new Threadpract(new ThreadJyo());
//        threadpract.join();
        threadpract.start();
        threadpract1.start();
//        threadJyo.run();
        threadpract1.notify();

//        thread.join();
    }
}
