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
 * class for the fulltime student object, child of student
 */
public class FulltimeStudent extends Student {
    private double tuitionFees;
    /**
     * overridden method to read info and calculate fees
     *
     * @param sc scanner object to be used
     */
    @Override
    public void readInfo(Scanner sc){
        super.readInfo(sc);
        this.tuitionFees = CollegeSystemTest.getDoubleInput("Enter tuition fees: ", sc);
        totalFees = tuitionFees + baseFees;
    }
}
