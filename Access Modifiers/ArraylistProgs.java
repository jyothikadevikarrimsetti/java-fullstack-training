import java.util.ArrayList;
import java.util.Collections;

public class ArraylistProgs {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,1,2,3,4);
        System.out.println(arrayList.reversed());
//        for (int i=0; i<arrayList.size(); i++){
//            System.out.println(arrayList);
//        }
    }
}
