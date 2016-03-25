
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
        return p1.getDeck().size() == 60 && p2.getDeck().size() == 60;
    }

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
