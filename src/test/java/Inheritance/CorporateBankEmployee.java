package Inheritance;

public class CorporateBankEmployee extends BankEmployee {

    public String bankType;
    CorporateBankEmployee(String employeeName, int employeeId, String bankName)
    {
        super(employeeName, employeeId, bankName);
    }

    CorporateBankEmployee(String employeeName, int employeeId, String bankName, String bankType)
    {
        super(employeeName, employeeId, bankName);
        this.bankType = bankType;
        System.out.println("Bank Employee Details : \n"
                + "Name : " + super.employeeName + "\n"
                + "ID : " + super.employeeId + "\n"
                + "Bank Type : " + bankType + "\n"
                + "Bank Name : " + bankName + "\n");
    }

    public static void main(String args[])
    {
        CorporateBankEmployee corporateBankEmployee = new CorporateBankEmployee("Gilchrist", 454647, "HSBC", "Corporate");
        corporateBankEmployee.getEmployeeDetails();
        corporateBankEmployee.getBankEmployeeDetails();

    }
}
