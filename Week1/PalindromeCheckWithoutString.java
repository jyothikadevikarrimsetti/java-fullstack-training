//Palindrome Check without using string methods.
public class PalindromeCheckWithoutString {
    public static void main(String args[]) {
        String val = "MADAM";
        if (ispalindrome(val)) {
            System.out.println("The given is palindrome" + val);
        } else {
            System.out.println("The given is not a palindrome" + val);
        }

    }

    public static boolean ispalindrome(String val) {
        int first = 0;
        int last = val.length() - 1;
        while (first < last) {
            if (val.charAt(first) != val.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;

       }
    }
 }





