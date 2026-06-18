import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class SerializableDataManager implements Serializable {
    private List<userProfile> users;
    private List<Account> accounts;

    public SerializableDataManager() {
        users = new ArrayList<>();
        accounts = new ArrayList<>();
    }

    public void setUsers(List<userProfile> users) {
        this.users = users;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<userProfile> getUsers() {
        return users;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void registerUser(userProfile user, Account account) {
        users.add(user);
        accounts.add(account);
    }

    public userProfile login(String phone, String pin) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getPhone().equals(phone) && users.get(i).getPin().equals(pin)) {
                return users.get(i);
            }
        }
        return null; // Return null if login fails
    }

}