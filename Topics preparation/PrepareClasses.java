public class PrepareClasses {
   static void createMethod(){
        System.out.println(" Static method can be called without using obj creation");
    }
    public void createPublicMethod(){
        System.out.println("Public method are called with creating object");
    }
//    int x=10;
//    int x;
    public static void main(String[] args) {
        createMethod();  //static method calling

        PrepareClasses prepareClasses = new PrepareClasses();  //public methods calling
        prepareClasses.createPublicMethod();

//        PrepareClasses myobj = new PrepareClasses();
//        myobj.x=30;
//        System.out.println(myobj.x);
    }
}
