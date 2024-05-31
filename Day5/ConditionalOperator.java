public class ConditionalOperator {
    public static void main(String args[]){
        int n1 = 10;
        int n2 = 20;
        if(!(n1==10)){
            System.out.println("true");
            }
        else{
            System.out.println("false");
        }
        boolean val = (n1 != 10) ? true : false;
        System.out.println(val);
    }
}
