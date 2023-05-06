import edu.macalester.graphics.*;
import edu.macalester.graphics.ui.Button;

public class AppleOrchard extends Location {
    private Apple appleLeft;
    private Apple appleMiddle;
    private Apple appleRight;
    private Button leftAppleTree;
    private Button middleAppleTree;
    private Button rightAppleTree;

    /**
     * Creates an apple patch from location where you can click to plant and grow apples and then
     * harvest them.
     */

    public AppleOrchard(CanvasWindow canvas) {

        super("Apple Orchard", 640, 340); // this is where we place the apple orchard label on the main screen

        leftAppleTree = new Button("click to grow an apple!");
        middleAppleTree = new Button("click to grow an apple!");
        rightAppleTree = new Button("click to grow an apple!");

        leftAppleTree.setPosition(50, 410);
        middleAppleTree.setPosition(395, 550);
        rightAppleTree.setPosition( 690, 425);


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
        leftAppleTree.onClick(() -> {
                appleLeft.updatePlantImage();
                canvas.add(appleLeft.getPlant());
                if (appleLeft.grow()) {
                    additionalItem = true;
                    for (Image image : appleLeft.getPlantImages()) {
                        canvas.pause(20);
                        canvas.remove(image);
                    }
                }
        });
        middleAppleTree.onClick(() -> {
                appleMiddle.updatePlantImage();
                canvas.add(appleMiddle.getPlant());
                if (appleMiddle.grow()) {
                    additionalItem = true;
                    for (Image image : appleMiddle.getPlantImages()) {
                        canvas.pause(20);
                        canvas.remove(image);
                    }
                }
        });

        rightAppleTree.onClick(() -> {
                appleRight.updatePlantImage();
                canvas.add(appleRight.getPlant());
                if (appleRight.grow()) {
                    additionalItem = true;
                    for (Image image : appleRight.getPlantImages()) {
                        canvas.pause(20);
                        canvas.remove(image);
                    }
                }
        });

    }


    public void resetGrowthStage() {
        appleLeft.setGrowthStage(0);
        appleMiddle.setGrowthStage(0);
        appleRight.setGrowthStage(0);
    }

}

