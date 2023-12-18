package Inheritance;

import org.testng.annotations.Test;

public class DerivedSingleInheritance extends BaseSingleInheritance{

    DerivedSingleInheritance()
    {
        super(6,4);
    }

    @Test
    public void main()
    {
        DerivedSingleInheritance object = new DerivedSingleInheritance();
        System.out.println(object.add());
        System.out.println(object.subtract());
    }
}
