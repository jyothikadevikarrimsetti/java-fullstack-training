import java.util.Hashtable;

public class DiffWayHash {
    public static void main(String args[]){
        Hashtable<Integer,String> h1= new Hashtable<>();
        h1.put(1,"one");
        h1.put(2,"two");
        h1.put(3,"three");
        h1.put(4,"four");
        System.out.println("Hasing:" + h1);
        System.out.println(h1.get(1));
        h1.remove(2);
        System.out.println(h1);
    }
}

