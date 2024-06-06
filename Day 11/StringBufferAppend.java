public class StringBufferAppend {
    public static void main(String args[]){
        StringBuffer buffer =  new StringBuffer();
        buffer.append("hello");
        buffer.append(" ");
        buffer.append("world");
        String result = buffer.toString();
        System.out.println(result);
        StringBuilder builder = new StringBuilder();
        builder.append("jyothika");
        builder.append("devi");
        String result2 = builder.toString();
        System.out.println(result2);
    }
}


