import java.util.LinkedList;

public class Lists {
    public static void main(String args[]){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
//        linkedList.addFirst(100);
//        linkedList.removeFirst();
        System.out.println("elements in the linkedlist:");
        for(Integer val:linkedList){
            System.out.println(val);
        }
    }
}
