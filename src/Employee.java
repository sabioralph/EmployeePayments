abstract class Employee {
    private Name name;
    private Address mailingAddress;
    private Email email;

    // Constructor
    public Employee(Name name, Address mailingAddress, Email email) {
        this.name = name;
        this.mailingAddress = mailingAddress;
        this.email = email;
    }

    // getters and setters for the name 
    public Name getName() {
        return this.name;
    }

    public Address getMailingAddress() {
        return this.mailingAddress;
    }

    public void setAddress(Address mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public Email getEmail() {
        return this.email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    // Abstract method to calculate payment amount
    
    public abstract double getPaymentAmount();
    @Override// to string method to display the name,email,address,and the paymentAmount
    public String toString() {
    return String.format("%s\t%s\t%s\t$%.2f", name.toString(),  email.toString(),mailingAddress.toString(),getPaymentAmount());
   }
   
}
