package access;

public interface BankTransfer {
    //void transfer(BankAccount from, BankAccount to, double amount);
    
    static void transfer(BankAccount from, BankAccount to, double amount) {

        double amountWithFee = amount + 1;

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be larger than 0.");
        }

        if (amountWithFee > 0 && amountWithFee <= from.getBalance()) {
            from.withdraw(amountWithFee);
            to.deposit(amount);
        } else {
            throw new IllegalArgumentException("Amount can not be larger than available funds. Available funds: " + from.getBalance());
        }
    }
}
