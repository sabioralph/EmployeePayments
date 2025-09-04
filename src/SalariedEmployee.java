
//class for the salary employee subclass
class SalariedEmployee extends Employee {
    private double annualSalary;

    // Constructor with arguments
    public SalariedEmployee(Name name, Address address, Email email, double annualSalary) {
        super(name, address,email);//inherited from the superclass Employee
        this.annualSalary = annualSalary;
    }

    // Getter and Setter methods
    public double getAnnualSalary() {
        return this.annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    // Override method to calculate payment amount
    @Override
    public double getPaymentAmount() {
        return this.annualSalary / 26;// annual salary for 26 equal payment
    }
}
