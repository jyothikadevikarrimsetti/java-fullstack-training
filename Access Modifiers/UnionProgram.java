import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionProgram {
    public static void main(String[] args) {
        Integer[] arr1 ={1,2,3};
        Integer[] arr2 ={3,4,5};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Integer[] unionArray =union.toArray(new Integer[0]);
        System.out.println(Arrays.toString(unionArray));
    }
}
