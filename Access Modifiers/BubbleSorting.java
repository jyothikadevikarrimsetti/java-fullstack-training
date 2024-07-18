import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {3,1,34,89,67,42,2,4};
        for(int i=0; i<arr.length; i++){
            for (int j=1; j< arr.length; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
//                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
