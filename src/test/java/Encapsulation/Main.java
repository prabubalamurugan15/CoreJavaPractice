package Encapsulation;

public class Main {

    public static void main(String args[])
    {
        //No private methods can be used in main class.
        Employee employee = new Employee();
        employee.setEmployeeId(100);
        employee.setEmployeeName("Prabu Balamurugan");
        employee.setEmployeeSalary(2700000);
        employee.setEmployeeCity("Coimbatore");

        String employeeCity = employee.getEmployeeCity();
        String employeeName = employee.getEmployeeName();
        int employeeId = employee.getEmployeeId();
        long employeeSalary = employee.getEmployeeSalary();

        System.out.println("Employee Details: \n"
        + "Employee Name : " + employeeName + "\n"
        + "Employee Salary: " + employeeSalary + "\n"
        + "Employee City: " + employeeCity + "\n"
        + "Employee ID: " + employeeId);

    }
}
