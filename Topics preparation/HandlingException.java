public class HandlingException {
    public static void main(String[] args) {
       int arr[] =new int[2];           //{1,2,3,4,5};
        try{
            System.out.println(arr[9]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
