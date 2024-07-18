import java.util.*;
import java.util.concurrent.Phaser;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;

public class SumOfArraysThreads {
    public static void main(String[] args) {
        Runnable run = ()->{
            int arr[] = {1,2,3,4,5};
            int product = 1;
            for (int i=0; i<arr.length; i++){
                product *= arr[i];
            }
//            System.out.println("Product is:"+product);
        };
        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);

//        thread1.start();
//        thread2.start();

        String str = "Hello World";
        String[] strs  = str.split(" ");
//        System.out.println(Arrays.toString(strs));

        for (int i=0; i<strs.length; i++){
//            System.out.print(strs[strs.length-i-1]+" ");
        }
//        System.out.println();
        int[] arr1 = {1,2,3,4,5};
//        System.out.println(arr1[arr1.length-2]);
//        String str2 = "World";
        int a=8;
        int b=(a<<5);
//        System.out.println(b);

        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(2);
        stack.pop();
        stack.peek();
        stack.empty();
//        System.out.println(stack);
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.add(1);
//        deque.add(2);
//        deque.add(4);
//        deque.addFirst(6);
//        deque.remove(2);
//        System.out.println(deque);
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        queue.add(2);
        queue.add(3);
        queue.add(1);
        System.out.println(queue);
        System.out.println(queue.peek());
//        queue.poll();
        
        System.out.println(queue);
//        PriorityQueue priorityQueue = new PriorityQueue();
//        priorityQueue.add(9);
//        priorityQueue.add(1);
//        priorityQueue.add(8);
//        System.out.println(priorityQueue.poll());
//        System.out.println(priorityQueue);

//        for (int i=0; i<20; i++){
//            priorityQueue.add(20-i);
//            System.out.println(priorityQueue);
//        }
//        TreeMap<Integer,Integer > treeMap = new TreeMap<>();
//        HashMap<Integer,Integer> hashMap = new HashMap<>();
//        Hashtable<Integer,Integer> hashtable = new Hashtable<>();
//
//        for (int i=0; i<5; i++){
//            treeMap.put(i,i+1);
//            hashMap.put(i,i+1);
//            hashtable.put(i,i+1);
////            System.out.println(treeMap);
////            System.out.println(hashMap);
//        }
//        System.out.println(treeMap);
//        System.out.println(hashMap);
//        Collections.synchronizedMap(hashMap);
//        System.out.println(hashtable);

//        HashMap<Integer,Integer> hashMap = new HashMap<>();
//        for (int i=0; i<5; i++){
//            hashMap.put(i,i+1);
//            System.out.println(hashMap);
//        }






    }
}
