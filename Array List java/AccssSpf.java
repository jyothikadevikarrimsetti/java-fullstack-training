public class AccssSpf {
    private static int i = 10;
    private static int j = 20;
    static int k = 30;
    static protected int l = 40;
    private  int p = 50;
    //non static vars
    private int nonstatic_i=3;
    int Nonstatic_j = 32;
    protected int Nonstatic_k = 34;
    public int nonstatic_p = 78;
    int m1(){
        System.out.println();
        return 1;
    }
    private class Privateclass{
        private int privateinnervar = 98;
    }
//    int var1 = new Privateclass().privateinnervar;

    public class PubClass{
        public int pubinnerclass = 55;
    }



    public static void main(String[] args) {
//         int i = 70;
        System.out.println(l);
        System.out.println(new AccssSpf());
        System.out.println(new AccssSpf().new Privateclass().privateinnervar);
        System.out.println(new AccssSpf().new PubClass().pubinnerclass);

    }
}
