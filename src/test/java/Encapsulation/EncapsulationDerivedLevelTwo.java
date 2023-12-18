package Encapsulation;

import org.testng.annotations.Test;

public class EncapsulationDerivedLevelTwo extends EncapsulationBasicsDerivedClass {

    @Test
    public void levelTwoTest()
    {
        EncapsulationDerivedLevelTwo object = new EncapsulationDerivedLevelTwo();
        object.test();
    }
}
