import java.util.ArrayList;
import java.util.List;

public class ArrayListAdd {
    public static void main(String args[]){
        List<Integer>list =new ArrayList<>();
        list.add(10);
        list.add(20);
//        list.add(1,8);
//        list.add(2,6);
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
        System.out.println(list.contains(20));
        for(Integer val:list){
            System.out.println(val);
        }
    }
}
