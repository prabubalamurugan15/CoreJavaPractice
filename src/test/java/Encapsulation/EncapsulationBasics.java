package Encapsulation;

import org.testng.annotations.Test;

public class EncapsulationBasics {

    private int age;
    private String name;
    private int roll_no;

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setRoll_no(int roll_no)
    {
        this.roll_no = roll_no;
    }

    public int getRoll_no()
    {
        return roll_no;
    }

    @Test
    public void main()
    {
        EncapsulationBasics object = new EncapsulationBasics();
        object.setAge(30);
        object.setName("Prabu Balamurugan");
        object.setRoll_no(135155);

        System.out.println("The Student details are : " +
                "\n The Roll Number is : " + object.getRoll_no() +
                "\n The name is : " + object.getName() +
                "\n The age is : " + object.getAge());
    }
}
