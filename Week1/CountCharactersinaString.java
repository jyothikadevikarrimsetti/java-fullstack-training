//Count Characters in a String without using string methods.
public class CountCharactersinaString {
    public static void main(String args[]){
        String temp = "do not be afraid";
        int count = 0;
        for (char ch:  temp.toCharArray()) {
            count++;
        }
        System.out.println("temp length: " + count);
    }
}
