
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    private String name;
    private char position;
    private double avgPoints;
    private double avgRebounds;
    private double avgAssists;

    /**
     * Constructor for objects of class Player
     */
    public Player(String pName, char pPos, double pPoints, double pRebounds, double pAssists)
    {
        name = pName;
        position = pPos;
        avgPoints = pPoints;
        avgRebounds = pRebounds;
        avgAssists = pAssists;
    }

    public String toString()
    {
        return "Player: " + name + 
        "\n   Position:      " + position +
        "\n   Points/Game:   " + avgPoints +
        "\n   Rebounds/Game: " + avgRebounds +
        "\n   Assists/Game:  " + avgAssists;
    }
}
