import java.util.Optional;

public class Twofer {
    public String twofer(String name) {
        String you = Optional.ofNullable(name).orElse("you");

        return "One for " + you + ", one for me.";
    }
}
