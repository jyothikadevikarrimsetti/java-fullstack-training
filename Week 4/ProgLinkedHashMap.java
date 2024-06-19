import java.util.LinkedHashMap;

public class ProgLinkedHashMap {
    public static void main(String args[]){
        LinkedHashMap<Integer,String> l1 = new LinkedHashMap<>();
        l1.put(6,"six");
        l1.put(2,"two");
        l1.put(8,"eight");
        l1.put(3,"three");
        System.out.println("Values are:"+l1);
        System.out.println("remove element:"+l1.remove(2));
        System.out.println("getting number:"+l1.get(8));
        System.out.println("Contains value:"+l1.containsValue("six"));
        System.out.println("Contains key:"+l1.containsKey(3));
        System.out.println("Is map empty:"+l1.isEmpty());
        System.out.println("Size of the map:"+l1.size());
        l1.put(8,"pig");
        System.out.println("updated values:"+l1);
    }
}
