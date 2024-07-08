import java.util.Arrays;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] s1 = str.split(" ");

        System.out.println(Arrays.toString(s1));

    }
}
