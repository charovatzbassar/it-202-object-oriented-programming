package week13.lab;

public class PayPalPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing payment with PayPal...");
    }
}
