public class AdditionsOftwomatrix {
    public static void main(String args[]) {
//        int matrix1[][] = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int matrix2[][] = {
//                {9, 8, 7},
//                {6, 5, 4},
//                {3, 2, 1}
//        };
//        int result[][] = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++){
//                result[i][j] = matrix1[i][j] + matrix2[i][j];
//
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}

        int matrix1[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int matrix2[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int result[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        int m1[][] = {
                {1,2,3},
                {2,3,4},
                {3,4,5}
        };
        int m2[][] ={
                {2,3,4},
                {3,4,5},
                {4,3,5}
        };

        int result1[][] = new int[3][3];
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3 ; j++) {
                result1[i][j] = m1[i][j]+m2[i][j];


            }

        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(result1[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println(8<<3);
    }
}