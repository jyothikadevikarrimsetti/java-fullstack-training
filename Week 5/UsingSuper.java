class Country{
    Country(){
        System.out.println("Country constructor");
    }
}
class India extends Country{
    India(){
        super();
        System.out.println("India constructor");
    }

}
public class UsingSuper {
     public static void main(String[] args) {
         India i1 = new India();
    }
}
