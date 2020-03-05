package foundations.section8.arrayListsEx01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();


        students.add("Amy");
        students.add("Bob");
        students.add("Cindy");
        students.add("David");

        System.out.println(students);
        System.out.printf("The list of \"students\" is length: %d\n\n", students.size());

        // Part 2

        students.add(0, "Nick");
        students.add(1, "Mike");
        students.remove(3);

        System.out.println(students);
        System.out.printf("The list of \"students\" is length: %d\n\n", students.size());
    }
}
