import java.io.Serializable;
public class Customer_app2 {
    private String firstName;
    private String lastName;
    private int id;
    private double balance;

    // No-argument constructor
    public Customer() {}

    // Constructor with parameters
    public Customer(String firstName, String lastName, int id, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.balance = balance;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Override toString for a clean output format
    @Override
    public String toString() {
        return "Customer [ID=" + id + ", Name=" + firstName + " " + lastName + ", Balance=" + balance + "]";
    }
}