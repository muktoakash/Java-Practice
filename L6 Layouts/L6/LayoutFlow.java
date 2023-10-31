import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LayoutFlow
{
    private JFrame frame;

    public static void main (String[] args) 
    {
        LayoutBorder guiLayout = new LayoutBorder();
        guiLayout.start();
    }

    public void start() 
    {
        frame = new JFrame("Box Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        contentPane.add(new JButton("First Button"));
        contentPane.add(new JButton("Second Button - a long one"));
        contentPane.add(new JButton("Third Button"));
        contentPane.add(new JButton("Fourth Button"));

        frame.pack();
        frame.setVisible(true);
    }
}
