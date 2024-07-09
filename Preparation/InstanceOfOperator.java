public class InstanceOfOperator {
    public static void main(String[] args) {
        Object obj ="jyo" ;
        if(obj instanceof String){
            String str =(String) obj;
            System.out.println("the object is a string "+str);
        }
        else {
            System.out.println("not a string");
        }
    }
}
