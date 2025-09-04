public class Name {
    private String firstName;
    private String lastName;
  
    // Constructor with arguments 
    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter and Setter methods
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}

