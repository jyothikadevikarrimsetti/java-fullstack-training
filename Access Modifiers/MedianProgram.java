import java.util.Arrays;

public class MedianProgram {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5 , 6,9};
        int[] arr2 = {2, 4, 6 , 7,7,8};
        int[] array = new int[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            array[i]=arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            array[arr1.length+i]=arr2[i];

        }

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
        if (array.length%2==0){
            float median =(array[array.length/2]+array[array.length/2-1]);
            System.out.println(median/2);
            System.out.println(array[array.length/2]);
        }else{
            float median = array[array.length/2];
            System.out.println(median);
        }




    }
}
