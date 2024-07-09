import java.util.Arrays;

public class Preparation {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int arr2[] = {5, 6, 7, 8};
//        int i=0;
//        int temp = arr[i];
//        arr2[i]=temp;
//        System.out.println(arr2[i]);

//    int temp =0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr2[i];
            arr2[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}

