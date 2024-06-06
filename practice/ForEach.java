import java.util.Scanner;

public class ForEach {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x);
        String fruits[] = {"apple","orange","grapes","pomogranate"};
        for(String i : fruits){
            System.out.println(i);
        }

    }
}
