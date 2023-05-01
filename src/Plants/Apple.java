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
        
        Image flower = new Image("pixelAppleflower.png");
        flower.setMaxHeight(flower.getImageHeight() * 0.07);
        flower.setMaxWidth(flower.getImageWidth() * 0.07);

        Image tinyApple = new Image("tinyapple.png");
        tinyApple.setMaxWidth(flower.getImageWidth() * 0.2);
        tinyApple.setMaxHeight(flower.getImageHeight() * 0.2);

        Image apple = new Image("fullgrownapple.png");
        apple.setMaxWidth(apple.getImageWidth() * 0.03);
        apple.setMaxHeight(apple.getImageHeight() * 0.03);

        plantImages.add(flower);
        plantImages.add(tinyApple);
        plantImages.add(apple);
        
 
    }
       
    
}
