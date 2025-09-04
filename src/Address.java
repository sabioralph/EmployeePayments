/**
 * Name: Ralph Sabio
 * ID:991646078
 * Assigment 3
 * This is the Address class
 * 
 * 
 */

public class Address {
    private int streetNumber;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // arg constructor
    public Address(int streetNumber,String street, String city, String state, String zipCode) {
        this.streetNumber=streetNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Getter and Setter methods for the attributes
    public String getStreet() {
        return this.street;
    }
    public int getStreetNumber(){
        return this.streetNumber;
    }
    public void setStreetNumber(int streetNumber){
       this.streetNumber = streetNumber;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    // Full address as a string in a toString method 
    @Override
    public String toString() {
        return this.streetNumber+", "+this.street + ", " + this.city + ", " + this.state + " " + this.zipCode;
    }
}
