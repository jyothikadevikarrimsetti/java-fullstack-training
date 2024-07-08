 class Outerclass {
    int x = 90;

     class Innerclass1 {
        int y = 10;
    }
}

public class InnerOterClasses {
    public static void main(String[] args) {
        Outerclass outerclass = new Outerclass();
        Outerclass.Innerclass1 innerclass1 = outerclass.new Innerclass1();
        System.out.println(innerclass1.y+outerclass.x);
    }
}
