import java.util.ArrayList;
import java.util.List;

public class GenericsWildcard {
    public static void printNumberList(List<?extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(7);

        List<Double> list2 = new ArrayList<>();
        list2.add(2.34);
        list2.add(8.98);

        System.out.println("Integer list:");
        printNumberList(list1);

        System.out.println("Double list:");
        printNumberList(list2);







    }

}
