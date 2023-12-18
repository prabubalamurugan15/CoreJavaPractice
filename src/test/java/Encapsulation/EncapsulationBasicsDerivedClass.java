package Encapsulation;

import org.testng.annotations.Test;

public class EncapsulationBasicsDerivedClass extends EncapsulationBasics {

    @Test
    public void test()
    {
        EncapsulationBasicsDerivedClass object = new EncapsulationBasicsDerivedClass();
        object.setAge(35);
        object.setName("Karthik Balamurugan");
        object.setRoll_no(131538);

        System.out.println("The Student details are : "
        + "\n The roll number of student is : " + object.getRoll_no()
        + "\n The name of student is : " + object.getName()
        + "\n The age of student is : " + object.getAge());
    }
}
