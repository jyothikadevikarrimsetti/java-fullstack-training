public class RevNum {
    public static void main(String[] args) {
        int num = -2832;
        int revnum = 0;
        while (num!=0){
            int rem = num%10;
            revnum = revnum*10+rem;
            num = num/10;
            System.out.println(revnum);
        }
    }
}
