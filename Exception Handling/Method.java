import java.util.HashMap;
import java.util.Hashtable;

public class Method {
    public static void main(String args[]) {
        Hashtable<Integer, Integer> h1 = new Hashtable();
        HashMap<Integer, Integer> h2 = new HashMap<>();
        int[] numbers = {1, 2, 3, 4, 4};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (h1.containsKey(numbers[i]) && h2.containsKey(numbers[i])) {

            } else {
                h1.put(numbers[i], i);
                h2.put(numbers[i], i);
                System.out.println(h1);
            }
        }
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h1.get(3));


    }
}


