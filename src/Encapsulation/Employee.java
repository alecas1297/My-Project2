package Encapsulation;

public class Employee {

    private String address;
    private int ssn;
    private double salary;

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
