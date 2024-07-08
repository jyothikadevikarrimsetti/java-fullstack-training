//public class Solution {
//    public static String main(String[] args) {
//        String[] words = {"madam","abcd","racecr"};
//        for (String s : words){
//            boolean bool = false;
//            for (int i=0; i<s.length(); i++){
//                if(s.charAt(i)==s.charAt(s.length()-1-i)){
//
//                    bool = true;
//                }
//                else {
//                    bool = false;
//                    break;
//                }
//            }
//            if (bool){
//                return s;
//            }
//        }
//        return " ";
//    }
//}
public class Solution {
    public static void main(String[] args) {
        String[] words = {"madam", "hello", "racecar"}; // Example array of words

        for (String s : words){
            boolean bool = true; // Start by assuming it's a palindrome
            for (int i = 0; i < s.length() ; i++){
                if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                    bool = false; // If characters don't match, it's not a palindrome
                    break;
                }
            }
            if (bool){
                System.out.println(s); // Print the palindrome word
                return; // Exit the method after finding the first palindrome
            }
        }
        System.out.println("No palindrome found"); // If no palindrome is found
    }
}