
class standardWalletAccount extends Account {

    public standardWalletAccount(String accountId, double balance, String createdAt) {
        super(accountId, balance, createdAt);
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
}