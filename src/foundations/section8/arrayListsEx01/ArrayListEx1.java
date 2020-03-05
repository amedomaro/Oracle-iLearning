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
        System.out.printf("The list of \"students\" is length: %d\n", students.size());
    }
}
