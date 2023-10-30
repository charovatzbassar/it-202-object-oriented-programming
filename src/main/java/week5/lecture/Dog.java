package week5.lecture;

public class Dog extends Animal {
    private String name;
    private String breed;

    public Dog(int numOfLegs, String name, String breed) {
        super(numOfLegs);
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String saySomething() {
        return "Woof";
    }
}
