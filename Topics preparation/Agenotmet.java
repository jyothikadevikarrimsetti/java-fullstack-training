class Age extends RuntimeException{
     Age(String str){
        super(str);
    }
}
public class Agenotmet {

    public static void main(String[] args) {
        int age =17;
        try {
            if (age<18) {
                throw new Age("Age NotMet");
            }
        }
        catch (Age a1){
            a1.printStackTrace();





        }
    }
}
