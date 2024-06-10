public class SearchAnElement {
    public static void main(String args[]){
        int matrix[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int number = 5;
        int rows = matrix.length;
        int colms= matrix[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<colms; j++){
                if(matrix[i][j] == number){
                    System.out.println(number);
                    return;
                }
            }
        }
        System.out.println(" ");
        System.out.println(-1);
    }
}
