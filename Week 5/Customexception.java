class AgeNotMet extends Exception{
    AgeNotMet(String msg){
        super(msg);
    }
}
public class Customexception {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age<18){
                throw new AgeNotMet("age not met");
            }
        }catch (AgeNotMet e){
            e.printStackTrace();
        }

    }
}
