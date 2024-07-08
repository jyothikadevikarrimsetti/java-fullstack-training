import java.util.Arrays;

public class MultiplyTwoMatrix {
    public static void main(String args[]) {
        int matrix1[][] = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        int matrix2[][] = {
                {7, 8, 9},
                {10, 11, 12}
        };
        int result[][] = new int[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                for (int k = 0; k < matrix1.length; k++) {
                    result[i][k] += matrix1[i][j] * matrix2[j][k];
                    System.out.print(result[i][j] + " ");
                    System.out.println(i+" "+j+" "+k);

                }
                System.out.println();
            }
        }
//        System.out.println(Arrays.deepToString(result));
//            for (int i = 0; i < result.length; i++) {
//                for (int j = 0; j < result.length; j++) {
//                    System.out.print(result[i][j] + " ");
//                }
//                System.out.println();
//            }
//        int result[][]= new int[3][3];
//        for(i =0; i<matrix1.length; i++){
//            for (j=0;j<matrix1[0].length;j++){
//                for(k=0;,k<matrix1.length;k++){
//                    result[i][k] = matrix1[i][j]*matrix2[j][k];
//                    System.out.println(result[i][k]+" ");
//                    System.out.println(i+""+j+""+k);
//                }
//            }
//        }
        }
    }

