public class SumofEvenIndexArray {
    public static void main(String args[]){
        int array[] = {1,2,3,4,5,6,7,8,9};
        int sum = sumofEvenIndexes(array);
        System.out.println("Sum of even index of array:"+sum);
    }
    public static int sumofEvenIndexes(int[]array){
        int sum = 0;
        for(int i=0; i<array.length; i+=2){
            sum+=i;
        }
        return sum;
    }
}
