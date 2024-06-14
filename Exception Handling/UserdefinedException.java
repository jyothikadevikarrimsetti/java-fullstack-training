//public class UserdefinedException {
//    public static void main(String args[]){
//
//    }
//}
//class MyException extends Exception{
//    MyException(super) {
//        super();
//    }
//        MyException(String str) {
//            super(str);
//        }
//    }
//        public class UserdefinedException {
//            public static void main(String args[])
//
//            {
//
//                try {
//                    MyException jyo = new MyException("details");
//                    throw jyo;
//                } catch (MyException e) {
//                    System.out.println("exception" + e.toString());
//                }
//            }
//        }
class MyException extends Exception {


   public MyException(String st1) {
        super(st1);
    }
}

public class UserdefinedException {
    public static void main(String args[]) {
        try {
            int x = 10;
            if(x>5){
//                throw new MyException("ohmy");
            MyException myException = new MyException("ohno");
            throw myException;
            }


        } catch (MyException e) {
            System.out.println("Exception: " + e.toString());
        }
    }
}


