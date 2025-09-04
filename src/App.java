/**
 * Name: Ralph Sabio
 * Date: March 27 2025
 * Application for the employee program
 */
import java.util.ArrayList;

import java.text.SimpleDateFormat;
import java.util.Date; 



public class App {
    public static void main(String[] args) {
        // create an arrayList with Employee as an element object
        ArrayList<Employee> employees = new ArrayList<>();

       // make an object of name,address,and email
        Address address1 = new Address(45," Baker Street", "NYC", "New York", "90845");
        Name name1 = new Name("Iroqois", "Pliskin");
        Email email1 = new Email("solSnake_32@fox.com");

        Address address2 = new Address(23," Kamurocho Street ", "Tokyo", "Kanto", "67B09");
        Name name2 = new Name("Kiryu", "Kazuma");
        Email email2 = new Email("kkaz@gmail.com");

        Address address3 = new Address(78," Beverly Hills ", "Los Angeles", "California", "90210");
        Name name3 = new Name("Travis", "Scott");
        Email email3 = new Email("scotTy@yahoomail.com");

        // Creating employees and its type
        employees.add(new SalariedEmployee(name1, address1, email1, 52000));
        employees.add(new SalariedEmployee(name2, address2, email2, 81000));
        employees.add(new ContractEmployee(name3, address3, email3, 20000));
    

        // Generating payment statement via the getPaymentStatement method
        generatePaymentStatement(employees);
    }

    public static void generatePaymentStatement(ArrayList<Employee> employees) {
        // Format and display current date using the built-in date object/class
        String currentDate = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
        System.out.println("Employees Payment Statement");
        System.out.println("Date: " + currentDate);  // Displaying the date in the header
        System.out.println();
        System.out.printf("%-20s %-15s %-30s %-15s%n", "Name", "Employee Type", "Email", "Payment Amount");
        System.out.println("--------------------------------------------------------------------");

        for (Employee employee : employees) {// enhanced for loop 
            String employeeType;
            if (employee instanceof SalariedEmployee) {// if employee 
                //is an instance of salaried type, set it to salaried else contract
                employeeType = "Salaried";
            } else {
                employeeType = "Contract";
            }
            System.out.printf("%-20s %-15s %-30s $%-15.2f%n",
                    employee.getName().toString(),
                    employeeType,
                    employee.getEmail(),
                    employee.getPaymentAmount());
        }
    }
}


