import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCars {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("bmw");
        arrayList.add("Audii");
        arrayList.add("RollsRoys");
        arrayList.add("Jaugwar");

        Iterator<String> it = arrayList.iterator();


        System.out.println(it.next());
    }
}
