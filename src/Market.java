import edu.macalester.graphics.*;

public class Market {

    private CanvasWindow canvas;
    private int berryInventory;
    // private int berrySeedCount;// are we interested in keeping count of seeds?? 
   // private int appleInventory; 
    private double balance;
    private GraphicsText balanceDisplay; 
    private Image strawberry;
    private GraphicsGroup sellABerry;
    private GraphicsText berryText;

    public Market(){
        
        sellABerry = new GraphicsGroup(0, 0);
        sellABerry.add(strawberry);

        berryText = new GraphicsText("Sell a strawberry for $1.50");
        sellABerry.add(berryText);

        balanceDisplay = new GraphicsText("your balance: " + balance);

        Image market = new Image(0,0, "Market.png");
        Image strawberry = new Image(300,350, "strawberryBud.jpeg"); // strawberry bud is a placeholder for now  
        this.berryInventory = Strawberry.strawberryCount; // whatever we end up making the count for strawberry to be?? so two separate instances? 
       // this.appleInventory = appleOrchard.appleCount;
        
    }

    private void sellFruit(){
        canvas.onClick(event -> {
            if (sellABerry.getElementAt(event.getPosition()) == strawberry){
                balance = balance + 1.5;
                berryInventory--;
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

// buy and sell things, keep track of money 
