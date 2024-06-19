import java.util.TreeSet;

public class Treesets {
    public static void main(String args[]){
        TreeSet<Integer> val = new TreeSet<>();
        val.add(1);
        val.add(5);
        val.add(3);
        val.add(2);
        val.add(6);
        System.out.println(val.descendingSet());
        val.add(7);
        System.out.println("after updation:"+val);
//       System.out.println(val.add(6));

    }
}
