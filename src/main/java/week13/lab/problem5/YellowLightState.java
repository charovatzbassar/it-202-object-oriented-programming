package week13.lab.problem5;

public class YellowLightState implements TrafficLightState {
    @Override
    public void transitionToRed() {
        System.out.println("Yellow->Red");

    }

    @Override
    public void transitionToYellow() {
        System.out.println("It is yellow.");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("Yellow->Green");
    }
}
