import java.util.ArrayList;

public class Team
{
    private ArrayList<Player> roster; // declare array for roster

    public Team()
    {
        roster = new ArrayList<Player>(); // create array for roster
    }

    public void addPlayer(Player player)
    {
        roster.add(player); // add player to roster
    }

    public String toString()
    {
        String teamRoster = "Team Roster\n\n"; // output String

        for (Player p : roster)     // for each player in roster
        {
            teamRoster = teamRoster + p.toString() + "\n"; // add name to roster
        }

        return teamRoster;                    // return roster
    }

    public String toFile()
    {
        String fileRoster = ""; // output String

        for (Player p : roster)     // for each player in roster
        {
            fileRoster = fileRoster + p.toFile() + "\n"; // add name to roster
        }

        return fileRoster;                    // return roster
    }
}
