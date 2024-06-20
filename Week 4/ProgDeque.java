import java.util.ArrayDeque;
import java.util.Deque;

public class ProgDeque {
    public static void main(String args[]){
        Deque<String> q1 = new ArrayDeque<>();
        q1.add("sun");
        q1.add("moon");
        q1.add("sky");
        q1.addFirst("apple");
        System.out.println("after adding frst:"+q1);
        q1.addLast("banana");
        System.out.println("after add last:"+q1);
        System.out.println(q1.pollFirst());
        System.out.println(q1.poll());
        System.out.println(q1.pollLast());
        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1.pollLast());
//        System.out.println(q1);

    }

}
