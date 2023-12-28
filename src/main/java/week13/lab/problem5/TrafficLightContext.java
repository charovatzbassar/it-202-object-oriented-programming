package week13.lab.problem5;

public class TrafficLightContext {
    private TrafficLightState state;

    public TrafficLightContext() {
        this.state = new RedLightState();
    }

    public void transitionToRed() {
        this.state = new RedLightState();
    }

    public void transitionToYellow() {
        this.state = new YellowLightState();
    }
    public void transitionToGreen() {
        this.state = new GreenLightState();
    }

    public TrafficLightState getState() {
        return state;
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }
}
