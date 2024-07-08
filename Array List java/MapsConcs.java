import java.util.*;
import java.util.stream.Stream;

public class MapsConcs {
    public static void main(String[] args) {
//        int[] array = new int[8];
//        array[0] =1;
//        array[6] = 9;
//        System.out.println(Arrays.toString(array));

//        for(int i=0; i<array.length;i++){
//            array[i] =i;
//            System.out.println(Arrays.toString(array));
//        }
        ArrayList arr = new ArrayList();
        arr.add(6);
        arr.add("ugygy");
        arr.add(new MapsConcs());
        arr.remove(new MapsConcs());
        System.out.println(arr);

        LinkedList linkedList = new LinkedList<>();
        linkedList.addFirst(8);
        linkedList.addLast(9);
        linkedList.addFirst("hloo");

        Deque<Integer> deque = new LinkedList<>();
        deque.add(2);
        deque.add(9);
        System.out.println(deque.pollLast());

        Stack<Integer> stack = new Stack<>();
        stack.add(8);
        stack.add(7);
        System.out.println(stack.peek());
        System.out.println(stack.pop());


        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(68);
        hashSet.add(98);
        hashSet.add(66);
        hashSet.add(68);
        System.out.println(hashSet);

        TreeSet<Integer> treeset = new TreeSet<>();
        treeset.add(23);
        treeset.add(67);
        treeset.add(29);
        treeset.add(13);
        System.out.println(treeset.add(13));
        System.out.println(treeset.toArray());

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(2, 9);
        treeMap.put(8, 4);
        treeMap.put(7, 9);
        System.out.println(treeMap);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(2, 4);
        hashMap.put(1, 3);
        hashMap.put(9, 5);
        System.out.println(hashMap);

        for (Map.Entry<Integer, Integer> maps : hashMap.entrySet()) {
            System.out.println(maps);
        }

        Iterator itr = hashMap.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


//        Generic generic = new Generic("guu", 4);
//        generic.getDetails();

        //Generics
    }

        class Generic<T, K> {
            T name;
            K age;

            Generic(T name, K age) {
                this.name = name;
                this.age = age;
            }

            String getDetails() {
                System.out.println(this.name + " " + age);
                return name+" "+age;
            }


        }

    }

