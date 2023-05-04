import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.Image;

public abstract class Plant {
    protected Image currentPlantImage;
    protected int growthStage;
    protected List<Image> plantImages;
    protected double xCoor;
    protected double yCoor;

    /**
     * Creates an overall plant class with an image, each growth stage of the plant, the price and keeps
     * track of the current stage and how many of the plant are currently in your inventory.
     */

    public Plant(double xCoor, double yCoor) {
        plantImages = new ArrayList<>();
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        growthStage = 0;
    }

    public Image getPlant() {
        return currentPlantImage;
    }

    /**
     * Updates the plant image based on what growth stage the plant is at
     */

    public boolean grow() {
        if (growthStage < plantImages.size() - 1) {
            growthStage++;
            updatePlantImage();
            return false;
        } else {
            growthStage = 0;
            updatePlantImage();
            return true;
        }
    }

    public void updatePlantImage() {
        currentPlantImage = plantImages.get(growthStage);
        currentPlantImage.setCenter(xCoor, yCoor);
    }

    public List<Image> getPlantImages() {
        return plantImages;
    }

    public int getGrowthStage() {
        return growthStage;
    }

    public void setGrowthStage(int stage) {
        growthStage = stage;
    }

}

