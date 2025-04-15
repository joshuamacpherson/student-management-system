/**
 * Declaration: This is my original work and has not been plagiarized.
 * Program:
 * Course: CST8132 Object Oriented Programming
 * Student Name: Joshua MacPherson
 * Student Number: 041166405
 * Section: 310_311
 * Lab Professor: James Mwangi
 */

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * the purpose of this program is to take in student data and store them, while also calculating
 * their GPA and total fees
 */
public class CollegeSystemTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cName = getStringInput("Enter name of college: ", sc);    // gather user input for college object
        int sCount = getIntInput("Enter number of students: ", sc);

        College c = new College(cName, sCount);    // creating the object for the college

        int menuChoice;
        /*
         * menu system, loops as long as the user does not press the exit button in the menu
         */
        do {
            menuChoice = getIntInput("=============================================================\n" +
                    "1. Add a student\n2. Print all students\n3. Exit\n" +
                    "=============================================================\n" +
                    "Enter your option: ", sc);
            switch (menuChoice) {
                case 1:
                    if (c.getCount() == sCount) {	// checking to see if students array is full by comparing count to current index
                        System.out.println("Out of room for students!");
                    } else {
                        c.readStudentDetails(sc);
                    }
                    break;
                case 2:
                    c.printTitle();
                    c.printStudentDetails();
                    break;
                case 3:
                    System.out.println("Have a nice day!\nProgram by Joshua MacPherson");
                    break;
                default:
                    System.out.println("Please select a valid option!");
                    break;
            }
        } while (menuChoice != 3);
        sc.close();		// end of program, closing scanner
    }

    /**
     * method to grab integer number input from the user with try-catch
     *
     * @param message message to be output to console
     * @param sc scanner object to be used
     * @return returns the integer the user entered
     */
    public static int getIntInput (String message, Scanner sc) {
        while (true) {
            try {
                System.out.print(message);
                int input = sc.nextInt();
                sc.nextLine();
                if (input >= 0) {
                    return input;
                } else {
                    System.out.println("Please enter a positive integer number!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer number!");
                sc.nextLine();
            }
        }
    }

    /**
     * method to grab string input from the user with try-catch
     *
     * @param message message to be output to console
     * @param sc scanner object to be used
     * @return returns the string literal the user entered
     */
    public static String getStringInput(String message, Scanner sc) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input cannot be empty!");
        }
    }

    /**
     * method to grab decimal number input from the user with try-catch
     *
     * @param message message to be output to console
     * @param sc scanner object to be used
     * @return returns the decimal value the user entered
     */
    public static double getDoubleInput (String message, Scanner sc) {
        double input;
        while (true) {
            try {
                System.out.print(message);
                input = sc.nextDouble();
                sc.nextLine();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a decimal number!");
                sc.nextLine();
            }
        }
    }
}

