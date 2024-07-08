 interface  Sweets{
    void smell();
    void colour();
    default void show(){
        System.out.println("Colour and smell");
    }
}
 class Fruits implements Sweets{

    public void smell(){
        System.out.println("smell");
    }
    public void colour(){
        System.out.println("colour");
    }

}
public class InterfacePogram {
    public static void main(String[] args) {
        Fruits p1 = new Fruits();
        p1.colour();
        p1.show();
        p1.colour();

//        p1.show();
    }
}
