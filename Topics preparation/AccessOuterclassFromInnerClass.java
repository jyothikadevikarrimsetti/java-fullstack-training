class Outerclass4{
    int x =220;
    class Innerclass{
        public int innerMethod(){
            return x;
        }
    }
}

public class AccessOuterclassFromInnerClass {
    public static void main(String[] args) {
        Outerclass4 outerclass4 = new Outerclass4();
        Outerclass4.Innerclass innerclass = outerclass4.new Innerclass();
        System.out.println(innerclass.innerMethod());
    }
}
