import java.awt.*;  
    import java.awt.event.*;  
    import javax.swing.*;  
      
    public class LayoutGridTicTacToe implements ActionListener  
    {  
        private JFrame frame;  
        private JButton button;  
        private boolean isX = true;  
     
       public static void main (String[] args)  
       {  
           LayoutGridTicTacToe guiLayout = new LayoutGridTicTacToe();  
           guiLayout.start();  
       }  
     
       public void start()  
       {  
           frame = new JFrame("Grid Layout");  
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
           Container contentPane = frame.getContentPane();  
           contentPane.setLayout(new GridLayout(3,3));  
     
           for (int i = 0; i < 9; i++)  
           {  
               button = new JButton("");  
               button.addActionListener(this);  
               contentPane.add(button);  
           }  
     
           frame.setSize(200,200);  
           frame.setVisible(true);  
       }  
     
       public void actionPerformed(ActionEvent e)  
       {  
           JButton b = (JButton)e.getSource();  
           if (b.getText().equals("")) 
           {  
               if (isX)  
                   b.setText("X");  
               else  
                   b.setText("O");  
               isX = !isX;  
           }  
       }  
   }  