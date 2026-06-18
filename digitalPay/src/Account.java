import java.io.Serializable;

abstract class Account implements Serializable {
    protected String accountId;
    protected double balance;
    protected String createdAt;

    public Account(String accountId, double balance, String createdAt) {
        this.accountId = accountId;
        this.balance = balance;
        this.createdAt = createdAt;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public abstract boolean deposit(double amount);

    public abstract boolean withdraw(double amount);
}