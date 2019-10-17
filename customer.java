import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class customer {
   public static void main(String[] args) {
         Scanner sid = new Scanner(System.in);
      JFrame f = new JFrame("Add Customer");
                   
      f.setSize(300, 600);
      f.setLocation(600, 200);
                   
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   
      f.setDefaultLookAndFeelDecorated(true);
      
      JLabel labelOne = new JLabel("Name: ");
      labelOne.setBounds(50, 50, 200, 30);
      
      JTextField textOne = new JTextField();
      textOne.setBounds(50, 100, 200, 30);
      textOne.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               String input = textOne.getText();
               labelOne.setText("Name: " + input); 
            }
         });
      
      JLabel labelTwo = new JLabel("Customer's assigned ID: ");
      labelTwo.setBounds(50, 150, 200, 30);
      
      JTextField textTwo = new JTextField();
      textTwo.setBounds(50, 200, 200, 30);
      
      textTwo.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               String input = textTwo.getText();
               labelTwo.setText("Cumtomer's assigned ID: " + input); 
            }
         });
      
      JLabel labelThree = new JLabel("Phone Number: ");
      labelThree.setBounds(50, 250, 200, 30);
      
      JTextField textThree = new JTextField();
      textThree.setBounds(50, 300, 200, 30);
      
      textThree.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               String input = textThree.getText();
               labelThree.setText("Phone Number: " + input); 
            }
         });
      
      JLabel labelFour = new JLabel("Address: ");
      labelFour.setBounds(50, 350, 200, 30);
      
      
      JTextField textFour = new JTextField();
      textFour.setBounds(50, 400, 200, 30);
      
      textFour.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               String input = textFour.getText();
               labelFour.setText("Address: " + input); 
            }
         });
      
          
      
      f.add(labelOne);
      f.add(labelTwo);
      f.add(labelThree);
      f.add(labelFour);
      
      //--------------------------
      
      f.add(textOne);
      f.add(textTwo);
      f.add(textThree);
      f.add(textFour);
      
      //---------------------------
      
      f.setLayout(null);
      f.setVisible(true);
      
   }
   
}