class Outerclass3{
    int x = 10;
    static class Innerclass{
        int y =20;
    }
}
public class StaticInnerclass {
    public static void main(String[] args) {
//        Outerclass3 outerclass3 = new Outerclass3();
        Outerclass3.Innerclass innerclass = new Outerclass3.Innerclass();
        System.out.println(innerclass.y);
    }
}
