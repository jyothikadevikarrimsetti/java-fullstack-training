import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import static java.util.Locale.filter;
//import static java.util.stream.Nodes.collect;

public class BasicStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ab","cd","de");
        Stream<Integer> stream1 =Arrays.stream(new Integer[]{1,2,3,4,5});
//        Collections.addAll(list,"a","b","c");
        Stream<String> stream =list.stream();
        stream1.filter(n->n.equals("1"));



//        Stream<String> strt1 = stream.filter(jk->jk.startsWith("b"));


//        System.out.println(list);
//        String[]array = {"ab","bc","cd"};
//        Stream<String> str1 = Arrays.stream(array);
    }
}
