package foundations.section3.practices;

public class Text {

    public static String getText(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s %s will not be attending school today.\n", Answer.getAns1(), Answer.getAns2()))
                .append(" has come down with a case of %s and has horrible\n")
                .append(String.format("%s a(an) %s fever. We have made an appointment with the %s DR.%s,\n",
                        Answer.getAns3(), Answer.getAns4(), Answer.getAns5(), Answer.getAns6()));
        return sb.toString();
    }

    String text = String.format("%s %s will not be attending school today.\n" +
            "%s /*sex*/ has come down with a case of %s and has horrible\n" +
            "%s a(an) %s fever. We have made an appointment with the %s DR.%s,\n " +
            "who studied for many years in %s and has %s degrees in pediatrics.\n" +
            " He will send you all the information you need. Thank you. Sincerely Mrs.%s",
            Answer.getAns1(), Answer.getAns2(), Answer.getSex(), Answer.getAns3(), Answer.getAns4(), Answer.getAns5(),
            Answer.getAns6(), Answer.getAns7(), Answer.getAns8(), Answer.getAns9(), Answer.getAns10());
}
