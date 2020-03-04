
package foundations.section8.arrayEx02;

public class ComputeAvg {

    public static void main(String[] args) {
        int sum = 0;
        int[] grade = new int[5];
        Number number = new Number();


        for (int i = 0; i < grade.length; i++) {
            System.out.print("Input the grade: ");

            while (true) {
                grade[i] = number.getInteger();

                if (grade[i] <= 100) {
                    sum += grade[i];
                    break;
                } else {
                    System.out.print("Score cannot be more than 100\nInput the grade: ");
                }
            }
        }

        System.out.printf("The student’s average scores = %.2f", (double) sum / grade.length);
    }
}
