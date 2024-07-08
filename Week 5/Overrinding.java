class Manager{
    String name;
    String regno;
    void m1(String name,String regno){
        System.out.println("Manager");
    }
}
class AssManager extends Manager{
    void m1(){
        System.out.println("AssManager");
    }

}
public class Overrinding {
    public static void main(String[] args) {
        Manager manager = new AssManager();
        manager.m1("jyo","456");
//        System.out.println();
    }
}
