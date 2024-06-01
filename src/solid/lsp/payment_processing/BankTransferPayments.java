package solid.lsp.payment_processing;

public class BankTransferPayments implements PaymentMethod {

    private int accountNumber;
    private String beneficiaryName;
    private AccountType accountType;

    public BankTransferPayments(int accountNumber, String beneficiaryName, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.beneficiaryName = beneficiaryName;
        this.accountType = accountType;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Started the Bank transfer payment-------");
    }
}
