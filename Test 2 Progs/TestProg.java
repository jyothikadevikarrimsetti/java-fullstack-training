public class TestProg
{
    static Integer variable = 13;
    static void twice(int[] arr,int variable){

        for(int i = 0;i < arr.length;i++) {
            arr[i] = arr[i] * 2;
        }

            TestProg.variable = variable * 2;


    }

    public static void main(String[] args) {
        int[] arr = {10,11,12};
        int variable = 13;
        twice(arr,variable);
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println(variable);
    }
}


