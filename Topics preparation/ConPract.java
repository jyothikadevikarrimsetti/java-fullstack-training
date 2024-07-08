public class ConPract {
    int age;
    String name;
//    int x;
//    public ConPract(){
//        x = 5;
//    }
//
//    public static void main(String[] args) {
//        ConPract c1 = new ConPract();
//        System.out.println(c1.x);
//    }
//    int x;
//    public ConPract(int y){
//        x=y;
//    }
//
//    public static void main(String[] args) {
//        ConPract c1 = new ConPract(4);
//        System.out.println(c1.x);
//    }
    public ConPract(int age , String name){
        this.name=name;
        this.age = age;
    }

    public static void main(String[] args) {
        ConPract c1 = new ConPract(23,"jyo");
        System.out.println(c1.age+" "+c1.name);
    }
}
