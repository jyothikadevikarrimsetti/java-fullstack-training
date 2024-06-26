import java.util.HashMap;

public class ExHashMap {
    public static void main(String args[]){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(5,"five");
        map.put(2,"two");
        map.put(3,"third");
        System.out.println("Elements in the map:"+map);
        System.out.println(map.get(3));
        System.out.println(map.remove(5));
        System.out.println("after updation:"+map);
        System.out.println(map.size());
    }
}
