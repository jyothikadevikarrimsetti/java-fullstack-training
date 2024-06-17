import java.util.LinkedList;

public class list{
    public static void main(String args[]){
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("Apple");
        l1.add("banana");
        l1.add("grapes");
        l1.addLast("biriyani");
        l1.addFirst("Rice");
        System.out.println(l1.get(1));;
        System.out.println("linkedlist elements:"+l1);
    }
}
