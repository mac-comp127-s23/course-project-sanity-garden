import java.util.ArrayList;

import edu.macalester.graphics.Image;

public class Apple extends Plant{
    public int AppleCount = 0;
    public Image testMushroom;
   
    /**
     * Extends the plant class specifically to an apple
     */

    public Apple(Image testMushroom) {

        super();

        price = 3;
        numberStages = 3;
        plantImages = new ArrayList<>(numberStages);

        // TO DO: change to apple images!

        plantImages.add(new Image("testMushroom.png"));
        plantImages.add(new Image("strawberryBud.jpeg"));
        plantImages.add(new Image("strawberry.png"));
        
 
    }
       
    
}
