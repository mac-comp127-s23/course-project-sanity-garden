
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
    protected double xCoor;
    protected double yCoor;
    protected Item item;

    /**
     * Creates an overall plant class with an image, each growth stage of the plant, the price
     * and keeps track of the current stage and how many of the plant are currently in your inventory.
     */

    public Plant(double xCoor, double yCoor, Item item) {

        currentPlantImage = new Image("testMushroom.png");
        this.xCoor = xCoor;
        this.yCoor = yCoor;

        this.item = item;
        howMany = item.getItemCount();
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
        item.setItemCount(howMany++);
    }

    public void updatePlantImage() {
        currentPlantImage = plantImages.get(growthStage);
        currentPlantImage.setPosition(xCoor, yCoor);
    }

    }


