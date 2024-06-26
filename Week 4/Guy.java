class Information<T>{
    T obj;               //declare T type object
    Information(T obj)       //constructor to initialize t type object
    {
        this.obj =obj;
    }
    String getInfo(){          //method with returns T type object
        return " "+obj;
    }
}
public class Guy{
    public static void main(String[] args) {
        Integer i= 10;             //create integer class object
        Information<Integer> obj = new Information<>(i);
        System.out.println("U stored:"+obj.getInfo());
        Float f = 12.23f;          //create float object
        Information<Float> obj1 = new Information<>(f);
        System.out.println(obj1.getInfo());
        String str = "jyo";
        Information <String> obj2 = new Information<>(str);
        System.out.println(obj2.getInfo());
    }
}
