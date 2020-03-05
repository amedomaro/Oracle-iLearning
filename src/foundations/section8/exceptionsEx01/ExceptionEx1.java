package foundations.section8.exceptionsEx01;

public class ExceptionEx1 {

    public static void main(String[] args) {

        int[] nums = {3, 2, 6, 1};
        badUse(nums);
    }

    public static void badUse(int[] vals) {
        int total = 0;

        for (int val : vals) {
            total += val;
        }
        System.out.println(total);
    }
}
