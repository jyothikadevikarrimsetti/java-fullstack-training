public class NewClass {
   private int x;
    private int y;

    public NewClass(int x, int y){
        this.x = x;
        this.y = y;
//        x=3;
//        y=2;
    }
    public void myMethod(){
        System.out.println(x +" "+y);
    }

    public static void main(String[] args) {
        NewClass newClass = new NewClass(2,3);
        newClass.myMethod();

    }
}
