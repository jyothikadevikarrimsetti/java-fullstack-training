public class SlidingWindow2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};    //10+20+30 , 20+30+40, 30+40+50
        int windowSize = 3;
        int sum = arr[0]+arr[1]+arr[2];
        for (int i = windowSize; i<arr.length; i++){
            System.out.println(sum);

            sum = sum+arr[i] -arr[i-windowSize];
        }
    }
}
