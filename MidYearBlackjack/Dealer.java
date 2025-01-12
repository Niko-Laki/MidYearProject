import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Dealer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dealer extends Actor
{   public int dealerCardPoints;
    public Card dealerCard1;
    public Card dealerCard2;
    private boolean dontTakeMoreThanOneCard = false;
    public List<Card> dealerCards;
    public Dealer() {
        dealerCardPoints = 0;
        dealerCard1 = new Card();
        dealerCard2 = new Card();    
    }
    /**
     * Act - do whatever the Dealer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        giveInitialCards();
        dealerCards = getNeighbours(200, true, Card.class);
        takeNewCard();
        updateCardPoints();
    }
    public void giveInitialCards() {
        for (int test = 0; test < 1; test++) {
            getWorld().addObject(dealerCard1, getWorld().getWidth()/2, 80);
            getWorld().addObject(dealerCard2, getWorld().getWidth()/2, 130);
        }
    }
    public void takeNewCard() {
       if (((MyWorld)(getWorld())).getTurns() % 2 != 0) {
           if (!dontTakeMoreThanOneCard) {
               if (dealerCardPoints<17) {
                   Card nextDealerCard = new Card();
                   getWorld().addObject(nextDealerCard, getWorld().getWidth()/2, 180);
                   dontTakeMoreThanOneCard = true;
                   ((MyWorld)(getWorld())).addTurn();
               }
           } else {
               dontTakeMoreThanOneCard = false;
               ((MyWorld)(getWorld())).addTurn();
           }
       }
    }
     public void updateCardPoints() {
        dealerCardPoints=0;
        for (Card current: dealerCards) {
            dealerCardPoints += current.getCardValue();
        }
        getWorld().showText("Dealer Card Points: " + dealerCardPoints, 700 ,50);
    }
    public int returnDealerCardPoints() {
        return dealerCardPoints;
    }
}