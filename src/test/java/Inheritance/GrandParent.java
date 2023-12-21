package Inheritance;

public class GrandParent {

    //Instance Variables
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;

    //Static Variables
    static public int staticA = 10;
    static private int staticB = 20;
    static protected int staticC = 30;
    static int staticD = 40;

    //Instance Block 1
    {
        int a = 10;
        System.out.println("This variable block in Base Class");
    }

    //Instance Block 2
    {
        System.out.println("This is instance initializer block");
    }

    static
    {
        System.out.println("This is static block 1");
    }

    static
    {
        System.out.println("This is static block 2");
    }

    GrandParent()
    {
        System.out.println("This is default constructor");
    }

    GrandParent(int x)
    {
        this.a = x;
        System.out.println("This is parameterized constructor");
    }
}
