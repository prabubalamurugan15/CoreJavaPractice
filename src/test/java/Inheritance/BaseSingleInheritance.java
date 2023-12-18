package Inheritance;

public class BaseSingleInheritance {

    int a;
    int b;

    public BaseSingleInheritance(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public int add()
    {
       int add = a+b;
       System.out.println("The addition of two numbers is : ");
       return add;
    }

    public int subtract()
    {
        int subtract = a-b;
        System.out.println("The subtraction of two numbers is : ");
        return subtract;
    }
}
