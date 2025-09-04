
// subclass for contract employee 
class ContractEmployee extends Employee {
    private double contractAmount;

    // Constructor
    public ContractEmployee(Name name, Address address, Email email, double contractAmount) {
        super(name, address, email);//inherited attributes from superclass employee
        this.contractAmount = contractAmount;
    }

    // Getter and Setter methods
    public double getContractAmount() {
        return this.contractAmount;
    }

    public void setContractAmount(double contractAmount) {
        this.contractAmount = contractAmount;
    }

    // Override method to calculate payment amount
    @Override
    public double getPaymentAmount() {
        return this.contractAmount / 3;//three nstallment payment 
    }
   
   
}
