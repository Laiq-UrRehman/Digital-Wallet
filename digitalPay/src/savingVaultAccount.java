import java.io.Serializable;

class savingVaultAccount extends Account implements Serializable {
    private double interestRate;

    public savingVaultAccount(String accountId, double balance, String createdAt, double interestRate) {
        super(accountId, balance, createdAt);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void calculateInterest() {
        balance += balance * interestRate;
    }
}