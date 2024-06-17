import java.util.Hashtable;

 class RemovingHashFromHashtable{
    public static void main(String args[]){
        Hashtable<Integer,String> h1 =new Hashtable<>();
        Hashtable<Integer,String> h2 =new Hashtable<Integer,String>();
        h1.put(1,"one");
        h1.put(2,"two");
        h1.put(3,"three");

        h2.put(4,"four");
        h2.put(5,"five");
        h2.put(6,"six");
//        System.out.println("hashtable off h1 = " +h1);
        System.out.println("Before mapping:" +h1);
        h1.remove(3);
//        System.out.println("hashtable of h2 = "+h2);
        System.out.println("After mapping:" +h1);


    }
}
