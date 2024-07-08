public class StringBuff {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer stringbuffer = new StringBuffer();
        StringBuilder stringbuilder = new StringBuilder();
        String s1 = " ";

        Thread t1 = new Thread(()->{
            for (int i =0; i<100; i++){
                System.out.println(stringbuffer.append(i+" ").hashCode());
                stringbuilder.append(i+" ");
            }

        });
        Thread t2 = new Thread(()->{
           for (int i=0; i<100; i++){
               stringbuffer.append(i+" ");
               stringbuilder.append(i+" ");
           }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("StringBuffer"+"\n"+stringbuffer);
        System.out.println("StringBuilder"+"\n"+stringbuilder);
    }
}
