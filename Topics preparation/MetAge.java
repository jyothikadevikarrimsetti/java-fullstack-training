class Year extends Exception{
    Year(String str){
        super(str);
    }


}
public class MetAge {
    public static void main(String[] args) {
        int age = 15;
        if(age<18){
            try{
                throw new Year("Age not met");

            }catch (Year y1){
                y1.printStackTrace();
            }
            finally {
                System.out.println("age");
            }
        }

    }

}
