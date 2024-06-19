import java.util.TreeSet;

public class SetTree {
    public static void main(String args[]){
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(4);
        tree.add(7);
        tree.add(2);
        tree.add(1);
        System.out.println("Elements in the tree set:"+tree);
            tree.remove(2);
        System.out.println(tree.contains(9));
        System.out.println("Elements in sorted order:"+tree);
        for(Integer element : tree ){
            System.out.println(element+" ");
        }
        System.out.println();
    }
}
