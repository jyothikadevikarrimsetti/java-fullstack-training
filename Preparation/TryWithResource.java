import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TryWithResource {
    public static void main(String[] args) {
//        try {
//            System.out.println("Open files");
//            int n = args.length;
//            System.out.println("n=" + n);
//            int a = 45 / n;
//            System.out.println("a=" + a);
//            System.out.println("Close files");
//            int b [] = {10,20,30};
//            b[50] = 100;
//        }
//        catch (ArithmeticException ae){
//            System.out.println(ae);
//            System.out.println("Pass the data");
//        }
//        catch(ArrayIndexOutOfBoundsException aie){
//            aie.printStackTrace();
//            System.out.println("Seee the array index range");
//        }
//
//        finally {
//            System.out.println("Close files");
//        }
//    }
//}
        String filePath = "example.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println("IOExectption was catch:" + e.getMessage());
        }
//        int arr[] = {2,1,5,3,6,4,7,5,6};
//        Arrays.sort(arr);
//        System.out.println(Arrays.deepToString(arr));
//        class m1 extends Exception{
//            public m1(){
//                super();
//            }
//        }
//        public class TryWithResouse{
//            public static void main(String[] args) {
//                try {
//                    throw new m1();
//                }
            }

        }

