package week13.lab.problem6;

public class CoffeeDirector {
    public Coffee constructCoffee(CoffeeBuilder builder) {
        return new Coffee(builder);
    }
}
