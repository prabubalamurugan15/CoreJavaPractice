package Inheritance;

public class Parent extends GrandParent {


    public static void main(String args[])
    {
        GrandParent object = new GrandParent();
        System.out.println("Variable Display : \n"
                + "A : " + object.a + "\n"
                + "B : " + "Private variable" + "\n"
                + "C : " + object.c + "\n"
                + "D : " + object.d + "\n"
                + "Static A : " + GrandParent.staticA + "\n"
                + "Static B : " + "Private Static variable" + "\n"
                + "Static C : " + GrandParent.staticC + "\n"
                + "Static D : " + GrandParent.staticD + "\n");
        System.out.println("-----------------------------------------------------------------------------------------");

        GrandParent object1 = new GrandParent(5);
        System.out.println("Variable Display : \n"
                + "A : " + object1.a + "\n"
                + "B : " + "Private variable" + "\n"
                + "C : " + object1.c + "\n"
                + "D : " + object1.d + "\n"
                + "Static A : " + GrandParent.staticA + "\n"
                + "Static B : " + "Private Static variable" + "\n"
                + "Static C : " + GrandParent.staticC + "\n"
                + "Static D : " + GrandParent.staticD + "\n");
    }
}
