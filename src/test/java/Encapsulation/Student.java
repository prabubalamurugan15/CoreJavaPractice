package Encapsulation;

public class Student {

    private String studentName;
    private int studentRollNumber;
    private String studentLocation;
    private String studentFavouriteSubject;
    private int mathematicsMark;
    private int physicsMark;
    private int chemistryMark;
    private int tamilMark;
    private int englishMark;
    private int computerMark;

    public Student(String studentName, String studentLocation, int studentRollNumber, String studentFavouriteSubject,
    int tamilMark, int englishMark, int mathematicsMark, int physicsMark, int chemistryMark, int computerMark)
    {
        this.studentName = studentName;
        this.studentLocation = studentLocation;
        this.studentRollNumber = studentRollNumber;
        this.studentFavouriteSubject = studentFavouriteSubject;
        this.tamilMark = tamilMark;
        this.englishMark = englishMark;
        this.mathematicsMark = mathematicsMark;
        this.physicsMark = physicsMark;
        this.chemistryMark = chemistryMark;
        this.computerMark = computerMark;
    }

    public Student(int studentRollNumber, String studentName, String studentLocation)
    {
        this.studentRollNumber = studentRollNumber;
        this.studentName = studentName;
        this.studentLocation = studentLocation;
    }

    public Student(int studentRollNumber, String studentName, String studentFavouriteSubject, int tamilMark,
                   int englishMark, int mathematicsMark, int physicsMark, int chemistryMark, int computerMark)
    {
        this.studentRollNumber = studentRollNumber;
        this.studentName = studentName;
        this.studentFavouriteSubject = studentFavouriteSubject;
        this.tamilMark = tamilMark;
        this.englishMark = englishMark;
        this.mathematicsMark = mathematicsMark;
        this.physicsMark = physicsMark;
        this.chemistryMark = chemistryMark;
        this.computerMark = computerMark;
    }

    public Student(int studentRollNumber, String studentName, int mathematicsMark, int chemistryMark, int physicsMark)
    {
        this.studentRollNumber = studentRollNumber;
        this.studentName = studentName;
        this.mathematicsMark = mathematicsMark;
        this.chemistryMark = chemistryMark;
        this.physicsMark = physicsMark;
    }

    private long total()
    {
        int total = (tamilMark + englishMark + mathematicsMark + chemistryMark + physicsMark + computerMark);
        return  total;
    }
    private double totalPercentage()
    {
        int total = (tamilMark + englishMark + mathematicsMark + chemistryMark + physicsMark + computerMark);
        double percentage = total / 6;
        return percentage;
    }
    private double cutOff()
    {
        int totalThree = (mathematicsMark + chemistryMark + physicsMark);
        double cutoff = totalThree / 3;
        return  cutoff;
    }

    public void getStudentsDetails()
    {
        System.out.println("Student Details : \n"
        + "Roll Number : " + studentRollNumber + "\n"
        + "Student Name : " + studentName + "\n"
        + "Favourite Subject : " + studentFavouriteSubject + "\n"
        + "Tamil : " + tamilMark + "\n"
        + "English : " + englishMark + "\n"
        + "Mathematics : " + mathematicsMark + "\n"
        + "Physics : " + physicsMark + "\n"
        + "Chemistry : " + chemistryMark + "\n"
        + "Computer Science : " + computerMark + "\n"
        + "Total : " + total() + "\n"
        + "Cut-Off :" + cutOff() + "\n"
        + "Percentage : " + totalPercentage() + "\n"
        + "Location : " + studentLocation + "\n");
    }

    public void getStudentCutOff()
    {
        System.out.println("Student Details : \n"
        + "Roll Number : " + studentRollNumber + "\n"
        + "Name : " + studentName + "\n"
        + "Cut-off : " + cutOff() + "\n");
    }

    public void getStudentGeneric()
    {
        System.out.println("Student Details : \n"
        + "Roll Number : " + studentRollNumber + "\n"
        + "Name : " + studentName + "\n"
        + "Location : " + studentLocation + "\n");
    }
}
