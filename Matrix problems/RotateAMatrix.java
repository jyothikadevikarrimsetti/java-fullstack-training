import java.util.Arrays;

public class RotateAMatrix {
    public static void main(String args[]){
        int matrix[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int result [][]=new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=2; j>=0; j--){
                result [i][matrix.length-1-j]= matrix[j][i];
//                System.out.print(i+""+j+" ");
                System.out.println(Arrays.deepToString(result));

            }
            System.out.println();
        }
        for(int j=0; j<3; j++){
            for(int i=0; i<3; i++){
                System.out.print(result[j][i] +" ");
            }
            System.out.println();
        }
    }
}
