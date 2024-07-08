import java.io.Serializable;
import java.util.Optional;
interface Iksdk{
void nh();
}
interface Olii {
 void n1();
}
interface Ikikj extends Iksdk,Olii{
void f0();
}


class Students implements Ikikj{
    String studentName;
    String studentId;
    Students(String studentName , String studentId){
        this.studentName = studentName;
        this.studentId = studentId;
    }
    public void n1(){

    }
   public void f0(){

    }
    public void nh(){

    }
    public String getStudentName(){
        return studentName;
    }
    public String getStudentId(){
//        System.out.println(studentId);
        return studentId;
    }
}
public class JavaOptionals {
static int i = m1();
static  char j;
  static int m1() {
//      main(new String[]{"args"});
        i = i++;
//      System.out.println("ikik");
        return i;
    }

    public static void main(String[] args) {
        Optional<Students> opnls = newStudent();
//        Students student1 = opnls.orElse(new Students("sasd","1"));
//        System.out.println(student1.getStudentId());
        String s = opnls.map(Students::getStudentName).orElse("null");
//        System.out.println(s);
        System.out.println(j);
        byte[] arr ={92,3,34,4,1};
        for(byte b:arr){
//            System.out.println(b);
        }

        switch (0000){
            case 00001:
                System.out.println("one");
                break;
            case 0000 :
                System.out.println("two");
        }
        String s1 = "90";
//        System.out.println(
           Float i8=    Float.parseFloat(s1);
//        );
        int a = 10;
        int b = 30;
        double c = b/2;
        System.out.println(c);

//        int i;
//        {
//           int i = 9;
//        }
//        System.out.println(i);

//        Students students = newStudent();

//        if(students==null) {
//            System.out.println("null");
//        }
//        else
//            System.out.println(students.getStudentId());

    }
    static Optional<Students> newStudent(){
//    Students students = new Students("ssasd","0");
        Students students = null;
//        return new Students("sdasd","sdfdsf");
        return Optional.ofNullable(students);
    }
}
