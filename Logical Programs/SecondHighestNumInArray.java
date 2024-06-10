public class SecondHighestNumInArray {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};
        int secondhighestnum = findsecondhighest(arr);
        System.out.println("find second highest number:" + secondhighestnum);
    }
    public static int findsecondhighest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array have at least two elements.");
            return -1;
        }

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest &&  num != highest) {
                secondHighest = num;
            }
        }

        return secondHighest;
    }
}

