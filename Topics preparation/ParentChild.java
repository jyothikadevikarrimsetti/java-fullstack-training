public class ParentChild {
    public static void main(String[] args) {
        int arr[] =  new int[8]; //{1,2,3,4,5};
        try {
            System.out.println(arr[9]);
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println(e);
        }
    }
}
//class Parent1{
//    Parent1(){
//        System.out.println("Parent is called");
//    }
//}
//class Child extends Parent1{
//    Child(){
//        System.out.println("Child is called");
//    }
//}
//class Main1{
//    public static void main(String args[]){
//       Parent1 parent = new Child();
////       Child child = new Parent1();
//    }
//}
