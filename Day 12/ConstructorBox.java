public class ConstructorBox {
        int boxno;
        double width,height,depth;
        void box(double w, double h, double d, int num){
            width = w;
            height = h;
            depth = d;
            boxno = num;
        }
        void box(){
            width=height=depth=0;
        }
        void box(int num){
            this ();
            boxno = num;
        }
    public static void main(String args[]){
            box box1 = new box(1);
        System.out.println(box1.width);
    }
}
