import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        String[] arr = {"sju","njj","ase","gtt","jnm"};
        Arrays.sort(arr);
//        System.out.println();
        for (String i:arr){
            System.out.println(i);
        }



        int [] array={1,2,3,4,4,5};

        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }


        int [][] array3={
                {1,2,3},
                {2,3,4},
                {3,4,5}
        };

        int [][] array4 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int result [][] = new int[3][3];
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                result[i][j] = array3[i][j]+array4[i][j];
            }
        }

        for (int i=0; i<3; i++){
//            System.out.println();
            for (int j=0; j<3; j++){
//                System.out.print(array3[i][j]+" ");
                System.out.print(result[i][j]+" ");

            }
            System.out.println();
        }
        //factorial
        int n=5;
        int factorial=1;
        for (int i=1; i<n; i++ ){
            factorial *=i;
        }
        System.out.println("Factorial: "+factorial);

        //fibonacci
        int p=10;
        int a=0, b=1,c;
        System.out.println("fibonacci series of : "+p);

        for (int i=1; i<=p; i++){
            System.out.println(a+" ");
            c=a+b;
            a=b;
            b=c;
        }





    }
}
