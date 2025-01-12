import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{   public int turnNumber;
    public boolean isFirstTurn = true;
    public Player player;
    public Dealer dealer;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(860, 472, 1); 
        prepare();
        turnNumber = 0;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player1 = new Player();
        addObject(player1,100 ,200 );
        Dealer dealer = new Dealer();
        addObject(dealer, getWidth()/2, 30);
    }
    public void act() {
        player = (Player)getObjects(Player.class).get(0);
        dealer = (Dealer)getObjects(Dealer.class).get(0);
        playerWon();
        playerBlackjack();
        autoLose();
    }
    public void addTurn() {
        turnNumber++;
    }
    public int getTurns() {
        return turnNumber;
    }
    public void setFirstTurn() {
        if (turnNumber != 0) {
            isFirstTurn = false;
        }
    }
    public boolean returnFirstTurn() {
        return isFirstTurn;
    }
    public void establishPlayerDealer() {
        Player player = (Player)getObjects(Player.class).get(0);
        Dealer dealer = (Dealer)getObjects(Dealer.class).get(0);
    }
    public void playerBlackjack() {
        if (player.returnPlayerCardPoints()==21 
        && dealer.returnDealerStand()) {
            showText("PLAYER BLACKJACK!", getWidth()/2, getHeight()/2);
            Greenfoot.stop();
        } 
    }
    public void playerWon() {
        if (player.isStanding() && dealer.returnDealerStand()) {
                if (player.returnPlayerCardPoints()>dealer.returnDealerCardPoints()) {
                showText("Player Wins!", getWidth()/2, getHeight()/2);
                Greenfoot.stop();
                } else {
                    showText("Dealer Wins!", getWidth()/2, getHeight()/2);
                    Greenfoot.stop();
                }
        }
    }
    public void autoLose() {
        if(dealer.returnDealerCardPoints() > 21) {
          showText("Player Wins! Dealer over 21!", getWidth()/2, getHeight()/2);  
          Greenfoot.stop();  
        } else if (player.returnPlayerCardPoints()>21) {
            showText("Dealer Wins! Player over 21!", getWidth()/2, getHeight()/2);
        }
    }
}
    
