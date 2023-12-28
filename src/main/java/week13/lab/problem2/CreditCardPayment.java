package week13.lab.problem2;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing payment with credit card...");
    }
}
