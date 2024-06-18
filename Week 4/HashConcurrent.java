import java.util.concurrent.ConcurrentHashMap;

public class HashConcurrent {
    public static void main(String args[]){
        ConcurrentHashMap<Integer,String> con = new ConcurrentHashMap<>();
        con.put(4,"apple");
        con.put(7,"banana");
        con.put(6,"grapes");
//        System.out.println(con.get(8));
        System.out.println("Elements:"+con);
        con.put(3,"jyo");
        System.out.println("After adding:"+con);
        con.remove(6);
        System.out.println("After remove:"+con);
        System.out.println(con.size());
    }
}
