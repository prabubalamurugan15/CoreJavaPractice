package Encapsulation;

public class mainStudent {

    public static void main(String args[])
    {
        Student object = new Student("Prabu", "Coimbatore", 351235, "Mathematics", 180,190, 195, 199, 200, 192);
        object.getStudentsDetails();
        object.getStudentCutOff();
        object.getStudentGeneric();

        Student object1 = new Student(351001, "Kohli", "Chennai");
        object1.getStudentGeneric();
        object1.getStudentsDetails();

        //General Object Information
        System.out.println("Object Details : "
        + "Class : " + object1.getClass() + "\n"
        + "HashCode : " + object1.hashCode());
    }
}
