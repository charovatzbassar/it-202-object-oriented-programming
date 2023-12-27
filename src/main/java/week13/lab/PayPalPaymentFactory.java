package week13.lab;

public class PayPalPaymentFactory implements PaymentFactory<PayPalPayment> {
    @Override
    public PayPalPayment createPayment() {
        return new PayPalPayment();
    }
}
