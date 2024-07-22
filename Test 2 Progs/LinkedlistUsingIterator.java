import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistUsingIterator {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("pomo");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.hasNext());
            break;
        }
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.poll());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        LinkedList<Character> stack = new LinkedList<>();
        stack.add('a');
        stack.add('b');
        stack.add('c');
        stack.add('d');
        System.out.println(stack.pop());

    }
}
