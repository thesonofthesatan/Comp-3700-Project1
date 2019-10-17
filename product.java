import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class product {
   public static void main(String[] args) {
         Scanner sid = new Scanner(System.in);
      JFrame f = new JFrame("Add Product");
                   
      f.setSize(300, 600);
      f.setLocation(600, 200);
                   
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   
      f.setDefaultLookAndFeelDecorated(true);
      
      JLabel labelOne = new JLabel("Product Name: ");
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
      
      JLabel labelTwo = new JLabel("Product ID: ");
      labelTwo.setBounds(50, 150, 200, 30);
      
      JTextField textTwo = new JTextField();
      textTwo.setBounds(50, 200, 200, 30);
      
      textTwo.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               String input = textTwo.getText();
               labelTwo.setText("Product ID: " + input); 
            }
         });
      
      JLabel labelThree = new JLabel("Price: ");
      labelThree.setBounds(50, 250, 200, 30);
      
      JTextField textThree = new JTextField();
      textThree.setBounds(50, 300, 200, 30);
      
      textThree.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               String input = textThree.getText();
               labelThree.setText("Price: " + input); 
            }
         });
      
      JLabel labelFour = new JLabel("Stock: ");
      labelFour.setBounds(50, 350, 200, 30);
      
      
      JTextField textFour = new JTextField();
      textFour.setBounds(50, 400, 200, 30);
      
      textFour.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               String input = textFour.getText();
               labelFour.setText("Stock: " + input); 
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