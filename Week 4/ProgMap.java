import java.util.HashMap;
import java.util.Map;

public class ProgMap {
    public static void main(String args[]){
        Map<String,Integer> map = new HashMap<>();
        map.put("Jyo",20);
        map.put("madhu",18);
        map.put("sindhu",22);
        map.put("pooja",17);
        System.out.println("Values in the Map:"+map);
//        System.out.println(map.containsKey("pooja"));
        System.out.println("Age of pooja: "+map.get("pooja"));
//        for(Integer element: map){
//            System.out.println(element+" ");
//        }
    }
}
