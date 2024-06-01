package solid.lsp.payment_processing;

public class PayPalPayment implements PaymentMethod {

    private int paypalId;
    private int passCode;
    private String user;

    public PayPalPayment(int paypalId, int passCode, String user) {
        this.paypalId = paypalId;
        this.passCode = passCode;
        this.user = user;
    }


    @Override
    public void processPayment(double amount) {
        System.out.println("Started the Paypal payment-------");
    }
}
