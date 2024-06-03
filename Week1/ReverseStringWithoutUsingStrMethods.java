
public class ReverseStringWithoutUsingStrMethods {
    public static void main(String args[]){
        String str1 = "abc";
        char[] rev1 = str1.toCharArray();
        for (int i = rev1.length - 1; i >= 0; i--)
            System.out.print(rev1[i]);
    }
}
