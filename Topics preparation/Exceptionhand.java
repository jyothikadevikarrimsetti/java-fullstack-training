public class Exceptionhand {
    public static void main(String[] args) {
        int a =10;
        int b=0;
        try {
            int div=a/b;
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
