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
 * this is the superclass of student, storing basic attributes like fname, lname email and phone number
 */
public class Person {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;


    public Person(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Person() {}

    /**
     * method to read info from the scanner
     * 
     * @param sc scanner object to be used
     */
    public void readInfo(Scanner sc) {
        this.firstName = CollegeSystemTest.getStringInput("Enter first name: ", sc);

        this.lastName = CollegeSystemTest.getStringInput("Enter last name: ", sc);

        this.email = CollegeSystemTest.getStringInput("Enter email: ", sc);

        this.phoneNumber = CollegeSystemTest.getStringInput("Enter phone number: ", sc);
    }

    /**
     * method to print the info from the user input
     */
    public void printInfo() {
        System.out.printf("%20s| %20s| %15s|%n",
                "Name", "Email", "Phone");
        System.out.printf("%20s| %20s| %15s|",
                firstName + " " + lastName, email, phoneNumber);
        System.out.println("\n************************************************************************************************************************************************");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
