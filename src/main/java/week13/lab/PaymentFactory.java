package week13.lab;

public interface PaymentFactory<T> {
    T createPayment();
}
