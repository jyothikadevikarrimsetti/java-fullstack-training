import java.util.HashSet;
import java.util.Iterator;

public class HS {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet();
        hs.add("India");
        hs.add("America");
        hs.add("China");
        hs.add("England");
        hs.add("Japan");
        System.out.println("Print HashSet:"+hs);
        Iterator it = hs.iterator();
        System.out.println("Elements in the iterator:");
        while (it.hasNext()){
            String s = (String)it.next();
            System.out.println(s);
        }

    }
}
