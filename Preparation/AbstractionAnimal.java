abstract class wildanimals {
     public abstract void sound();
     public void eat(){
         System.out.println("animal is eating");
     }
}
class Tiger extends wildanimals{
    public void sound(){
        System.out.println("hugugug");
    }
}
class Lion extends wildanimals{
    public void sound(){
        System.out.println("ghdys");
    }
}
public class AbstractionAnimal{
    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.sound();
        l1.eat();
        Tiger t1 = new Tiger();
        t1.sound();
        t1.eat();
    }
}

