package programming.section3.generics.genericShapes;

/**
 @author Aleksandr Ilin
 */

public class Main {

    public static void main(String[] args) {
        Cuboid<Double> cuboidDouble = new Cuboid<>("cuboidDouble",1.3, 2.2, 2.0);
        Cuboid<Integer> cuboidInteger = new Cuboid<>("cuboidInteger",1,2,3);



        System.out.println(cuboidDouble.toString());
        cuboidDouble.printVolume();
        System.out.println(cuboidInteger.toString());
        cuboidInteger.printVolume();

    }
}
