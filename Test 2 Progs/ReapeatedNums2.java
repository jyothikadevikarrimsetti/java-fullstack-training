import java.util.HashMap;
import java.util.Map;

public class ReapeatedNums2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,4,5};
        HashMap<Integer,Integer> maps = new HashMap<>();
        for (int i=0; i< arr.length; i++){
            if(maps.containsKey(arr[i])){
                maps.put(arr[i],maps.get(arr[i])+1);
            }
            else{
                maps.put(arr[i],1);
            }
        }

        for (int i : maps.keySet()){
            if (maps.get(i)==2){
                System.out.println(i);
            }
        }
        for (Map.Entry<Integer,Integer> entry : maps.entrySet()){
            if (entry.getValue()==2){
                System.out.println(entry.getKey());
            }
        }
        System.out.println(maps.keySet());

        for (int i = 0; i <arr.length ; i++) {
            int count =1;
            for (int j = i; j <arr.length ; j++) {
                if(arr[i]==arr[j] && i!=j){
                    count++;
//                    System.out.println(arr[i]);
                }
            }
            if (count==2){
                System.out.println(arr[i]);
            }

        }
    }

}
