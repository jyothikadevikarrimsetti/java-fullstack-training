abstract class WildAnimals{
    abstract void sound();
    abstract void move();
}
class Puppy extends WildAnimals{
    void sound(){
        System.out.println("Tiger euu");
    }
    void move(){
        System.out.println("tiger move");
    }
}
public class Abstractmain {
    public static void main(String[] args) {
        WildAnimals w1 = new Puppy();
        w1.sound();
        w1.move();

    }
}
