package foundations.section3.practices;

public class Text {

    public static String getText() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%s %s will not be attending school today.\n", Answer.getAns1(), Answer.getAns2()));
        sb.append(Text.getGender()).append(" has come down with a case of");    // Choose He\She
        sb.append(String.format(" %s and has horrible\n", Answer.getAns3()));
        sb.append(String.format("%s a(an) %s fever. We have made an appointment with the %s DR.%s,\n",
                Answer.getAns4(), Answer.getAns5(), Answer.getAns6(), Answer.getAns7()));
        sb.append(String.format("who studied for many years in %s and has ", Answer.getAns8()));

        Number.getNumber(Answer.getAns9());
        if (Answer.getNum1() != Integer.MIN_VALUE) {   // Getting a number from a string
            sb.append(Answer.getNum1());
        } else if (Answer.getNum2() != Double.MIN_VALUE) {
            sb.append(Answer.getNum2());
        } else {
            sb.append(Answer.getAns9());
        }

        sb.append(" degrees in pediatrics.\n");
        sb.append("He will send you all the information you need. Thank you. Sincerely Mrs.").append(Answer.getAns10());

        return sb.toString();
    }

    private static String getGender() {
        if (Answer.getSex().equals("Man")) {
            return "He";
        }
        return "She";
    }
}
