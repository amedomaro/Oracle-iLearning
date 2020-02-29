package foundations.section7.encapsulation;

public class Prisoner {

    private String name;
    private double height, sentence;
    private Cell cell = new Cell();

    public Prisoner(String name, double height, double sentence){
        setName(name);
        setHeight(height);
        setSentence(sentence);
    }

    public Prisoner(String name, double height, double sentence, String nameCam){
        this (name, height,sentence);
        this.cell = new Cell(nameCam, false);
    }

    public void display(){
        System.out.printf("%s is in cell: %s\n",getName(), cell.getName());
    }

    protected String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    protected double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    protected double getSentence() {
        return sentence;
    }

    private void setSentence(double sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString(){
        return String.format("Name: %13s\nHeight: %10.2f\nSentence: %8.2f\n", getName(),getHeight(), getSentence());
    }




}
