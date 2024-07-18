import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapPract {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,31,49,51);
        Stream<Integer> stream = list.stream();
        stream.sorted().map(n->n*2).filter(n->n>20).forEach(n-> System.out.println(n));
    }
}
