import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Practical 23: Write a program to demonstrate comparable and comparator interface
 */
class Student implements Comparable<Student> {
    int rollNo;
    String name;

    /**
     * Constructor to initialize Student object.
     *
     * @param rollNo student roll number
     * @param name   student name
     */
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    /**
     * Compares students by roll number (natural ordering).
     *
     * @param s another Student object
     * @return difference of roll numbers
     */
    @Override
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }

    /**
     * Returns string representation of Student.
     *
     * @return roll number and name
     */
    @Override
    public String toString() {
        return rollNo + " " + name;
    }

}

/**
 * Comparator to sort Student objects by name.
 */
class NameComparator implements Comparator<Student> {

    /**
     * Compares students by name.
     *
     * @param s1 first Student
     * @param s2 second Student
     * @return result of name comparison
     */
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }

}

public class Practical23 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Kewal"));
        students.add(new Student(1, "Ankit"));
        students.add(new Student(2, "Riya"));

        System.out.println("Original : " + students);

        // Sort by roll number using Comparable
        Collections.sort(students);
        System.out.println("Sorted by Roll No : " + students);

        // Sort by name using Comparator
        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by Name: " + students);
    }

}
