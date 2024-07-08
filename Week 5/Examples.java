interface Flowers{
   void fl1();
}
public  class Examples extends House implements Flowers  {
    public void fl1(){

    }
    public void h1(){

    }

    public static void main(String[] args) {
        Flowers f1 = new Examples();
        House h1 = new House(){
            public void h1(){

            }
        };
    }

}
abstract class House{

    abstract void h1();

}
