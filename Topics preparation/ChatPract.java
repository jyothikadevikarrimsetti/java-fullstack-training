import java.util.Arrays;

public class ChatPract {
    public static void main(String[] args) {
        int [] arr = {1,34,2,54,66,34,90,86};
        int max = arr[0];
        int min = arr[0];

        for (int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i] ;
            }else if (arr[i]<min){
                min=arr[i];
            }

//            System.out.println(arr[i]);
            System.out.println("Max value"+max);
            System.out.println("Min Value"+min);
        }
    }
}
