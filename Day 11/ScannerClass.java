import java.util.Scanner;

public class ScannerClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int  count = 0;
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            sum +=num;
            count++;
        }
        if(count>0){
            int mean = sum/count;
            System.out.println("mean:"+mean);
        }
        else{
            System.out.println("mean cant be caluculate.");
        }
    }
}
