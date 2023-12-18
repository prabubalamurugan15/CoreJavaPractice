package Constructor;

import org.testng.annotations.Test;

public class ConstructorChaining {

    ConstructorChaining()
    {
        System.out.println("This is Constructor Chaining Example");
        System.out.println("This is Default Constructor");
    }

    ConstructorChaining(String name)
    {
        this();
        System.out.println("The name of the Geek is : "+ name);
    }

    ConstructorChaining(int age)
    {
        this("Prabu");
        System.out.println("The age of the Geek is : "+ age);
    }

    @Test
    public void ConstructorChainingCheck()
    {
        new ConstructorChaining(27);
    }
}
