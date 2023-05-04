import edu.macalester.graphics.Image;

public class Strawberry extends Plant{
   
    /**
     * Extends the plant class specifically to a strawberry
     */
    public Strawberry(double xCoor, double yCoor) {

        super(xCoor, yCoor);

        Image seed = new Image("strawseed.png");
        seed.setMaxWidth(seed.getImageWidth() * 0.08);
        seed.setMaxHeight(seed.getImageHeight() * 0.08);

        Image sprout = new Image("realsprout.png");
        sprout.setScale(0.1, 0.09);

        Image strawberry = new Image("strawberry.png");
        strawberry.setScale(2, 2);

        Image transparent = new Image("transparentsq.png");

        plantImages.add(seed);
        plantImages.add(sprout);
        plantImages.add(strawberry);
        plantImages.add(transparent);
    }
}


