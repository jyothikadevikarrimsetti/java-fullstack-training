class Generics<T,K>{
    T i;
    K j;
    Generics(T i , K j){
        this.i = i;
        this.j = j;
    }
    T getDetails(){

        return i;
    }
    K getDetails1(){

        return j;
    }
}
public class GenericsExample {
    public static void main(String[] args) {
        Generics generics = new Generics(1,2);
        System.out.println(generics.getDetails());
        generics.getDetails1();


    }

}
