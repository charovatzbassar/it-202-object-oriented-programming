package week13.lab.problem5;

public class TrafficLightController {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();
        context.getState().transitionToGreen();
    }
}
