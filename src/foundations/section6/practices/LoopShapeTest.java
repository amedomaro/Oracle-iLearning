package foundations.section6.practices;

public class LoopShapeTest {
    public static void main(String[] args) {

        new LoopShape().createRectangle(5,4);
        System.out.println("___________________________");
        new LoopShape().createRectangle(1,1);
        System.out.println("___________________________");
        new LoopShape().createRectangle(-5,4);
        System.out.println("---------------------------");

        new LoopShape().createTriangle(5);
        System.out.println("___________________________");
        new LoopShape().createTriangle(1);
        System.out.println("___________________________");
        new LoopShape().createTriangle(-5);
        System.out.println("---------------------------");
    }
}
