import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Name Age Salary:");

        String Name = myObj.nextLine();
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        System.out.println("Username is: " + Name);
        System.out.println("Age"+age);
        System.out.println("Salary:"+salary);

    }
}