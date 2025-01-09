import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public int cardPoints;
    public Card playerCard1;
    public Card playerCard2;
    public Player() {
            //getWorld().addObject(playerCard1, 233, 261);
        //getWorld().addObject(playerCard2, 281, 312);
        playerCard1 = new Card();
        playerCard2 = new Card();
        cardPoints = 0;
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        giveInitialCards();
        askPlayerInput();
    }
    public void askPlayerInput() {
        getWorld().showText("What would you like to do?", 700, 400);
        getWorld().showText("Hit: Enter 1", 650, 430);
        getWorld().showText("Stand: Enter 2", 750, 430);
    }
    public void giveInitialCards() {
        for (int test = 0; test < 2; test++) {
            getWorld().addObject(playerCard1, 233, 261);
            getWorld().addObject(playerCard2, 281, 312);
        }
    }
    public void takeNewCards() {
        if (Greenfoot.isKeyDown("1")) {
            Card nextPlayerCard = new Card();
            getWorld().addObject(playerCard1, 243, 261);
            cardPoints+=;
        }
    }
}
