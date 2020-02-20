package foundations.section5.practices;

public class TrafficLightSwitch {

    public static void main(String[] args) {

        System.out.print("Enter a color code: ");
        int currentColor = new Number().getInteger();

        switch (currentColor){
            case 1:
                System.out.println("Next Traffic Light is green");
                break;
            case 2:
                System.out.println("Next Traffic Light is yellow");
                break;
            case 3:
                System.out.println("Next Traffic Light is red");
                break;
            default:
                System.out.println("Invalid color");
        }

    }
}
