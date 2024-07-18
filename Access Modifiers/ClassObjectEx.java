public class ClassObjectEx {
//    int x = 20;
//    int y;

     void myMethod1()throws Throwable{
        throw new Throwable();
    }

    public static void main(String[] args) {
//        ClassObjectEx myObj = new ClassObjectEx();
//        myObj.y=10;
//        System.out.println(myObj.x);
//        System.out.println(myObj.y);



        try{
            ExceptThrowable.main(new String[3]);

            new ClassObjectEx().myMethod1();
        }catch (Throwable te){

        }

    }
}
