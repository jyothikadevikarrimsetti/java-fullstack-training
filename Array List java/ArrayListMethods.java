import java.util.ArrayList;

public class  ArrayListMethods {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("maths");
        list.add("science");
        list.add("social");
        list.add("telugu");
        list.add("biology");
        System.out.println("List of subjects:"+list);
        System.out.println(list.get(1));
        list.set(2,"botany");
        System.out.println("After modify:"+list);
        System.out.println(list.remove(3));
        System.out.println("After remove"+list);

    }
}
