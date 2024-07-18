public class ExceptionInThreads {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
//        System.out.println(arr1[5]);
        try {
            System.out.println(arr1[5]);

        }catch (ArrayIndexOutOfBoundsException aie){
            aie.printStackTrace();
        }
    }
}
