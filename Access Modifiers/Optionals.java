import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {

    }
    Optionals optionals = null;

    Optional<Optionals> optionalsExample = Optional.ofNullable(null);
    Optionals optionalExample1 = optionalsExample.orElse(new Optionals());



}
