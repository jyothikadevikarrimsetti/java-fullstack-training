public class MethodPractReturnValues {
    static int myMethod(int x){
        return x+5;
    }
    static int myMethod1(int y, int z){
        return y+z;
    }
    static int myMethod2(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(6));
        System.out.println(myMethod1(2,3));
        int c = myMethod2(11,7);
        System.out.println(c);
        float result = 7/2f;
        System.out.println(result);
    }
}
