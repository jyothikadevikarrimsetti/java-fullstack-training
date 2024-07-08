abstract class School123{     //abstract class
    String name ="Vihaan";
    int age = 4;
   public abstract void study();  // abstract method
}
// subclass inherit from parent(school123)
class Student11 extends School123{
//    public int year = 2024;
    public void study(){    //body of abstract method
        System.out.println("Studying all days");
    }
}

public class AccessModifiers {
    public static void main(String[] args)  {
        Student11 student11 = new Student11();   // object creation
        System.out.println("name: "+student11.name +" "+ "age: "+student11.age);
        student11.study();    // method calling
        }
    }

