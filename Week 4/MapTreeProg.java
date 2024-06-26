import java.util.TreeMap;

public class MapTreeProg {
    public static void main(String args[]){
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("cat",10);
        map.put("ant",5);
        map.put("ox",15);
        System.out.println("print elements:"+map);
        map.remove("ant");
        System.out.println("removin: "+map);
    }
}
