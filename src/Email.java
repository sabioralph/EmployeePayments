public class Email {
    private String emailAddress;

    // arg constructor 
    public Email(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    // Getter and setter for email address
    public String getEmailAddress() {
        return this.emailAddress;
    }

    // 
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    // toString method()
    @Override
    public String toString() {
        return this.emailAddress;
    }
}

