import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class user {
   public static void main(String[] args) {
         Scanner sid = new Scanner(System.in);
      JFrame f = new JFrame("Welcome to Shop Help!");
                   
      f.setSize(300, 300);
      f.setLocation(600, 200);
                   
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   
      f.setDefaultLookAndFeelDecorated(true);
      
      JLabel labelOne = new JLabel("Add Product");
      labelOne.setBounds(50, 50, 200, 30);
      
      JLabel labelTwo = new JLabel("Add Customer");
      labelTwo.setBounds(50, 100, 200, 30);
      
      JLabel labelThree = new JLabel("Add Transaction");
      labelThree.setBounds(50, 150, 200, 30);   
      
      f.add(labelOne);
      f.add(labelTwo);
      f.add(labelThree);
      
      //--------------------------
      
      f.setLayout(null);
      f.setVisible(true);
      
   }
   
}