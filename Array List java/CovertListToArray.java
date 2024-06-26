import java.util.ArrayList;
import java.util.List;

public class CovertListToArray {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Print list:"+list);
//        covert to array
        Integer[]array = list.toArray(new Integer[0]);
//        print array
        for (Integer i:array){
            System.out.println(i);
        }
    }
}
