/**
 * Declaration: This is my original work and has not been plagiarized.
 * Program:
 * Course: CST8132 Object Oriented Programming
 * Student Name: Joshua MacPherson
 * Student Number: 041166405
 * Section: 310_311
 * Lab Professor: James Mwangi
 */
import java.util.Scanner;
/**
 * this class is for the student object, child of person
 * this class contains most of the attributes of both student types, and
 * also gets the grades from the amount of courses
 * 
 */
public class Student extends Person {
    protected final double MAX_MARKS = 100;
    protected final double MAX_GPA = 4.0;
    protected int studentNumber = 0;
    protected String programName;
    protected double gpa = 0;
    protected double baseFees = 0;
    protected double totalFees = 0;
    protected int courseCount = 0;

    public Student(String firstName, String lastName, String email,
                   String phoneNumber, String programName, int studentNumber,
                   int courseCount, double gpa, double baseFees, double tuitionFees) {
        super(firstName, lastName, email, phoneNumber);
        this.programName = programName;
        this.studentNumber = studentNumber;
        this.courseCount = courseCount;
        this.gpa = gpa;
        this.baseFees = baseFees;
    }

    public Student() {}

    
    /**
     * overridden method from person to read info from scanner
     */
    @Override
    public void readInfo(Scanner sc) {

        this.programName = CollegeSystemTest.getStringInput("Enter program name: ", sc);

        this.studentNumber = CollegeSystemTest.getIntInput("Enter student number: ", sc);

        super.readInfo(sc);

        readMarks(sc);

        this.baseFees = CollegeSystemTest.getDoubleInput("Enter base fees: ", sc);

    }

    /**
     * method to ask user for amount of courses, then read input from scanner object 
     * and get the grades for each course 
     * 
     * @param sc scanner object to be used
     */
    private void readMarks(Scanner sc) {
        this.courseCount = CollegeSystemTest.getIntInput("Enter number of courses: ", sc);

        int[] grades = new int[courseCount];
        for (int i = 0; i < courseCount; i++) {
            do {
                grades[i] = CollegeSystemTest.getIntInput("Enter grade " + (i + 1) + ": ", sc);
                if (grades[i] < 0 || grades[i] > 100) {
                    System.out.println("Invalid grade");
                }
            } while (grades[i] < 0 || grades[i] > 100);
        }

        for (int i = 0; i < courseCount; i++) {
            gpa += grades[i];
        }

        gpa = (gpa / courseCount) / MAX_MARKS * MAX_GPA;
    }

    /**
     * overridden method to print student info
     */
    @Override
    public void printInfo() {
        System.out.printf("%7s| %8s| %20s| %20s| %15s| %5s| %7s|%n",
                "Program", "Student#", "Name", "Email", "Phone", "GPA", "Fees");
        System.out.printf("%7s| %8d| %20s| %20s| %15s|  %.2f| %.2f|",
                programName, studentNumber, firstName + " " + lastName, email, phoneNumber, gpa, totalFees);
        System.out.println("\n************************************************************************************************************************************************");
    }
}

