public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int windowsize = 3;
        int sum = arr1[0]+arr1[1]+arr1[2];

        for (int i = 3; i < arr1.length; i++) {
            System.out.println(sum);
            sum=(sum-arr1[i-3]+arr1[i]);



        }
    }

}
