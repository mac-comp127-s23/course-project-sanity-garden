import edu.macalester.graphics.*;

public class AppleOrchard extends Location {
    private Apple appleLeft;
    private Apple appleMiddle;
    private Apple appleRight;
    private Label leftAppleTree;
    private Label middleAppleTree;
    private Label rightAppleTree;

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


    private void plantApple(CanvasWindow canvas) {
        canvas.onClick(eventLeft -> {
            if (getElementAt(eventLeft.getPosition()) == leftAppleTree.getLabelBox()) {
                appleLeft.updatePlantImage();
                canvas.add(appleLeft.getPlant());
                appleLeft.grow();
            }

        });
            canvas.onClick(eventRight -> {
                if (getElementAt(eventRight.getPosition()) == middleAppleTree.getLabelBox()) {
                    appleMiddle.updatePlantImage();
                    canvas.add(appleMiddle.getPlant());
                    appleMiddle.grow();
                }
        });

        canvas.onClick(eventRight -> {
            if (getElementAt(eventRight.getPosition()) == rightAppleTree.getLabelBox()) {
                appleRight.updatePlantImage();
                canvas.add(appleRight.getPlant());
                appleRight.grow();
            }
    });

}

    }

    


    
