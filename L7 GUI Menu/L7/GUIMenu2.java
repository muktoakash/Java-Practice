import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIMenu2
{
    private JFrame frame;    public static void main (String[] args) 
    {
        GUIMenu2 gui = new GUIMenu2();
        gui.start();
    }    

    public void start() 
    {
        frame = new JFrame("GUI Menus");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();

        makeMenus();   
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    private void makeMenus()
    {
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;

        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        // set up the File menu
        menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(menu);

        // add File menu items
        menuItem = new JMenuItem("New");
        menuItem.setMnemonic(KeyEvent.VK_N);
        menuItem.addActionListener(new newListener());
        menuItem.setAccelerator(
            KeyStroke.getKeyStroke(KeyEvent.VK_N,
                Event.CTRL_MASK));
        menu.add(menuItem);

        menuItem = new JMenuItem("Open...");
        menuItem.setMnemonic(KeyEvent.VK_O);
        menuItem.addActionListener(new openListener());
        menuItem.setAccelerator(
            KeyStroke.getKeyStroke(KeyEvent.VK_O,
                Event.CTRL_MASK));
        menu.add(menuItem);

        menuItem = new JMenuItem("Save");
        menuItem.setMnemonic(KeyEvent.VK_S);
        menuItem.addActionListener(new saveListener());
        menuItem.setAccelerator(
            KeyStroke.getKeyStroke(KeyEvent.VK_S,
                Event.CTRL_MASK));
        menu.add(menuItem);

        menuItem = new JMenuItem("Save As...");
        menuItem.setMnemonic(KeyEvent.VK_A);
        menuItem.setDisplayedMnemonicIndex(5);
        menuItem.addActionListener(new saveAsListener());
        menu.add(menuItem);

        menu.addSeparator();

        menuItem = new JMenuItem("Exit");
        menuItem.setMnemonic(KeyEvent.VK_X);
        menuItem.addActionListener(new exitListener());
        menuItem.setAccelerator(
            KeyStroke.getKeyStroke(KeyEvent.VK_Q,
                Event.CTRL_MASK));
        menu.add(menuItem);
    }

    private class newListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(frame, 
                "The  File > New  menu option was clicked", 
                "Menu Item Click", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class openListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(frame, 
                "The  File > Open...  menu option was clicked", 
                "Menu Item Click", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class saveListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(frame, 
                "The  File > Save  menu option was clicked", 
                "Menu Item Click", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class saveAsListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(frame, 
                "The  File > Save As...  menu option was clicked", 
                "Menu Item Click", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class exitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
}