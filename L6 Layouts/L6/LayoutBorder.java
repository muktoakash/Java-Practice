import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LayoutBorder 
{
    private JFrame frame;

    public static void main (String[] args) 
    {
        LayoutBorder guiLayout = new LayoutBorder();
        guiLayout.start();
    }

    public void start() 
    {
        frame = new JFrame("Border Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());

        contentPane.add(new JButton("North Button"), 
            BorderLayout.NORTH);
        contentPane.add(new JButton("South Button"),
            BorderLayout.SOUTH);
        contentPane.add(new JButton("East Button"),
            BorderLayout.EAST);
        contentPane.add(new JButton("West Button"),
            BorderLayout.WEST);
        contentPane.add(new JButton("Center Button"),
            BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}