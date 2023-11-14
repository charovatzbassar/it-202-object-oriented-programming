package week7.lecture;

import java.util.Optional;

record Elephant(String name, int age) {}

public class OptionalsTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Optional<Elephant> kiki = getElephant();

        if (kiki != null) {
            System.out.println(kiki.get().age());
        } else if (kiki.isEmpty()) {
            System.out.println("No elephant");
        }

        Elephant newKiki  = kiki.orElse(new Elephant("Kiki", 3)); // unwrap the optional object, and return the object, if not return something
        Elephant slon = kiki.orElseThrow(ClassNotFoundException::new);
    }

    public static Optional<Elephant> getElephant() {
        return Optional.ofNullable(null);
    }
}
