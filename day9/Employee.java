// A company stores employee details along with address information.
// Question
// Create classes:
// 	1. Address → city
// 	2. Employee → id, Address address
// Add:
// 	parameterized constructor
// 	copy constructor that performs shallow copy
// Steps:
// 	1	Create employee emp1
// 	2	Create emp2 using copy constructor
// 	3	Change city via emp2
// 	4	Print city of both employees

class Address {
    String city;

    // Parameterized constructor
    public Address(String city) {
        this.city = city;
    }
}

public class Employee {
    int id;
    Address address;

    // Parameterized constructor
    public Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    // Copy constructor (SHALLOW COPY)
    public Employee(Employee obj) {
        this.id = obj.id;
        this.address = obj.address; // same Address reference
    }

    public static void main(String[] args) {

        // Step 1: Create emp1
        Address address = new Address("Parvathipuram");
        Employee emp1 = new Employee(123, address);

        // Step 2: Create emp2 using copy constructor
        Employee emp2 = new Employee(emp1);

        // Step 3: Change city using emp2
        emp2.address.city = "Punjab";

        // Step 4: Print city of both employees
        System.out.println("Emp1 City: " + emp1.address.city);
        System.out.println("Emp2 City: " + emp2.address.city);
    }
}

