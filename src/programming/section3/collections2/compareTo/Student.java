package programming.section3.collections2.compareTo;

/**
 @author Aleksandr Ilin
 */

public class Student implements Comparable<Student> {

    private String firstName, lastName;
    private int mark;

    protected Student(String firstName, String lastName, int mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMark(mark);
    } // end constructor


    // Bellow getters, setters and  @Override
    protected String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    protected int getMark() {
        return mark;
    }

    private void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return String.format("Student Details: %-8s %-8s %d", firstName, lastName, mark);
    }

    @Override
    public int compareTo(Student o) {
        if (lastName.compareTo(o.getLastName()) < 0) return -1;
        if (lastName.compareTo(o.getLastName()) == 0) return 0;
        return 1;
    }
}
