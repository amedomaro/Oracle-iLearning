package foundations.section4.tip01;

public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        Person person = new Person();

        person.addBill("Person1", 10);
        person.addBill("Person2", 12);
        person.addBill("Person3", 9);
        person.addBill("Person4", 8);
        person.addBill("Person5", 7);
        person.addBill("Person6", 15);
        person.addBill("Person7", 11);
        person.addBill("Person8", 30);

        person.printBill();
    }
}
