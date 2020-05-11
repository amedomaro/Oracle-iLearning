package programming.section3.collections2.compareTo;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class StudentDriver {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Mark", "Mywords", 95));
        students.add(new Student("Andrew", "Apic", 45));
        students.add(new Student("Beth", "Tween", 78));

        displayStudents(students);
        Collections.sort(students);
        System.out.println("--- after sorting ---");
        displayStudents(students);

    } // end main method

    static void displayStudents(List<Student> studentNames) {
        for(Student student: studentNames){
            System.out.println(student);
        }
    }
}
