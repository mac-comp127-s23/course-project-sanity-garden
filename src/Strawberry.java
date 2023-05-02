
import edu.macalester.graphics.Image;

public class Strawberry extends Plant{
public int strawberryCount = 0;
private static Item strawberryItem = new Item("Strawbery", 1.5, 20);
   
    /**
     * Extends the plant class specifically to a strawberry
     */

    public Strawberry(double xCoor, double yCoor) {

        super(xCoor, yCoor, strawberryItem);
        item = strawberryItem;

        Image seed = new Image("strawseed.png");
        seed.setMaxWidth(seed.getImageWidth() * 0.08);
        seed.setMaxHeight(seed.getImageHeight() * 0.08);

        Image sprout = new Image("realsprout.png");
        sprout.setScale(0.1, 0.09);



        plantImages.add(seed);
        plantImages.add(sprout);
        plantImages.add(new Image("strawberry.png"));
        
 
    }
       
}


