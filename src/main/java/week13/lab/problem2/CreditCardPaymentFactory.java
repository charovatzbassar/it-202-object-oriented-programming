package week13.lab.problem2;

public class CreditCardPaymentFactory implements PaymentFactory<CreditCardPayment> {
    @Override
    public CreditCardPayment createPayment() {
        return new CreditCardPayment();
    }
}
