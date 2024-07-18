import java.util.LinkedList;
public class LinkedlistReverse {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        for (int i=1; i<=20; i++){
            linkedList.add(i);
        }

        System.out.println(linkedList.reversed());
    }
}
