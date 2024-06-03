public class LogicalProgram {
    public static int nonrepeating(int arr[]) {
        int result = 0;
        for (int i : arr) {
            result ^= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1, 2};
        int[] arr2 = {1, 1, 3, 3, 7, 8, 9, 7, 8};

        System.out.println(" for arr1: " + nonrepeating(arr1));
        System.out.println(" for arr2: " + nonrepeating(arr2));
    }
}
