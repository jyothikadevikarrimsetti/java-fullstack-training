
public class ExceptThrowable {
    static {
        try{
            myMethod();

        }catch (Throwable abc){
            System.out.println("abc  "+abc);

        }

    }
    static void myMethod()throws Throwable{
        main(new String[1]);
//        try{
//            main(new String[1]);
//        }catch (Throwable abc){
//
//        }
    }

    public static void main(String[] args) throws Throwable  {
//        myMethod();
        System.out.println(1);

        throw new Throwable();

    }
}
