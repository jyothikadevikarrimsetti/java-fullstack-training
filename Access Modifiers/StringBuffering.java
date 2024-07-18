public class StringBuffering {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("jyothika");
        String str = stringBuffer.toString();
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder);
        stringBuilder.insert(1,3);
//        stringBuilder.insert()
//        stringBuffer.append(" devi");
//        System.out.println(stringBuffer);

    }
}
