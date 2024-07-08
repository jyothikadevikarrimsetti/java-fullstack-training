//NESTED CLASSES
class North{
    private class Privateclass{
        private int s =10;
        private int m1(){
            return s;
        }

    }

    protected class Protectedclass{
        int j = 20;

    }

}
public class AccessSpecifiers {
    int i = 20;
    public static void main(String[] args) {
//        System.out.println(i);
        int i =10;
//        System.out.println(i);
        System.out.println(new North().new Protectedclass().j);
        North n1 = new North();
        North.Protectedclass protectedclass = n1.new Protectedclass();

    }
}
