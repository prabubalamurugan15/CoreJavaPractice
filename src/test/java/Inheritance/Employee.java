package Inheritance;

public class Employee {

    public String employeeName;
    public int employeeId;

    Employee()
    {
        System.out.println("This is default constructor");
    }

    Employee(String employeeName)
    {
        this.employeeName = employeeName;
    }

    Employee(int employeeId)
    {
        this.employeeId = employeeId;
    }

    Employee(String employeeName, int employeeId)
    {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public void getEmployeeDetails()
    {
        System.out.println("Employee Details : \n"
        + "Name : " + employeeName + "\n"
        + "ID : " + employeeId + "\n");
    }
}
