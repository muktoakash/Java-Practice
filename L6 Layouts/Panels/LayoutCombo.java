import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LayoutCombo implements ActionListener
{
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton button1, button2, button3, button4;
    private JTextArea textArea;
    private JScrollPane scrollArea;

    public static void main (String[] args)
    {
        LayoutCombo guiLayout = new LayoutCombo();
        guiLayout.start();
    }

    public void start()
    {
        frame = new JFrame("Border and Box Layouts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());

        label = new JLabel("Click a button to see its text appear below:");
        contentPane.add(label, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        button1 = new JButton("Button 1");
        button1.addActionListener(this);
        panel.add(button1);
        button2 = new JButton("Button 2");
        button2.addActionListener(this);
        panel.add(button2);
        button3 = new JButton("Button 3");
        button3.addActionListener(this);
        panel.add(button3);
        button4 = new JButton("Button 4");
        button4.addActionListener(this);
        panel.add(button4);
        contentPane.add(panel, BorderLayout.WEST);

        textArea = new JTextArea(10,25);
        scrollArea = new JScrollPane(textArea);
        scrollArea.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollArea.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        contentPane.add(scrollArea, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == button1)
            textArea.append("Button 1 was clicked.\n");
        else if (e.getSource() == button2)
            textArea.append("Button 2 was clicked.\n");
        else if (e.getSource() == button3)
            textArea.append("Button 3 was clicked.\n");
        else if (e.getSource() == button4)
            textArea.append("Button 4 was clicked.\n");
        else
            textArea.append("Should not get here!\n");
    }
}