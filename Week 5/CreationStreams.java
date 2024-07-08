import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CreationStreams {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"abc","tdh","hej","ftg");
        Stream<String > stream = list.stream();
//        Stream<String> sorting = stream.sorted();
        stream.forEach(n-> System.out.println());
//        System.out.println(stream.count());

    }
}
