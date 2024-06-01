package solid.lsp.payment_processing;

import java.util.Date;

public class CreditCardPayment implements PaymentMethod {

    private int cardNumber;
    private String cardType;
    private Date expiryDate;
    private int cvv;
    private String name;

    public CreditCardPayment(int cardNumber, String cardType, Date expiryDate, String name) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.expiryDate = expiryDate;
        this.cvv = 234; // can assign some randon three digit number here;
        this.name = name;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Started the Credit Card payment-------");
    }
}
