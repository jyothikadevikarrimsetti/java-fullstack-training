//Palindrome Check without using string methods.
public class PalindromeCheckWithoutString {
    public static void main(String args[]){
        int number = 1010101 ;
        int temp = number;
        int reversenum  = 0;
        temp = number;
        System.out.println(number);
        System.out.println(reversenum);
        while (temp > 0) {
            int digit = temp % 10;
            reversenum = reversenum * 10 + digit;
            temp = temp / 10;
        }
        if(number == reversenum) {
            System.out.println("is a palindrome number");
        }
        else{
            System.out.println("is not a palindrome number");
        }

        }

    }



