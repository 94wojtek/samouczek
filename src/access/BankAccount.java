package access;

public class BankAccount implements Account, BankTransfer{

    private double balance;

    public BankAccount() {
        System.out.println("New account open bonus: 1000");
        this.balance = 1000;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Amount to deposit must be larger than 0.");
        }
        else {
            this.balance += amount;
        }
        System.out.println("Recipient balance after deposit: " + getBalance());
    }

    @Override
    public void withdraw(double amount) {

        if(amount > this.balance) {
            System.out.println("Sender has not enough money on account. Available funds: " + getBalance());
        }
        else {
            this.balance -= amount;
        }
        System.out.println("Sender balance after withdrawal: " + getBalance());
    }

    @Override
    public void transfer(BankAccount from, BankAccount to, double amount) {

        double amountWithFee = amount + 1;

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be larger than 0.");
        }

        if (amountWithFee > 0 && amountWithFee <= from.getBalance()) {
            from.withdraw(amountWithFee);
            to.deposit(amount);
        }
        else {
            throw new IllegalArgumentException("Amount can not be larger than available funds. Available funds: " + from.getBalance());
        }
    }
}

class Bank {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();

        acc2.deposit(100);
        acc1.transfer(acc2, acc1, 5);
    }
}
