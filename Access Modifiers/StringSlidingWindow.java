public class StringSlidingWindow {
    public static void main(String[] args) {
        String str = "Jyothika devi";
        int windowSize = 4;
        for (int i=0; i<str.length()-windowSize; i++){
            String window = str.substring(i,i+windowSize);
            System.out.println(window);
        }
    }
}
