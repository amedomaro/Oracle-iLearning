package programming.section4.stringExample.accountGenerator;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name, userName, email, password;
    private StringBuilder sb = new StringBuilder();

    public Employee() {
        this.name = setName();
        userName = setUserName(name);
        email = setEmail(userName);
        password = setPassword(userName);
    }//end constructor

    private String setName() {
        return InputValue.getValue();
    }

    private String setUserName(String username) {
        return name.toLowerCase().replaceAll("\\s", "\\.");
    }

    private String setEmail(String email) {
        return sb.append(userName.charAt(0)).append(userName.substring(userName.indexOf(".")))
                .append("@oracleAcademy.Test").toString();
    }

    private String setPassword(String password) {
        sb.delete(0, sb.length());

        if (userName.length() >= 8) {
            sb.append(userName.substring(0, 1).toUpperCase()).append(userName, 1, 8);
        } else {
            sb.append(userName.substring(0, 1).toUpperCase()).append(userName.substring(1));

            while (sb.length() != 8) {
                sb.append("*");
            }
        }

        return sb.toString().replaceAll("([aeiouy])", "*");
    }

    @Override
    public String toString() {
        return String.format("\nEmployee Details\nName:\t\t\t%s\nUsername:\t\t%s\nEmail:\t\t\t%s\nPassword:\t\t%s\n"
                , name, userName, email, password);
    }
}
