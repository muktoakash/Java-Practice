
/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{

    private Player[] roster; // array for roster
    private int teamSize;    // number of players in roster

    /**
     * Constructor for objects of class Team
     */
    public Team()
    {
        // initialise instance variables
        roster = new Player[20];
        teamSize = 0;
    }

    public Team(int arraySize)
    {
        roster = new Player[arraySize]; // create array
        teamSize = 0;     // initialize team size
    }

    public void addPlayer(Player player)
    {
        if (teamSize < roster.length)
        {
            roster[teamSize] = player; // add player to roster
            teamSize++;                    // increment team size
        }
    }

    public String toString()
    {
        String teamRoster = "Team Roster\n\n"; // output String
        int i = 0;                             // loop counter

        while (i < teamSize)                   // while more players
        {
            teamRoster = teamRoster + roster[i].toString() + "\n"; // add to roster
            i++;                               // increment loop counter
        }

        return teamRoster;                    // return roster               // return roster
    }
}
