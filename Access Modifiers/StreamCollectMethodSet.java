import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectMethodSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);
        Set<Integer> set = list.stream().filter(Str->Str%2==0)
        .collect(Collectors.toSet());
        System.out.println(set);
        double d1 = 10.0;
        double d2 = 0.0;
        System.out.println(d1/d2);
    }
}
