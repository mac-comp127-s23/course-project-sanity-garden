import edu.macalester.graphics.*;

public class AppleOrchard extends Location {
    private Apple appleLeft;
    private Apple appleMiddle;
    private Apple appleRight;
    private Label leftAppleTree;
    private Label middleAppleTree;
    private Label rightAppleTree;

    /**
     * Creates an apple patch from location where you can click to plant and grow apples and then
     * harvest them.
     */

    public AppleOrchard(CanvasWindow canvas) {

        super("Apple Orchard", 640, 340); // this is where we place the apple orchard label on the main screen

        leftAppleTree = new Label("Grow an apple!", 70, 180);
        middleAppleTree = new Label("Grow an apple!", 420, 330);
        rightAppleTree = new Label("Grow an apple!", 710, 190);


        background = new Image(0, 0, "appleorchard.png");
        appleLeft = new Apple(120, 180);
        appleMiddle = new Apple(470, 330);
        appleRight = new Apple(750, 190);

        drawLocation();
        add(leftAppleTree);
        add(middleAppleTree);
        add(rightAppleTree);

        plantApple(canvas);
    }

    /**
     * Plants an apple when you click on each of the trees. When you click multiple times, the apple
     * grows
     */

    private void plantApple(CanvasWindow canvas) {
        canvas.onClick(eventLeft -> {
            if (getElementAt(eventLeft.getPosition()) == leftAppleTree.getLabelBox()) {
                appleLeft.updatePlantImage();
                canvas.add(appleLeft.getPlant());
                if (appleLeft.grow()) {
                    additionalItem = true;
                }
            }

        });
        canvas.onClick(eventRight -> {
            if (getElementAt(eventRight.getPosition()) == middleAppleTree.getLabelBox()) {
                appleMiddle.updatePlantImage();
                canvas.add(appleMiddle.getPlant());
                if (appleMiddle.grow()) {
                    additionalItem = true;
                }
            }
        });

        canvas.onClick(eventRight -> {
            if (getElementAt(eventRight.getPosition()) == rightAppleTree.getLabelBox()) {
                appleRight.updatePlantImage();
                canvas.add(appleRight.getPlant());
                if (appleRight.grow()) {
                    additionalItem = true;
                }
            }
        });

    }

}

