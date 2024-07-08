class OuterClass{
//    int n =9;
      class InnerClass{
         void inf(){
             System.out.println("outer class");
         }

    }
//    class Inner1{
//         void inf1(){
//
//         }
//    }
}

public class Innerclass {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.InnerClass inn =out.new InnerClass();
//        inn.inf();
    }
}
