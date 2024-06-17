import java.util.Hashtable;

public class Sample {
    public static void main(String args[]) {
        Hashtable<String, Integer> h1 = new Hashtable();
        String[] string = {"ab", "bc", "cd"};
        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i]+"="+ i);
            h1.put(string[i], i);
//            h1.remove("ab");
            System.out.println(h1);
        }
    }
}
