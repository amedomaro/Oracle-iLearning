package foundations.section3.practices;

public class Number {

    public static void getNumber(String str) {

        try {
            if (str.matches("\\D")) {
                Answer.setAns9(String.format("(You were asked to enter a number!\n %s - is not a number!!!)", str));
            } else if (str.contains(".")) {
                Answer.setNum2(Double.parseDouble(str));
            } else Answer.setNum1(Integer.parseInt(str));

        } catch (NumberFormatException e) {
            Answer.setAns9(String.format("(You were asked to enter a number!\n %s - is not a number!!!)", str));
        }
    }
}

