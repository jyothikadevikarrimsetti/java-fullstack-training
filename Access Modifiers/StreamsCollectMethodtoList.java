import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsCollectMethodtoList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);

        List<Integer> list1 = list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(list1);
    }
}
