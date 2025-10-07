import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }

    public String toString(){
        return rollNo + " "  + name; 
    }

}

class NameComparator implements Comparator<Student> {
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

        System.out.println("Original : " + students.toString());

        Collections.sort(students); // comparable -> rollNo
        System.out.println("Sorted by Roll No : " + students.toString());

        Collections.sort(students, new NameComparator()); // Comparator -> name
        System.out.println("Sorted by Name: " + students.toString());
    }
}
