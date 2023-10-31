import java.io.*;
import java.util.Scanner;

public class AssignmentSolution3
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
                    commentsFile.println(line);
                
                //if there are slashes elsewhere in a line
                else if (line.indexOf("//") > 0)

                {
                     // write whole line to code file
                    codeFile.println(line);
                    
                    // write comment part of line to comments file
                    commentsFile.println(line.substring(line.indexOf("//")));
                }
                else
                    
                    // write line to code file
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