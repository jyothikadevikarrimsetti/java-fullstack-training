public class LCM implements Runnable{
    public void run(){
        System.out.println(myMethod(4,6));
    }
    public int myMethod(int a,int b){
        int max = Math.max(a, b);

        // Check multiples of max until both are divisible
        while (true) {

           try {
               Thread.sleep(200);

           }catch (InterruptedException ie){

           }
            if (max % a == 0 && max % b == 0) {
                return max;

            }
            max++;
        }


    }
    public static void main(String[] args) throws InterruptedException {
        LCM lcm = new LCM();
        Thread t1 = new Thread(lcm);
        Thread t2 = new Thread(lcm);


        t1.start();
        t2.start();

//        t1.join();
//        t2.join();





//        int a =2;
//        int b =5;


//        int lcm ;

            // Find the maximum of two numbers

        }
    }
