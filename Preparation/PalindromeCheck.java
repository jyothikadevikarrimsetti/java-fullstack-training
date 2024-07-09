import java.util.TreeSet;

public class PalindromeCheck {
    public static void main(String[] args) {
        int num = 2323;
        int revnum=0;
        int temp = num;
        while (temp>0){
            int rem = temp%10;
            revnum = revnum*10+temp%10;
            temp =temp/10;
        }
        System.out.println(revnum);
        if(num==revnum){
            System.out.println("Number is Palindrome: "+num);
        }
        else {
            System.out.println("Not palindrome: "+num);
        }
//        System.out.println("and");
//        System.out.println(true&true);
//        System.out.println(true&false);
//        System.out.println("xor");
//        System.out.println(true^false);
//
        int arr[] ={2,4,87,65,9,4};
        TreeSet<Integer> set = new TreeSet<>();
        for (int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(set);
        int secmax =0;
        for(int i=0; i<2; i++){
            secmax = set.pollLast();
        }
        System.out.println(secmax );

    }
//    String s = "madam";
//    boolean p1 = false;
//    for(int i=0; i<s.length();)
}
