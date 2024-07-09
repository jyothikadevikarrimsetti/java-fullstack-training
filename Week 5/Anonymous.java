interface Birds{
    void parrot();
    int poi();
    int[] tgt();
    double dbl();
}
abstract class Parent{
    abstract void Abcd();
    void child(){
        System.out.println("Hello");
    }
    abstract void par1();
    void child(int n){
    }
    abstract void piokk(int n);
    void puppy(int d){

    }
}
class Animals extends Parent implements Birds{
   public void parrot(){

    }
    void piokk(int d){

    }
    public double dbl(){
       return 0;
    }
    void Abcd(){

    }
    public int[] tgt(){
       return new int[]{8,0};
    }
    public float f1(){
       return 0;
    }

   public int poi(){
     return 1;
    }
    void par1(){

    }

}
public class Anonymous {
    public static void main(String[] args) {
        Parent p2 =new Parent(){
            void child(){

            }
            void Abcd(){

            }
            void piokk(int d){

            }
            void child(int n){

            }
            void child1(){

            }
            void par1(){

            }

        };
        p2.child();
        Parent p1 = new Parent() {

            void child(){

            }
            void Abcd(){

            }
            void piokk(int d){

            }
            void child(int n){

            }
            void child1(){

            }
            void par1(){

            }
//                System.out.println("hi");




        };
        p1.child();
        }
    }
