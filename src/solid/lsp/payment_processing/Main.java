package solid.lsp.payment_processing;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod credit = new CreditCardPayment(12345678, "Visa", new Date(), "John Doe");
        PaymentMethod paypal = new PayPalPayment(987654, 1234, "john_doe");
        PaymentMethod bankTransfer = new BankTransferPayments(11223344, "John Doe", AccountType.SAVINGS);


        processor.processPayment(paypal, 455.90D);

    }
}
