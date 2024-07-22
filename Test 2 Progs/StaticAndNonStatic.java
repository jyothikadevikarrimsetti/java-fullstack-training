public class StaticAndNonStatic {
    public static int staticvariables=10;
    public int nonstaticvariable=20;
    public static void main(String[] args) {
        System.out.println(staticvariables);
//        System.out.println(nonstaticvariable); // error

    }
    public void nonStaticMethod(){
        System.out.println(nonstaticvariable);
//        System.out.println(staticvariables);
    }
}
