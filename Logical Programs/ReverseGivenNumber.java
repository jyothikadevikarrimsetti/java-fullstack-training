public class ReverseGivenNumber {
    public static void main(String args[]){
        int num = 283223;
        int reversenum = 0;
        while(num!=0){
            int digit = num %10;
            reversenum =reversenum*10 +digit;
            num /=10;
        }
        System.out.println("Reverse number is:"+reversenum);
    }
}
