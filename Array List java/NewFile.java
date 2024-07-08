import java.util.ArrayList;
import java.util.stream.Stream;

public class NewFile {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(2);
        arrlist.add(7);

        Stream<Integer> stream = arrlist.stream();
        stream.map(x->x*x).map(x->x*x).filter((x)->x>5).forEach(x-> System.out.println(x));
//        stream.map(x->x*x);
        Thread thread = new Thread(()->{
            for (int i =0; i<3;i++){
                arrlist.add(i);
            }
        });
        Thread thread2 = new Thread(()->{
            for(int i =0; i<3; i++){
                arrlist.add(i);
            }
        });
        thread.start();
        thread2.start();

//        read2.join();
    }
}
