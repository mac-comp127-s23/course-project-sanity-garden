import Plants.Apple;
import edu.macalester.graphics.*;

public class AppleOrchard extends Location {
    private Apple apple;
    private Label leftAppleTree;
    private Label middleAppleTree;
    private Label rightAppleTree;

    public AppleOrchard(CanvasWindow canvas) {

        super("Apple Orchard", 640, 340); // this is where we place the apple orchard label on the main screen
        
            leftAppleTree = new Label("Grow an apple!", 85, 195); 
            middleAppleTree = new Label("Grow an apple!", 420, 330); 
            rightAppleTree = new Label("Grow an apple!", 690, 220);

        
            background = new Image(0, 0, "appleorchard.png");
            apple = new Apple(new Image("strawberry.png"));
    
            drawLocation();
            add(leftAppleTree);
            add(middleAppleTree);
            add(rightAppleTree);
    
            plantApple(canvas);
    }


    private void plantApple(CanvasWindow canvas) {
        canvas.onClick(event -> {

            if (getElementAt(event.getPosition()) == leftAppleTree.getLabelBox()) {
                apple.updatePlantImage();
                canvas.add(apple.getPlant());
                apple.grow();
            }
            if (getElementAt(event.getPosition()) == middleAppleTree.getLabelBox()) {
                apple.updatePlantImage();
                canvas.add(apple.getPlant());
                apple.grow();
            }
            if (getElementAt(event.getPosition()) == rightAppleTree.getLabelBox()) {
                apple.updatePlantImage();
                canvas.add(apple.getPlant());
                apple.grow();
            }
        });

    }
    
}
