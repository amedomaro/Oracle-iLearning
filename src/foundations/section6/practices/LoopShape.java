package foundations.section6.practices;

public class LoopShape {

    protected void createRectangle(int width, int height) {

        if ((width < 0) || (height < 0)) {
            System.out.println("Numbers must be only positive !!!");

        } else {
            for (int i = 0; i < height; i++) {
                if ((i == 0) || (i == height - 1)) {    // Draw whole lines
                    drawWholeLines(width);

                } else {
                    for (int j = 0; j < width; j++) {   // Draw the middle
                        if ((j == 0) || (j == width - 1)) {
                            System.out.print("#");

                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }

    protected void createTriangle(int leg) {
        if (leg < 0) {
            System.out.println("Numbers must be only positive !!!");

        } else {
            for (int i = 0; i < leg; i++) {
                if (i == leg - 1) {
                    drawWholeLines(leg);

                } else {
                    for (int j = 0; j <= i; j++) {
                        if ((j == 0) || (j == i)) {
                            System.out.print("#");

                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }

    private void drawWholeLines(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("#");
        }
    }
}
