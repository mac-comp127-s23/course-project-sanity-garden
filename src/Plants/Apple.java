package Plants;
import java.util.ArrayList;

import edu.macalester.graphics.Image;

public class Apple extends Plant{
    public int AppleCount = 0;
    public Image fullgrownapple;
   
    /**
     * Extends the plant class specifically to an apple
     */

    public Apple(Image testMushroom) {

        super();

        numberStages = 3;
        plantImages = new ArrayList<>(numberStages);

        plantImages.add(new Image("appleflower.png"));
        plantImages.add(new Image("tinyapple.png"));
        plantImages.add(new Image("fullgrownapple.png"));
        
 
    }
       
    
}
