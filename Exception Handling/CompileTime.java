//compile time error
//
//class err{
//    public static void main(String args[]){
//        double sal = 5000; //actual salary of a employee
//        sal =sal*15/100;  // incremented by 15% of salary
//        System.out.println("Incremented salary"+sal);
//    }
//}
// exception example
//class err{
//    public static void main(String args[]){
//        System.out.println("Open files");  //file opened
//        int n = args.length;       //arguments in n
//        System.out.println("n="+n);
//        int a = 100/n;           // n can be divided by a
//        System.out.println("a="+a);
//        System.out.println("Close files");   //file closed
//    }
//}
//Program data Files
//class err{
//    public static void main(String args[]){
//        try{
//            System.out.println("Open files");
//            int n = args.length;
//            System.out.println("n= "+n);
//            int a = 20/n;
//            System.out.println("a= "+a);
//        }
//        catch(ArithmeticException arithmeticException){
//            System.out.println(arithmeticException);
//            System.out.println("pass the data");
//        }
//        finally{
//            System.out.println("close file");
//        }
//    }
//}
//program data files using array
class err{
    public static void main(String args[]){
        try{
            System.out.println("open files");
            int n = args.length;
            System.out.println("n = "+n);
            int a = 12/n;
            System.out.println("a = "+a);
            int [] b = {10,20,30};
            b[50] = 100;
            System.out.println();
        }
        catch(ArithmeticException arithmeticException){
            System.out.println(arithmeticException);
            System.out.println("data is processing");
        }
        catch(ArrayIndexOutOfBoundsException arrayindexOutOfBoundsException){
            arrayindexOutOfBoundsException.printStackTrace();
            System.out.println("print array is in index");
//            System.out.println();
        }
        finally{
            System.out.println("Close file");
        }
    }
}