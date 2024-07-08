import java.util.Optional;

public class OptionalProgjava {
    void m1(){
        System.out.println("yueubfub");
    }
    public static void main(String[] args) {
        Optional<OptionalProgjava> optionalProgjava = Optional.ofNullable(null);
        OptionalProgjava optionalProgjava1 = optionalProgjava.orElse(new OptionalProgjava());
        optionalProgjava1.m1();
    }
}
