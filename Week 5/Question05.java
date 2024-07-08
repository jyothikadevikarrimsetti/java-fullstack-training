import java.io.IOException;

public class Question05 {
    public static void main(String[] args) {
        Question05Sub myref = new Question05Sub();
        try{
            myref.test();
        }
        catch(IOException ioe){}
    }
    void test() throws IOException {
        System.out.println("In Question05_JBK");
        throw new IOException();
    }
}

class Question05Sub extends Question05 {
    void test()throws IOException {
        System.out.println("In Question05Sub");
    }
}
