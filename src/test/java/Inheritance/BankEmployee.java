package Inheritance;

public class BankEmployee extends Employee {

    String bankName;

    BankEmployee(String employeeName, int employeeId, String bankName)
    {
        super(employeeName, employeeId);
        this.bankName = bankName;
    }

    BankEmployee(String employeeName, int employeeId)
    {
        super(employeeName, employeeId);
    }

    BankEmployee(String bankName)
    {
        this.bankName = bankName;
    }

    public void getBankEmployeeDetails()
    {
        System.out.println("Bank Employee Details : \n"
        + "Name : " + super.employeeName + "\n"
        + "ID : " + super.employeeId + "\n"
        + "Bank : " + bankName + "\n");
    }

    public static void main(String args[])
    {
        Employee employee = new Employee();
        employee.employeeName = "Prabu";
        employee.employeeId = 351325;
        employee.getEmployeeDetails();

        Employee employee1 = new Employee("Kohli", 351326);
        employee1.getEmployeeDetails();

        Employee employee2 = new Employee("Rohit");
        employee2.getEmployeeDetails();

        Employee employee3 = new Employee(351327);
        employee3.getEmployeeDetails();

        BankEmployee bankEmployee = new BankEmployee("Iyer", 351327, "HDFC BANK");
        bankEmployee.getBankEmployeeDetails();

        BankEmployee bankEmployee1 = new BankEmployee("KL Rahul", 351328);
        bankEmployee1.getEmployeeDetails();

    }

}
