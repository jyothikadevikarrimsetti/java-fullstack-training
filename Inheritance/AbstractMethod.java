abstract class Animal{
    abstract void sound();
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class Pig extends Animal {
    void sound() {
        System.out.println("Pig barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class AbstractMethod {
    public static void main(String[] args) {
        Pig pig = new Pig();
        Cat cat = new Cat();
        pig.sound();
        pig.sleep();
        cat.sound();
        cat.sleep();
    }
}
