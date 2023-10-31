public class TeamAlt
{
    private MyList<Player> roster; // ArrayList to hold the roster
    public TeamAlt()
    {
        roster = new MyConcreteArrayList<Player>(); // create ArrayList
    }

    public void addPlayer(Player player)
    {
        roster.add(player); // add player to roster
    }

    public String toString()
    {
        String teamRoster = "Team Roster\n\n"; // output String

        for (int i = 0; i < roster.size(); i++)     // for each player in roster
        {
            teamRoster = teamRoster + roster.get(i).toString() + "\n"; // add name to output
        }
        return teamRoster;     // return output string
    }

    public String toFile()
    {
        String fileRoster = ""; // output String
        for (int i = 0; i < roster.size(); i++)     // for each player in roster
        {
            fileRoster = fileRoster + roster.get(i).toFile() + "\n"; // add name to output
        }
        return fileRoster;      // return output string
    }
}