package week13.lab.problem5;

public class RedLightState implements TrafficLightState {
    @Override
    public void transitionToRed() {
        System.out.println("It is already red.");
    }

    @Override
    public void transitionToYellow() {
        System.out.println("Red->Yellow");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("Red->Yellow");
        System.out.println("Yellow->Green");
    }
}
