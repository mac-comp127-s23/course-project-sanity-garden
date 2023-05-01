import Plants.Apple;
import edu.macalester.graphics.*;

public class AppleOrchard extends Location {
    private Apple apple;
    private Label leftAppleTree;
    private Label middleAppleTree;
    private Label rightAppleTree;

    public AppleOrchard(CanvasWindow canvas) {

        super("Apple Orchard", 640, 340); // this is where we place the apple orchard label on the main screen
        
            // leftAppleTree = new Label("Grow an apple!", 125, 300); 
            // middleAppleTree = new Label("Grow an apple!", 450, 300); 
            // rightAppleTree = new Label("Grow an apple!", 575, 300);

            // add(leftAppleTree);
            // add(middleAppleTree);
            
            background = new Image(0, 0, "appleorchard.png");
           //  appleBud = new Image(0, 0, "strawberryBud.jpeg");
           //  flower = new Strawberry(new Image("strawberry.png"));
            // apple = new Image("sprout.png");

            drawLocation();
        // plantStrawberry(canvas);
    }
    
}
