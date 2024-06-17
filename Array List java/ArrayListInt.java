import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collections.reverseOrder;

public class ArrayListInt {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(29);
        list.add(19);
        list.add(90);
        list.add(35);
        list.add(48);
        System.out.println("Before sorting:" + list);
        for (int marks : list) {
            System.out.println(marks);
        }
//        Collections.sort(list);
        Collections.sort(list,reverseOrder());
        System.out.println("After sorting" + list);
        for (int marks : list){
            System.out.println(marks);
        }
    }
}


