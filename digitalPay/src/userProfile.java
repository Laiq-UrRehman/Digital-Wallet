import java.io.Serializable;

class userProfile implements Serializable {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String pin;
    private boolean isFrozen;

    public userProfile(int id, String name, String phone, String pin, String email, boolean isFrozen) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.pin = pin;
        this.email = email;
        this.isFrozen = isFrozen;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setFrozen(boolean isFrozen) {
        this.isFrozen = isFrozen;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPin() {
        return pin;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public boolean verifyPin(String inputPin) {
        return this.pin.equals(inputPin);
    }
}