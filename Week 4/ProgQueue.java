import java.util.LinkedList;
import java.util.Queue;

public class ProgQueue {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        que.add("Dog");
        que.add("Cat");
        que.add("Elephant");
        que.add("Cow");
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que.poll());
        System.out.println(que);
        System.out.println(que.element());
//        System.out.println(que.peek());
        System.out.println(que);
    }
}
