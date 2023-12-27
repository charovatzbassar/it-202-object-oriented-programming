package week13.lab.problem5;

public class GreenLightState implements TrafficLightState {
    @Override
    public void transitionToRed() {
        System.out.println("Green->Yellow");
        System.out.println("Yellow->Red");

    }

    @Override
    public void transitionToYellow() {
        System.out.println("Green->Yellow");

    }

    @Override
    public void transitionToGreen() {
        System.out.println("It is green.");

    }
}
