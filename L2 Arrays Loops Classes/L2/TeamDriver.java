
/**
 * Write a description of class TeamDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TeamDriver
{
    public static void main(String[] args)
    {
        Team t = new Team();

        t.addPlayer(new Player("John Doe",'C',19.19,15.15,4.4));
        t.addPlayer(new Player("Jack Spratt",'F',11.11,7.7,3.3));
        t.addPlayer(new Player("Donald Duck",'G',13.13,4.4,6.6));
        t.addPlayer(new Player("Bugs Bunny",'G',8.8,2.2,1.1));
        t.addPlayer(new Player("Paul Bunyan",'C',5.5,1.1,2.2));
        t.addPlayer(new Player("Pecos Bill",'G',9.9,3.3,6.6));
        t.addPlayer(new Player("Rip van Winkle",'F',8.0,4.0,2.0));

        System.out.println(t.toString());
    }
}

