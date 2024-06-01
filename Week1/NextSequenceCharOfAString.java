public class NextSequenceCharOfAString {
    public static void main(String args[]) {
        String str = "abc";
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            int ascii = (int) ch;
            int nextAscii = ascii + 1;
            char nextChar = (char) nextAscii;
            System.out.println("Original character: " + ch);
            System.out.println("Next sequence character: " + nextChar);
        }
    }
}
