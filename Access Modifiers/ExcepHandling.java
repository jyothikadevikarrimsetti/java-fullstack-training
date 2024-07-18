class CustomException extends Exception{
    public CustomException(){
        super();
    }
//    public CustomException(String message){
//        super(message);
//    }

}
public class ExcepHandling {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException aie){
            System.out.println("Array exception:"+aie.getMessage());

//            aie.printStackTrace();
//            aie.getMessage();
        }catch (Exception e){
            System.out.println("Catch Exception"+e.getMessage());
        }
//        finally {
//            System.out.println("jyo");
//        }
        try{
            throw new CustomException();
        }catch (CustomException ce){
            System.out.println("handling exception"+ce.getMessage());
        }


    }
}
