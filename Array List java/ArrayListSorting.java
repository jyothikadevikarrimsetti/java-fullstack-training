import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collections.reverseOrder;

public class ArrayListSorting {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("banana");
        list.add("orange");
        list.add("apple");
        list.add("pomo");
        list.add("lychee");
        System.out.println("Befor sorting:"+list);
        Collections.sort(list);
//        Collections.sort(list,reverseOrder());
        System.out.println("After sorting"+list);

    }
}
