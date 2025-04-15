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
 * class for the parttime student object, child of student
 */
public class ParttimeStudent extends Student{
    private double creditHours = 0;
    private double courseFees = 0;
    /**
     * method that will read and store the student info
     *
     * @param sc scanner object to be used
     */
    @Override
    public void readInfo(Scanner sc) {
        super.readInfo(sc);
        this.courseFees = CollegeSystemTest.getDoubleInput("Enter course fees: ", sc);
        this.creditHours = CollegeSystemTest.getDoubleInput("Enter credit hours: ", sc);
        totalFees = (creditHours * courseFees) + baseFees;
    }

    /**
     * overridden method to print the info in a neat format
     */
    @Override
    public void printInfo() {
        System.out.printf("%7s| %8s| %20s| %20s| %15s| %5s| %7s| %4s|%n",
                "Program", "Student#", "Name", "Email", "Phone", "GPA", "Fees", "Credit Hours");
        System.out.printf("%7s| %8d| %20s| %20s| %15s|  %.2f| %.2f|          %.1f|",
                programName, studentNumber, firstName + " " + lastName, email, phoneNumber, gpa, totalFees, creditHours);
        System.out.println("\n************************************************************************************************************************************************");
    }
}
