public class NextSequenceCharOfAString {
    public static void main(String args[]){
    String seq = "xyz";
    String nextseq = sequenceMethod(seq);
    System.out.println(nextseq);
    }
    public static String sequenceMethod(String val){
        char[] charArray =val.toCharArray();
        for (int i =0; i<= charArray.length-1; i++){
            if (charArray[i] == 'z'){
                charArray[i] = 'a';
            }else if (charArray[i] == 'Z'){
                charArray[i] ='A';
            }else {
                charArray[i] =(char) (charArray[i]+1);
            }
        }
        return new String(charArray);
    }
}