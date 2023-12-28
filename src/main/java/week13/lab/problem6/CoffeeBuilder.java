package week13.lab.problem6;

public interface CoffeeBuilder {
    String getType();
    CoffeeSize getSize();
    String[] getToppings();
    CoffeeBuilder buildToppings(String[] toppings);

}
