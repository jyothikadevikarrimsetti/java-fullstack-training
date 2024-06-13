
//public class Interface {
//    void connect(){
//        System.out.println("Connect carefully");
//    }
//    void disconnect(){
//        System.out.println("Disconnected");
//    }
//    public static void main(String args[]){
//        Interface i = new Interface();
//        i.connect();
//        i.disconnect();
//    }
interface Employee {
    void salary();
}

class salary implements Employee {
    public void salary() {
        System.out.println("Salary details");
    }

    static class Number {
        void number() {
            System.out.println("6300");
        }
    }
    static class age{
        void age(){
            System.out.println("45");
        }
    }

    public static void main(String args[]) {
        Employee sal = new salary();
        Number empNum = new Number();
        age empage = new age();
        sal.salary();
        empNum.number();
        empage.age();
    }
}