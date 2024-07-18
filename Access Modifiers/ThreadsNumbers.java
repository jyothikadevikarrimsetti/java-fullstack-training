import java.util.Arrays;

public class ThreadsNumbers {
    public static void main(String[] args) {
        int [] arr1 ={1,2,3,4,5};
//        for (int i=0; i<arr1.length; i++){
////            int j = arr1[i]-1-i;
////            int rev = arr1.length-1-i;
////            System.out.println(arr1[i]+" "+arr1[rev]);
//            System.out.println(arr1[i]+" ");
////            if (i<arr1.length-1){
//                System.out.println(arr1[i]+1);
//
//            }
//        int i=0;
//        while (i<arr1.length){
//            System.out.println(arr1[i]);
//            i++;
//        }
        int i =0;
        while (i<arr1.length){
            arr1[i] = arr1[i]*arr1[i]*arr1[i];

            System.out.println( Arrays.toString(arr1));

//            System.out.println(arr1[i]+1);
            i++;
        }
        Arrays.toString(arr1);
        }
    }

