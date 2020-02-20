package foundations.section5.practices;

public class TrafficLightChecker {

    public static void main(String[] args) {

        String[] trafficLight = new String[]{"Invalid color", "Next Traffic Light is green",
                "Next Traffic Light is yellow", "Next Traffic Light is red"};

        System.out.print("Enter a color code: ");
        int currentColor = new Number().getInteger();

        if (currentColor < trafficLight.length){
            System.out.println(trafficLight[currentColor]);
        } else {
            System.out.println(trafficLight[0]);
        }
    }
}
