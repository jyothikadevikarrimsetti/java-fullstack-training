import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashmapAndHashtable {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,Integer> concurrentHashMap = new ConcurrentHashMap<>();
       HashMap<Integer, Integer> hashMap = new HashMap<>();
        Hashtable<Integer,Integer> hashtable = new Hashtable<>();
        hashtable.put(1,3);
        hashMap.put(4,5);
        hashMap.put(4,8);
        for (int i = 0; i <10 ; i++) {
            hashMap.put(i,i+1);
            hashtable.put(i,i+1);
            System.out.println(hashMap.get(i));

        }
//        for (Map.Entry<Integer,Integer> maps: hashMap.entrySet()){
        for (Map.Entry<Integer,Integer> maps : hashtable.entrySet()){

            hashtable.remove(maps.getKey());
        }
        System.out.println(hashMap);
        System.out.println(hashtable);

    }
}
