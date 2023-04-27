import java.util.ArrayList;

import edu.macalester.graphics.Image;

public class Strawberry extends Plant{
public int howMany = 0;
public Image strawberryBud;

    public Strawberry(Image strawberryBud) {

        super();


        price = 3;
        numberStages = 3;
        plantImages = new ArrayList<>(numberStages);

        plantImages.add(new Image("testMushroom.png"));
        plantImages.add(new Image("strawberryBud.jpeg"));
        plantImages.add(new Image("strawberry.png"));
        
 
    }

    public void next(){
        if (plantImages.indexOf(getPlant()) <= 3){
            updatePlantImage();
        } else if (plantImages.indexOf(getPlant()) > 3) {
            currentPlantImage = new Image("strawberry.png");
        }
    }
}


