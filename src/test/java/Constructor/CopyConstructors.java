package Constructor;

import org.testng.annotations.Test;

public class CopyConstructors {

    String name;
    int age;

    CopyConstructors()
    {
        System.out.println("This is Copy Constructor Example");
    }
    CopyConstructors(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    CopyConstructors(CopyConstructors object1)
    {
        System.out.println("The name of Geek is " + object1.name + " & the age is " + object1.age);
    }

    @Test
    public void copyConstructorCheck()
    {
        CopyConstructors object = new CopyConstructors();

        CopyConstructors object1 = new CopyConstructors("Prabu", 30);
        System.out.println("The name of Geek1 is "+object1.name + " & the age of Geek1 is "+ object1.age);

        CopyConstructors object2 = new CopyConstructors(object1);
    }
}
