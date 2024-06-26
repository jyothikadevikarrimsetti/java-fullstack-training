public class Accesspub {
    int num=20;
    int num2 = 40;
    public void Pubmethod(){
        System.out.println("Public method");
    }
    protected void protectme(){
        System.out.println("Protected method");
    }

    public static void main(String[] args) {
        Accesspub a1 = new Accesspub();
        Accesspub a2 = new Accesspub();
        System.out.println(a1.num);
        System.out.println(a2.num2);
        a1.Pubmethod();
        a2.protectme();
    }
}
