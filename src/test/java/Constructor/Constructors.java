package Constructor;

import org.testng.annotations.Test;



public class Constructors {

    int age;
    String name;

    int geekId;
    String geekName;
    long geekRollNo;
    double geekLockerNo;

    Constructors()
    {

        System.out.println("This is Default Constructor");
        System.out.println(geekId + " \n " + geekName + " \n " + geekRollNo + " \n " + geekLockerNo);
    }

    Constructors(int age)
    {
        this.age = age;
        System.out.println("This is Parameterized Constructor");
    }

    Constructors(String name, int age)
    {
        this.age = age;
        this.name = name;
        System.out.println("This is Parameterized Constructor with Two Variables");
        System.out.println("The name of Geek is " +name+ " & "+ "the age is "+ age);
    }

    @Test
    public void constructorCheck()
    {
        System.out.println("Object Initialization");
        Constructors object1 = new Constructors();

        Constructors object2 = new Constructors(27);
        System.out.println("The age of Geek1 : "+ object2.age);

        Constructors object3 = new Constructors("Prabu", 30);
    }
}
