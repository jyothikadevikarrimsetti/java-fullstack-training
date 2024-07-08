interface Body{
    void show();
}
interface hand extends Body{
    public default void show(){
        System.out.println("Body a1");
    }
}
public class inface {
    public static void main(String[] args) {
        Body b1 = new hand() {
            @Override
            public void show() {

            }
        };
        b1.show();

    }
}
