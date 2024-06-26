class Reusability<T> {
    T name;
    T age;

    public Reusability(T name, T age) {
        this.name = name;
        this.age = age;
    }

    String getDetails() {
        return name + " " + age;
    }
}
public class ProgGeneric{
    public static void main(String[] args) {
        Reusability<String> reuse =  new Reusability<>("jyo","ka");
        Reusability<Integer> reuse2 = new Reusability<>(20,21);
        System.out.println(reuse.getDetails());
        System.out.println(reuse2.getDetails());
    }
}
