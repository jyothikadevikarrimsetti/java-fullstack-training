abstract class Brand{
    abstract void abstractMethod();
    public void conccreteMethod(){
        System.out.println("uhduewfhf");
    }
}
class HeroHonda extends Brand{
    public void abstractMethod(){
        System.out.println("nuihjv");
    }
}

 class AbstarctClass {
    public static void main(String[] args) {
        HeroHonda heroHonda = new HeroHonda();
        heroHonda.abstractMethod();
//        heroHonda.conccreteMethod();



    }
}
