import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamsJavaProg {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,7,2,3,45,67,12,1,3,4,5);
        Stream<Integer> stream = list.stream();
//        Stream<Integer> sortedstream = stream.sorted();
//        Stream<Integer> newProductstream = sortedstream.map((n)->n*2);
//        sortedstream.map((n)-> n*n).forEach(n-> System.out.print(n+" "));
        stream
                .sorted()
                .map((n)->n*n)

                .forEach(n-> System.out.println(n));

//        newProductstream.forEach(n-> System.out.println(n+" "));
    }
}
