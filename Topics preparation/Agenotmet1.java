class Age extends Exception{
     Age(String str){
        super(str);
    }
}
public class Agenotmet1 {

    public static void main(String[] args)  {
        int age =17;
        try {
            if (age<=18) {
                throw new Age("Age Not Met");
            }
        }
        catch (Age a1){
            a1.printStackTrace();
        }
    }
}
