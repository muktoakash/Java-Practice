import java.io.*;
import java.util.Scanner;

public class TeamDriver
{
    public static void main(String[] args)
    {
        Team t = new Team();
        String name;
        char position;
        double avgPoints;
        double avgRebounds;
        double avgAssists;

        try
        {
            Scanner scan = new Scanner(new File("TeamFile.txt"));
            while (scan.hasNext())
            {
                name = scan.next() + " " + scan.next();
                position = scan.next().charAt(0);
                avgPoints = scan.nextDouble();
                avgRebounds = scan.nextDouble();
                avgAssists = scan.nextDouble();
                t.addPlayer(new Player(name, position, avgPoints, avgRebounds, avgAssists));
            }

            scan.close();
        }
        catch(IOException e)
        {
            System.out.println("*** I/O Error ***\n" + e);
        }

        System.out.println(t.toString());

        PrintStream oFile;

        try
        {
            oFile = new PrintStream("TeamFile.txt");
            oFile.print(t.toFile());
            oFile.close();
        }
        catch(IOException e)
        {
            System.out.println("*** I/O Error ***\n" + e);
        }
    }
}