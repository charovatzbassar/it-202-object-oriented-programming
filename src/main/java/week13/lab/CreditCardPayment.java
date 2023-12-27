package week13.lab;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing payment with credit card...");
    }
}
