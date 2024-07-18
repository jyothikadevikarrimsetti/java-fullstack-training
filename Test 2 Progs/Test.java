import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<>();

//        list = new ArrayList<Number>();
//        list.add(1);
//        list.add(2L);
//        list.add(3.0);
        //list.add("string"); // Compile-time error!

        System.out.println(list); // [1, 2, 3.0]
    }


}
