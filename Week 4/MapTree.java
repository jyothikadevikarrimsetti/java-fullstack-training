import java.util.TreeMap;

public class MapTree {
    public static void main(String args[]){
        TreeMap<Integer,String> val = new TreeMap();
        val.put(1,"one");
        val.put(2,"two");
        val.put(0,"zero");
        System.out.println(val.descendingMap());
//        System.out.println();
    }
}
