package foundations.section4.tip03;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        //Use the Calculator object and arguments supplied to findTotal()
        //to print the total for each person

       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */

        calc.findTotal("Person1", 10);
        calc.findTotal("Person2", 12);
        calc.findTotal("Person3", 9);
        calc.findTotal("Person4", 8);
        calc.findTotal("Person5", 7);
        calc.findTotal("Person6", 15);
        calc.findTotal("Person7", 11);
        calc.findTotal("Person8", 30);
    }
}
