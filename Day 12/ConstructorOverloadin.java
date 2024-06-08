public class person {
     String name;
     int age;
    void person()
    {
        name = "satya";
        age = "23";
    }
    void person(String s , int i){
        name = s;
        age = i;
    }
    void talk()
    {
        System.out.println("My name is" + name);
        System.out.println("my age" + age);
    }
    class details{
        public static void main(String args[]);
            person satya= new person();
            satya.talk();
            person sitha = new("sitha" , 20);
            sitha.talk();
    }
}

