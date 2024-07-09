public class Constructors {
    int id ;
    String name;
 private Constructors (int id , String name ){    //constructor
     this.id = id;
     this.name = name;

//return 0;

//    System.out.println("Apple");
}
public void Display(){    //method
    System.out.println(id+" , "+name);
//    super();
//    return 9;
 }
// public  display1(){
//
// }
public static void main(String[] args) {
    Constructors mem1 = new Constructors(1234,"jyo");
    Constructors mem2 = new Constructors(4567,"devi");
    mem1.Display();
    mem2.Display();


}
}
