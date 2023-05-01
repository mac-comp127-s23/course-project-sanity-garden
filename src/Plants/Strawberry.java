package Plants;
import java.util.ArrayList;

import edu.macalester.graphics.Image;

public class Strawberry extends Plant{
public int strawberryCount = 0;
public Image strawberryBud;
   
    /**
     * Extends the plant class specifically to a strawberry
     */

    public Strawberry(Image strawberryBud) {

        super();

        numberStages = 3;
        plantImages = new ArrayList<>(numberStages);

        plantImages.add(new Image("testMushroom.png"));
        plantImages.add(new Image("sprout.png"));
        plantImages.add(new Image("strawberry.png"));
        
 
    }
       
}


