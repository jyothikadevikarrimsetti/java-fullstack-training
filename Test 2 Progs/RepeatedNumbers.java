import java.util.HashSet;

public class RepeatedNumbers {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,3,4,5,4};
        HashSet<Integer> hashSet = new HashSet<>();

        HashSet<Integer> hashSet1 = new HashSet<>();
        for (int i = 0; i < arr.length ; i++) {
            if (hashSet.add(arr[i])){

            }
            else {


                if(!hashSet1.contains(arr[i])){
                    hashSet1.add(arr[i]);

                }else {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
