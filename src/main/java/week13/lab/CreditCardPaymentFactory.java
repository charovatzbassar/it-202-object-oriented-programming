package week13.lab;

public class CreditCardPaymentFactory implements PaymentFactory<CreditCardPayment> {
    @Override
    public CreditCardPayment createPayment() {
        return new CreditCardPayment();
    }
}
