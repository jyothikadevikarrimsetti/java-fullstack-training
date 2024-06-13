class Dog {
     void eat() {
        System.out.println("Dog is sleeping");
    }

     void sleep() {
        System.out.println("Dog is eating");
    }

     void bark() {
        System.out.println("Dog is barking");
    }
}
    public  class InterfaceMethod {
        public static void main(String args[]) {
            Dog dog = new Dog();
            dog.eat();
            dog.sleep();
            dog.bark();
    }
}
