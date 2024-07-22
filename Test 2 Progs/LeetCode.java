public class LeetCode {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},
                {9,11,13},
                {15,16,17}};

        for (int i = 0; i < matrix.length; i++) {
            int luckynum = matrix[0][0];
            for (int j=0; j< matrix[0].length; j++ ){
                if(luckynum>matrix[i][j]  ){
                    luckynum = matrix[i][j];
//                    System.out.println(luckynum);

                }
//                if(luckynum>matrix[j][i]){
//                    luckynum = matrix[j][i];
//
//
//                }

            }
            System.out.println(luckynum);

        }
//        System.out.println(luckynum);
    }
}
