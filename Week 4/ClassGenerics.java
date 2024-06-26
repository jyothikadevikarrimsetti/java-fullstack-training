class Gen1<T,K,C>{
    T val;
    K key;
    C val1;
    Gen1(T val ,  K key , C val1){
        this.val=val;
        this.key=key;
        this.val1=val1;
    }
    T getVal(){
          return val;
    }
    K getKey(){
        return key;
    }
    C getVal1(){
        return val1;
    }
}
public class ClassGenerics {
    public static void main(String[] args) {
        Gen1<String,Integer,Float> gen1 = new Gen1<>("jyo", 12 , 12.23f);
        String value = gen1.getVal();
        int val =gen1.getKey();
        float val1 = gen1.getVal1();
        System.out.println("Value: "+value);
        System.out.println("Key: "+val);
        System.out.println("Val1:"+value);
    }

}
