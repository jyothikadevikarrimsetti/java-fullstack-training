import java.util.ArrayList;

public class FibonacciSeriesUsingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        for (int i = 0; i < 10; i++) {
            arrayList.add(arrayList.get(arrayList.size() - 1) + arrayList.size() - 2);
        }
        System.out.println(arrayList);
    }
}
