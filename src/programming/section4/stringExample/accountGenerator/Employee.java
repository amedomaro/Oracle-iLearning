package programming.section4.stringExample.accountGenerator;

public class Employee {
    private String name, userName, email, password;

    public Employee() {
        this.name = setName();
//        userName = setUserName(name);
//        email = setEmail(userName);
//        password = setPassword(userName);
    }//end constructor

    // Bellow getters, setters and @Override
    protected String getName() {
        return name;
    }

    private String setName() {
        return InputValue.getValue();
    }

    protected String getUserName() {
        return userName;
    }

    private void setUserName(String username) {
        this.userName = username;
    }

    protected String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    protected String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("Employee Details Name: %-10s\nUsername: %-10s\nEmail: %-10s\n Initial Password: %-10s\n"
                , name, userName, email, password);
    }
}
