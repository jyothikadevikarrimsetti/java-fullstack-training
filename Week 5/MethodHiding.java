import java.io.IOException;

class Teacher{
       void display()throws Exception{
        System.out.println("Call the teacher");
        throw new Exception("gh");
    }
}
class Student extends Teacher{
     void display() {
        System.out.println("call the student");
    }
    void display(int i){

    }

}
public class MethodHiding extends Student {
    public static void main(String[] args) {
//        Teacher.display();
//        Student.display();
        Student sds = new Student();
        try {
            sds.display();
        }catch (Exception e){

        }
//        Teacher st1= new MethodHiding();
//        st1.display();

//        Teacher teacher = new Student();

    }
}
