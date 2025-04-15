/**
 * Declaration: This is my original work and has not been plagiarized.
 * Program:
 * Course: CST8132 Object-Oriented Programming
 * Student Name: Joshua MacPherson
 * Student Number: 041166405
 * Section: 310_311
 * Lab Professor: James Mwangi
 */
import java.util.Scanner;
/**
 * this is the class for the college, and it reads the student details, and prints the student details if selected
 */
public class College {
    private String name;
    private Student[] students;
    private int count = 0;

    public College(String name, int studentCount) {
        this.name = name;
        this.students = new Student[studentCount];
    }

    public void setStudents(FulltimeStudent ftStudent) {
        this.students[count] = ftStudent;
    }

    public void setStudents(ParttimeStudent ptStudent) {
        this.students[count] = ptStudent;
    }

    public void printTitle() {	// printing name of college
        System.out.println(name + " - List of Students");
    }


    /**
     * method that takes in a scanner and, depending on user input, puts the details entered into either
     * a fulltime student or parttime student object
     *
     * @param sc scanner object to be used
     */
    public void readStudentDetails(Scanner sc) {
        if (count != students.length) {
            System.out.println("1 - Fulltime Student\n2 - Parttime Student");
            int choice = CollegeSystemTest.getIntInput("Select an option: ", sc);
            /*
             * switch decision structure to see if the student will be ftime or ptime
             */
            switch (choice) {
                case 1:
                    Student ftStudent = new FulltimeStudent();
                    students[count] = ftStudent;
                    count++;
                    ftStudent.readInfo(sc);
                    break;
                case 2:
                    Student ptStudent = new ParttimeStudent();
                    students[count] = ptStudent;
                    count++;
                    ptStudent.readInfo(sc);
                    break;
                default:
                    System.out.println("Invalid student type!");
                    break;
            }
        }
    }

    /**
     * method to iterate through students array and print student info, print an error message if students array
     * is empty
     */
    public void printStudentDetails() {
        if (students[0] == null) {
            System.out.println("No students to print!");
        } else {
            System.out.println("************************************************************************************************************************************************");
            for (int i = 0; i < count; i++) {
                students[i].printInfo();
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
