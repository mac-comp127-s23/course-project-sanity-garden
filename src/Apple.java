import edu.macalester.graphics.Image;

public class Apple extends Plant {

    /**
     * Extends the plant class specifically to an apple. Has a flower that turns into a small apple that
     * turns into a fully grown apple when clickee
     */

    public Apple(double xCoor, double yCoor) {

        super(xCoor, yCoor);

        Image flower = new Image("pixelAppleflower.png");
        flower.setMaxHeight(flower.getImageHeight() * 0.045);
        flower.setMaxWidth(flower.getImageWidth() * 0.045);

        Image tinyApple = new Image("tinyapple.png");
        tinyApple.setMaxWidth(flower.getImageWidth() * 0.3);
        tinyApple.setMaxHeight(flower.getImageHeight() * 0.3);

        Image apple = new Image("fullgrownapple.png");
        apple.setMaxWidth(apple.getImageWidth() * 0.055);
        apple.setMaxHeight(apple.getImageHeight() * 0.055);

        Image transparent = new Image("transparentsq.png");

        plantImages.add(flower);
        plantImages.add(tinyApple);
        plantImages.add(apple);
        plantImages.add(transparent);
    }


}
