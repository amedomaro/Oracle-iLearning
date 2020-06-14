package programming.section2.exceptionsAndAssertions.JavaBank;

/**
 @author Aleksandr Ilin
 */

public class NumberCheck {

    protected  static String getNumber(String input) {
        String result = "0";

        try {
            result = (input.matches("(([-+])?\\d+(\\.\\d+)?)+")) ? input : "0";

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
