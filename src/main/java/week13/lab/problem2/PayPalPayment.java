package week13.lab.problem2;

public class PayPalPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing payment with PayPal...");
    }
}
