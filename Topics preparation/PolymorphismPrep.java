class Food123 {
    public void foodTaste() {
        System.out.println("Idly is okk");
    }
}
    class Dosa extends Food123{
        public void foodTaste(){
            System.out.println("Dosa is okk");
        }

    }
    class Vada extends Food123{
    public void foodTaste(){
        System.out.println("vada is okk");
    }
    }


public class PolymorphismPrep {
    public static void main(String[] args) {
        Dosa dosa = new Dosa();
        dosa.foodTaste();
//        Food123 food123 = new Food123();
//        food123.foodTaste();
    }
}
