public class WrapperClasses {
    public static void main(String[] args) {
        Integer num1 = new Integer(10);
        Integer num2 = Integer.valueOf(20);
        int val1 = num1.intValue();
        String str = num2.toString();
        boolean isEqual = num1.equals(num2);
        System.out.println("Integer ex:"+num1);
        System.out.println("boolean:"+isEqual);
        Character char1 = new Character('a');
        Character char2 = Character.valueOf('b');
        char c1 = char1.charValue();
        String str1 = char2.toString();
        System.out.println("char value :"+c1);
        System.out.println("To string:"+str1);
//        Boolean b1 = new Boolean(true);
//        Boolean b2 = Boolean.getBoolean(false);
//        boolean bool1 = b1.booleanValue();
//        boolean bool2 = b2.equals();
//        System.out.println("condition:"+bool1);
    }
}
