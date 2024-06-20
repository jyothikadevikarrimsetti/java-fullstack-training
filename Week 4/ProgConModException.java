import java.util.ArrayList;
import java.util.Iterator;

public class ProgConModException {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            Integer value =it.next();
            System.out.println("Elements:"+list);
            if(value.equals(3));
            list.remove(value);
        }

    }
}
