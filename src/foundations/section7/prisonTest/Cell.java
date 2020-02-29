package foundations.section7.prisonTest;

public class Cell {

    private String name;
    private boolean openDoor;

    protected Cell(){

    }

    protected Cell(String name, boolean openDoor){
        setName(name);
        setOpenDoor(openDoor);
    }

    protected String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    protected boolean isOpenDoor() {
        return openDoor;
    }

    private void setOpenDoor(boolean openDoor) {
        this.openDoor = openDoor;
    }
}
