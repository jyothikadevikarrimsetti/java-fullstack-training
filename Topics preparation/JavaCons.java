import java.awt.font.ShapeGraphicAttribute;

public class JavaCons {          //Constructors
//    String str;
//    int x;
//    int z;
//    String string;
    String empName;
    int empAge;
    public JavaCons(String name , int age){
//        str = "jyo";
//        x= 90;
//        z = y;
//        string = str;
        empName = name;
        empAge = age;
    }
    //getter method
    public void getName(){
//        return name;
    }
    public void getAge(){
//        return age;
    }

    public static void main(String[] args) {
//        JavaCons j1 = new JavaCons();
//        System.out.println(j1.str);
//        System.out.println(j1.x);
//        JavaCons javaCons = new JavaCons(7, "jyo");
//        System.out.println(javaCons.z);
//        System.out.println(javaCons.string);
        JavaCons j1 = new JavaCons("jyo",20);
        System.out.println(j1.empName+" "+j1.empAge);
//        System.out.println(j1.empAge);
    }

}
