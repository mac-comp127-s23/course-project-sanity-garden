import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.Image;

public abstract class Plant {
    public int howMany = 0;
    public Image currentPlantImage = new Image("strawberry.png");
    protected int growthStage = 0; 
    protected int numberStages = 0;
    protected int price;
    protected int currentStage = 0; 
    protected List<Image> plantImages;


    public Plant() {

       
    }

    public Image getPlant() {
        return currentPlantImage;
    }

    public void grow(){
        if (currentStage <= numberStages){
            growthStage++;
            updatePlantImage();
        } else {
            currentStage = 0;
            harvest();
        }
    }

    public void harvest(){
        howMany++;
    }

    public void updatePlantImage(){
        currentPlantImage = plantImages.get(growthStage);
    }

    

}

