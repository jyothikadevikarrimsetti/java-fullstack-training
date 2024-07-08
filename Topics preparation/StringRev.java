public class StringRev {
    public static void main(String[] args) {
        String str = "Jyothika";
        String revstr = " ";
        System.out.println("original string:"+str);
        for(int i=0; i<str.length(); i++){
            revstr = str.charAt(i)+revstr;
        }
        System.out.println("Reverse String: "+revstr);
    }
}
