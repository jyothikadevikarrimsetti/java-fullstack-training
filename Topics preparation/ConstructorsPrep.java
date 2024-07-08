//class Fruit{
//    Fruit(){
//        System.out.println("Fruit");
//    }
//
//}
//class Mango {
//    Mango(){
//        super();
//    }
//    Mango(int i){
//        this();
//    }
//}

//class Mobiles {
    //    String name;
//    String num;
//    Mobiles(String name , String num){
//        this.name=name;
//        this.num = num;
//    }
//}
//
//class Fruit {
//    Fruit() {
//        System.out.println("Fruits");
//    }
//}
//    class Mango{
//    Mango(){
//        super();
//    }
//    Mango(int i){
//        this();
//    }
//}
//class Anima{
//    Anima(){
//        System.out.println("animal");
//    }
//}
//class Doggy {
//    Doggy() {
//
//        super();
//    }
//    Doggy(int d){
//        this();
//    }
//}
//class Animat{
//    Animat(){
//        System.out.println("anm");
//    }
//    class Monkey{
//        Monkey(){
//            super();
//        }
//        Monkey(int id){
//            this();
//        }
//    }
//}
//interface Fruitee {
//    default void method1() {
//        System.out.println("Fruitee");
//    }
//}
//
//class Mango implements Fruitee {
//    public static void main(String[] args) {
//        Mango m1 = new Mango();
//        m1.method1();
//    }
//}


//            int arr[] = {1,2,3,4};
//                Thread thread1 = new Thread(()->{
//                });
//                thread1.start();
//                thread1.join();
//            System.out.println(arr);



//            int a;
//            System.out.println(a);
//        int a;
//        System.out.println(a);
//        Integer[] b = new Integer[10];
//        System.out.println(b[0]);
//        String str1 = new String("hello"); // it compares both object references
//        String str2 = new String("hello");
//        System.out.println(str1 == str2);
//        Integer c;
//        System.out.println(c);
//class ConstructorsPrep{
//    public static void main(String[] args) {
//        int[] d = new int[10];
//        System.out.println(d[0]);
//    }
//    }
class Parent6{
    Parent6(){
        System.out.println("Parent is called");
    }
}
class Child extends Parent6{
    Child(){
        System.out.println("Child is called");
    }
}
class Main5{
    public static void main(String args[]){
       Child parent = new Child();
    }
}

//        Integer[] b = new Integer[10];
//        System.out.println(b[0]);
//        Integer c;
//        System.out.println(c);
//        int[] d = new int[10];
//        System.out.println(d[0]);

//    }
//}
//interface Fruit{
//    default void method1(){
//        System.out.println("abc");
//    }
//}
//class Apple implements Fruit{
//    public static void main(String args[]){
//
//        Apple m1 = new Apple();
//        m1.method1();
//
//



