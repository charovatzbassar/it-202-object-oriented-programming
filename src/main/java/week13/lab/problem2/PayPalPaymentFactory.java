package week13.lab.problem2;

public class PayPalPaymentFactory implements PaymentFactory<PayPalPayment> {
    @Override
    public PayPalPayment createPayment() {
        return new PayPalPayment();
    }
}
