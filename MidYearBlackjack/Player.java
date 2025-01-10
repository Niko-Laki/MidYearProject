import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public int playerCardPoints;
    public Card playerCard1;
    public Card playerCard2;
    public List<Card> playerCards;
    private boolean letsNotHoldKeys = false;
    public Player() {
        //getWorld().addObject(playerCard1, 233, 261);
        //getWorld().addObject(playerCard2, 281, 312);
        playerCard1 = new Card();
        playerCard2 = new Card();
        playerCardPoints = 0;
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        giveInitialCards();
        askPlayerInput();
        playerCards = getNeighbours(200, true, Card.class);
        takeNewCards();
        updateCardPoints();
    }
    public void askPlayerInput() {
        getWorld().showText("What would you like to do?", 700, 400);
        getWorld().showText("Hit: Enter 1", 600, 430);
        getWorld().showText("Stand: Enter 2", 750, 430);
    }
    public void giveInitialCards() {
        for (int test = 0; test < 1; test++) {
            getWorld().addObject(playerCard1, 200, 261);
            getWorld().addObject(playerCard2, 210, 312);
        }
    }
    public void takeNewCards() {
        if (Greenfoot.isKeyDown("1")&& !(letsNotHoldKeys)) {
            Card nextPlayerCard = new Card();
            getWorld().addObject(nextPlayerCard,230,261);
            letsNotHoldKeys = true;
            ((MyWorld)(getWorld())).addTurn();
        } else if (!(Greenfoot.isKeyDown("1"))) {
            letsNotHoldKeys = false;
        }
    }
    public void stand() {
        if (Greenfoot.isKeyDown("2")) {
            ((MyWorld)(getWorld())).addTurn();
        }
    }
    public void updateCardPoints() {
        playerCardPoints=0;
        for (Card current: playerCards) {
            playerCardPoints += current.getCardValue();
        }
        getWorld().showText("Card Points: " + playerCardPoints, 50, 50);
    }
    public int returnPlayerCardPoints() {
        return playerCardPoints;
    }
}
