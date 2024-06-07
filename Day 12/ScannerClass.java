import java.util.Scanner;

public class ScannerClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name =sc.nextLine();
        char gender = sc.next().charAt(0);
        int age = sc.nextInt();
        long mobno = sc.nextLong();
        float cgpa = sc.nextFloat();
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
        System.out.println("Mobile no:"+mobno);
        System.out.println("CGPA:"+cgpa);


    }
}
