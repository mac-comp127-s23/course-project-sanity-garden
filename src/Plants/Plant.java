package Plants;
import java.util.List;

import edu.macalester.graphics.Image;

public abstract class Plant {
    public int howMany = 0;
    // Add an itemType for each Plant, intialize howMany to itemType
    public Image currentPlantImage;
    protected int growthStage = 0;
    protected int numberStages = 0;
    protected int currentStage = 0;
    protected List<Image> plantImages;

    /**
     * Creates an overall plant class with an image, each growth stage of the plant, the price
     * and keeps track of the current stage and how many of the plant are currently in your inventory.
     */

    public Plant() {

        currentPlantImage = new Image("testMushroom.png");

    }

    public Image getPlant() {
        return currentPlantImage;
    }

    /**
     * Updates the plant image based on what groth stage the plan is at
     */

    public void grow() {
        if (currentStage < numberStages - 1) {
            growthStage++;
            updatePlantImage();
        } else {
            currentStage = 0;
            harvest();
        }
    }
    
       /**
     * Adds a strawberry to your inventory each time you harvest it.
     */

    public void harvest() {
        howMany++;
    }

    public void updatePlantImage() {
        currentPlantImage = plantImages.get(growthStage);
    }

    public int getHowMany() {
        return howMany;
    }

    public void setHowMany(int newAmount) {
        howMany = newAmount;
    }

    public void setPlantPosition(double x, double y) {
        currentPlantImage.setPosition(x, y);
    }
}

