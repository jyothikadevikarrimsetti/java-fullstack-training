interface Houses1{
    void buildingtype1();

}
interface Houses2{
    void buildingtype2();

}
class Models implements Houses1,Houses2{
    public void buildingtype1(){
        System.out.println("hjkl");
    }
    public void buildingtype2(){
        System.out.println("asdf");
    }


}

public class InterfaceProgram1 {
    public static void main(String[] args) {
        Models m1 = new Models();
        m1.buildingtype1();
        m1.buildingtype2();
    }
}
