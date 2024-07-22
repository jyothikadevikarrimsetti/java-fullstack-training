import java.util.Arrays;

public class KthElement {
    public static void main(String[] args) {
//      int[] arr = {1,5,2,4,3};
//      int k = 2;
//        Arrays.sort(arr);
//        System.out.println(arr[k-1]);
        int arr1[] = {1,2,3};
        int arr2[] = {3,2,1};
        Arrays.sort(arr2);
        boolean bool = false;
        for (int i=0; i<arr1.length; i++){
            if(arr1[i]==arr2[i]){
                bool= true;
            }else {
                bool =false;
                break;
            }
        }
        System.out.println(bool);
    }
}
