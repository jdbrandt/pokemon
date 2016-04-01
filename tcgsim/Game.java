
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{

    private Player p1;
    private Player p2;
    private Player currentPlayer;
    
    private Stadium currentStadium;

    /**
     * Constructor for objects of class Game
     */
    public Game(Player p1, Player p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean isSetup()
    {
        return checkDeckSize() && check4Cards();
    }

    private boolean checkDeckSize()
    {
       //allows for easily adjustable formats
       int properDeckSize = 60;
       
       
       //I know I could just do return condition1 && condition2, but this seems more obvious to me
       
       if (p1.getDeck().size() == properDeckSize && p2.getDeck().size() == properDeckSize) 
       {
           return true;
       }
       
       else 
       {
           return false;
       }
    }
    
    /**
     * Purpose: Make sure each deck has strictly less than 5 of the same card (b/c (n<5) <==> !(n>4) if n is an element of set of integers)  
     * Future todos: Possibly change return type from boolean to int to allow for different errors (0 if everything's hunky-dory, 1 if p1 failed, 2 if p2 failed)? Maybe split
     * into 2 method calls, where check4Cards takes an ArrayList<Cards>?
     */
    
    private boolean check4Cards()
    {
        
        for (Card c1 : p1.getDeck())
        {
            int counter = 0;
            for (Card c2 : p1.getDeck())
            {
                if (c1.equals(c2))
                {
                    counter += 1;
                }
            }
            if (counter > 4)
            {
                return false;
            }
        }

        for (Card c1 : p2.getDeck())
        {
            int counter = 0;
            for (Card c2 : p2.getDeck())
            {
                if (c1.equals(c2))
                {
                    counter += 1;
                }
            }
            if (counter > 4)
            {
                return false;
            }
        }

        return true;

    }
    
    
    
}
