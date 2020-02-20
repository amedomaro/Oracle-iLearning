package foundations.section5.conditionalEx03;

import java.io.IOException;

public class ComputeFare {
    public static void main(String[] args) throws IOException {

//        System.out.print("Enter the age \n");
//        Scanner keyboard = new Scanner(System.in);
//        int age = keyboard.nextInt();
//        int fare;

        Person person = new Person();
        int fare;

        System.out.print("Enter the age: ");
        person.setAge();

        fare = (person.getAge() < 11) ? 3 : (person.getAge() > 11 && person.getAge() < 65) ? 5 : 3;

        System.out.printf("Your fare is: %d",fare);

    }
}
