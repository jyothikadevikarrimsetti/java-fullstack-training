public class Multidimensarray {
    public static void main(String args[]) {
        int arr[][] = new int[3][3];
        System.out.println("print rows:" + arr.length);
        System.out.println("print coloumns:" + arr.length);
        int i;
        int j;
        int[][] arr2 = {{1, 2, 3}, {2, 3, 4}, {4, 5, 6}};
        for (i = 0; i < arr2.length; i++) {
            for (j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
