package foundations.section7.instantiatingObjects;

public class Prisoner {

    private String name;
    private double height, sentence;

    public Prisoner(String name, double height, double sentence){
        setName(name);
        setHeight(height);
        setSentence(sentence);
    }

    protected void refactorPrisoner(String name, double height, double sentence){
        setName(name);
        setHeight(height);
        setSentence(sentence);
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
