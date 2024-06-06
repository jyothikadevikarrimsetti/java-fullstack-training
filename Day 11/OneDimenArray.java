public class OneDimenArray {
    public static void main(String args[]){
        int[] numbers = {10,20,30,40,50};
        int max = numbers[0];
        int i;
        for( i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("maximum number:"+max);
        int min = numbers[0];
        for(i=0; i<numbers.length; i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("minimum number:"+min);
    }
}
