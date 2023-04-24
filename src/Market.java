import edu.macalester.graphics.*;

public class Market extends Location {

    private int berryInventory;
    // private int berrySeedCount;// are we interested in keeping count of seeds?? 
   // private int appleInventory; 
    private double balance;
    private GraphicsText balanceDisplay; 
    private Image strawberry;
    private GraphicsText berryText;
    

    public Market(CanvasWindow canvas) {
        super("Market", 100, 200);
        balance = 0;
        berryInventory = 20;
        
        elements = new GraphicsGroup(0, 0);
        strawberry = new Image(300,350, "strawberryBud.jpeg"); // strawberry bud is a placeholder for now 
        berryText = new GraphicsText("Sell a strawberry for $1.50 here:", 500, 200);
        balanceDisplay = new GraphicsText("your balance: " + balance, 500, 100);
        elements.add(balanceDisplay);
        elements.add(strawberry);
        elements.add(berryText);

        background = new Image(0,0, "Market.png"); 
        //this.berryInventory = StrawberryPatch.strawberryCount; // whatever we end up making the count for strawberry to be?? so two separate instances? 
       // this.appleInventory = appleOrchard.appleCount;

       drawLocation();
       sell(canvas);
    }

    private void sell(CanvasWindow canvas){
        canvas.onClick(event -> {
            if (elements.getElementAt(event.getPosition()) == strawberry){
                balance = balance + 1.5;
                berryInventory--;
                elements.remove(balanceDisplay);
                balanceDisplay = new GraphicsText("your balance: " + balance, 500, 100);
                elements.add(balanceDisplay);
            }
        });
        
        // if (appleInventory){
        //     balance = balance + 5;
        // }
    }

    // private void buySeeds(){
    //     if (strawberry){
    //         balance = balance + 1.5;
    //         invetory 
    //     }
        // if (apple){
        //     balance = balance + 5;
        // }
    // }

}

