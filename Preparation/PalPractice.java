import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class PalPractice {
    public static void main(String[] args) {
//        String str = "madam";
//        boolean p1 = false;
//        for (int i=0; i< str.length(); i++){
//           System.out.println(str.charAt(i)+" "+str.charAt(str.length()-1-i));
//
//            if(str.charAt(i)== str.charAt(str.length()-1-i)){
//                p1 = true;
//            }
//            else{
//                p1 = false;
//                break;
//            }
//
//        }
//        if(p1){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not palindrome");
//        }
        int[] arr = {1,2,3,2,1,4,5,5};
        HashMap<Integer,Integer> h1 = new HashMap<>();
        int unique =0;
        for(int i=0; i<arr.length; i++){
           if(h1.containsKey(arr[i])){
               h1.put(arr[i],h1.get(arr[i])+1);
           }

           else{
               h1.put(arr[i],1);
           }
//            System.out.println(arr[i]);
        }
        for(Map.Entry<Integer,Integer> m1 : h1.entrySet()){
//            System.out.println(m1);
            if(m1.getValue()==1){
                System.out.println(m1.getKey());
            }
        }
        System.out.println(h1);
//        System.out.println(unique);
        ArrayList<ArrayList<Integer>> a1 = new ArrayList<>();
        ArrayList<Integer>innerlist = new ArrayList<>();
        innerlist.add(1);
        a1.add(innerlist);


        System.out.println(innerlist);
//        a1.add(1);
//        a1.add(2);
//        a1.add(3);
//        System.out.println(a1.get(0));
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        System.out.println(l1);


    }
}
