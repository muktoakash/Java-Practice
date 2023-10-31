import java.io.*;
import java.util.Scanner;

public class AssignmentSolution2
{
    public static void main(String[] args)
    {
        String line;

        try
        {
            Scanner scan = new Scanner(new File("AssignmentInput.txt"));
            PrintStream commentsFile = new PrintStream("Comments.txt");
            PrintStream codeFile = new PrintStream("Code.txt");
            
            while (scan.hasNextLine())
            {
                line = scan.nextLine();
                
                // if line starts with two slashes
                if (line.indexOf("//") == 0)
                
                    // write line to comments file
                    commentsFile.println(line);
                else
                
                    // otherwise write it to the code file
                    codeFile.println(line);
            }

            // close files
            scan.close();
            commentsFile.close();
            codeFile.close(); 
        }
        catch(IOException e)
        {
            System.out.println("*** I/O Error ***\n" + e);
        }
    }
}