import java.util.*;

public class Hashmapjyo {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();
        int[] arr1 = {1,2,3,4,5,2};
        for(int i =0; i<arr1.length; i++){
            if(!hashMap.containsKey(arr1[i])){
                hashMap.put(arr1[i],new ArrayList<>());
                hashMap.get(arr1[i]).add(i);
            }
            else{
                hashMap.get(arr1[i]).add(i);
            }


        }
        System.out.println(hashMap);
        Collections.synchronizedMap(hashMap);

        Iterator iterator = hashMap.entrySet().iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//
//        }
//        for (Map.Entry<Integer,ArrayList<Integer>> jimmy : hashMap.entrySet()){
//            System.out.println(jimmy);
//        }
        for (int argb : hashMap.keySet()){
            System.out.println(argb);
        }


//        int target = 2;
//        System.out.println(hashMap.get(target));
//        System.out.println(hashMap);
//        hashMap.put("devi","jyo");
//        hashMap.put("cheebaa","subbu");
//        System.out.println(hashMap.containsKey(7));
//        System.out.println(hashMap);

    }
}
