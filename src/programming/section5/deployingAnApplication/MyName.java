package programming.section5.deployingAnApplication;

public class MyName {
    private String name = "Aleksandr";

    public void sayHello() {
        System.out.printf("Hi %s", getName());
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

}//end class MyName
