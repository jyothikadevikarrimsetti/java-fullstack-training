import java.util.LinkedHashMap;

public class DetailsLinked {
    public static void main(String args[]){
        LinkedHashMap<Integer,String> v1 = new LinkedHashMap<>();
        v1.put(3,"three");
        v1.put(5,"four");
        v1.put(4,"five");
        System.out.println(v1);
    }
}
