import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        Collections.addAll(list,3,2,65,4,34,7,9);
        Stream<Integer>stream = list.stream();
//        Stream<Integer> sortedstream = stream.sorted();
//        sortedstream.forEach(n-> System.out.println(n));
//        Stream<Integer> ProductStream = sortedstream.map(n->n*2);
//        Stream<Integer> greaterstream =ProductStream.filter(n->n>10);
//        greaterstream.forEach(n-> System.out.println(n));
//        ProductStream.forEach(n-> System.out.println(n));
//        System.out.println(stream.count());
//        System.out.println(stream.count());
        stream
                .sorted()
                .map(n->n*2)
                        .filter(n->n>10)
//                .map(n->n*3)
                                      .forEach(n-> System.out.println(n));
    }
}
