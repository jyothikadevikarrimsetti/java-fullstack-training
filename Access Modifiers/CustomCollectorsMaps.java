import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomCollectorsMaps {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("jyo","thi","ka","jimson");

        Map<String,Integer> maps = strings.stream().collect(Collectors.toMap(key->key,value->value.length()));

        System.out.println(maps);
    }
}
