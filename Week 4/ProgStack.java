import java.util.Stack;

public class ProgStack {
    public static void main(String[] args) {
        Stack<Integer> val = new Stack<>();
        val.push(2);
        val.push(1);
        val.push(8);
        System.out.println(val);
        System.out.println(val.get(1));
//        System.out.println(val);
        System.out.println(val.pop());
//        System.out.println(val);
        System.out.println(val.peek());
//        System.out.println(val);

    }
}
