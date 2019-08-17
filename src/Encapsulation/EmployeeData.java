package Encapsulation;

public class EmployeeData {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setAddress("La Cañita");
        System.out.println(employee1.getAddress());
        employee1.setSalary(150000.00);
        System.out.println(employee1.getSalary());


    }

}
