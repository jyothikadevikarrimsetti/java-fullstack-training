public class VowelsOfAString {
    public static void main(String args[]) {
        String str = "Hello Java";
        int vowelCount =countVowels(str);
        System.out.println("Vowels of a string:" + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        return 0;
    }
}

