package Encapsulation;

public class Employee {
    private String employeeName;
    private int employeeId;
    private long employeeSalary;
    private String employeeCity;

    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String empName)
    {
        this.employeeName = empName;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(int empId)
    {
        this.employeeId = empId;
    }

    public long getEmployeeSalary()
    {
        return employeeSalary;
    }

    public void setEmployeeSalary(long empSalary)
    {
        this.employeeSalary = empSalary;
    }

    public String getEmployeeCity()
    {
        return employeeCity;
    }

    public void setEmployeeCity(String empCity)
    {
        this.employeeCity = empCity;
    }
}
