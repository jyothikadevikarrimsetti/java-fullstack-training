import java.util.TreeMap;

public class MapTree {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7};
        TreeMap<Integer,String> val = new TreeMap();
        for(int i=0; i<arr.length; i++){
            val.put(arr[i], String.valueOf(i));
        }
        System.out.println(val.get(2));
        System.out.println(val.get(1));
//        val.put(1,"one");
//        val.put(2,"two");
//        val.put(0,"zero");
        System.out.println(val.descendingMap());
//        System.out.println();
    }
}
