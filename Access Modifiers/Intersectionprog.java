public class Intersectionprog {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6};
        int sPointer = 0;
        int tPointer =1;
        while (sPointer<arr1.length){
            if((tPointer%arr2.length)==0){
                sPointer++;
            }
            else if(arr1[sPointer]==arr2[(tPointer-1)%arr2.length]){
                System.out.print(arr1[sPointer]+" ");
            }
            tPointer++;
        }
    }
}
