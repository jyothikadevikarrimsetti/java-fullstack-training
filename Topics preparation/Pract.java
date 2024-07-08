class AgeMet extends RuntimeException{
    AgeMet(String str){

        super(str);
    }
}
 public class Pract {
    public static void main(String[] args) {
        int age = 16;

            try{
                if(age<18){
                    throw new AgeMet("Age not met");


            }
        }
//            catch (AgeMet a1){
//                a1.printStackTrace();
//            }
            finally {
                System.out.println("where");
            }
    }
}
