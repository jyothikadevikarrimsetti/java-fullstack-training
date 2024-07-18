public class ConstructorEx {
    int x;
    String name;
    int age;
    public ConstructorEx(int y,String str,int age){
         x=y;
        this. name = name;
         this.age=age;

    }

    public static void main(String[] args) {
        ConstructorEx constructorEx = new ConstructorEx(7,"jyo",20);
        System.out.println(constructorEx.x);

    }
}
