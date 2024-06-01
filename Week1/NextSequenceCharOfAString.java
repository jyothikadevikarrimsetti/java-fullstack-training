public class NextSequenceCharOfAString {
    public static char getNextCharacter(String str) {
        char lastChar = str.charAt(str.length() - 1);
        return ++lastChar;
    }

    public static void main(String[] args) {
        String str = "Hello";
        char nextChar = getNextCharacter(str);
        System.out.println("Next character after '" + str.charAt(str.length() - 1) + "' is: " + nextChar);
    }
}
