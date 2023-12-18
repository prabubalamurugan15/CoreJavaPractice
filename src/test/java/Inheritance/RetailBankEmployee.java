package Inheritance;

public class RetailBankEmployee extends BankEmployee{

    String bankType;

    RetailBankEmployee(String bankEmployeeName, int employeeId, String bankName, String bankType)
    {
        super(bankEmployeeName, employeeId, bankName);
        this.bankType = bankType;
        System.out.println("Bank Employee Details : \n"
        + "Name : " + super.employeeName + "\n"
        + "ID : " + super.employeeId + "\n"
        + "Bank Type : " + bankType + "\n"
        + "Bank Name : " + bankName + "\n");
    }

    RetailBankEmployee(String bankName, String bankType)
    {
        super(bankName);
        this.bankType = bankType;
    }

    public static void main(String args[])
    {
        RetailBankEmployee retailBankEmployee = new RetailBankEmployee("Ishan", 352346, "AXIS BANK", "Retail");
        retailBankEmployee.getBankEmployeeDetails();
        retailBankEmployee.getEmployeeDetails();
    }
}
