class School{
    String name;
    int age;
    School Student1(String name,int age){
        this.name=name;
        this.age=age;
        return null;
    }
    School Student2(String name,int age){
        this.name=name;
        this.age=age;

        return null;
    }
    String getName(){
        return name+name;
    }
    int getAge(){
        return age+age;
    }
}
public class Studentdet {
    public static void main(String[] args) {
        School s1 = new School();
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
    }
}
