package access;

public interface BankTransfer {
    void transfer(BankAccount from, BankAccount to, double amount);
}
