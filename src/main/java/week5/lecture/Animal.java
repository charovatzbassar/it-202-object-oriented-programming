package week5.lecture;

public abstract class Animal implements AnimalAbility {
    private int numOfLegs;

    public Animal(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public abstract String saySomething(); // not providing the implementation

    @Override
    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }
}
