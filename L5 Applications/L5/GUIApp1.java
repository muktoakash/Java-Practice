import java.awt.*;
import javax.swing.*;

public class GUIApp1 
{
    private JFrame frame;

    public static void main (String[] args) 
    {
        GUIApp1 gui = new GUIApp1();
        gui.start();
    }

    public void start() 
    {
        frame = new JFrame("My First GUI App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();

        JLabel label = new JLabel("Hello, world!");
        contentPane.add(label);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}