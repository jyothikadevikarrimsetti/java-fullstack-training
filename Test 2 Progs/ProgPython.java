public class ProgPython {
    public static void main(String[] args) {
        String str = "Python";
        int len = str.length();


        for (int i = 1; i <=len*2-1 ; i++) {
            if (i<=len){
                System.out.println(str.substring(0,i));
            }else {
                System.out.println(str.substring(0,2*len-i));
            }
//            for (int j=0; j<i; j++){
//                System.out.println(str.charAt(j));
//            }


        }
    }
}
