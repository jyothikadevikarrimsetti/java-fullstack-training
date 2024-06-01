
public class ReverseStringWithoutUsingStrMethods {
    public static void main(String args[]){
        String str1 = "abc";
        char[] try1 = str1.toCharArray();
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }
}
