package com.foundation;

import javax.swing.*;

public class JOptionInput {
   public static void main(String[] args)
   {
       String Name;
       String Surname;

       Name = JOptionPane.showInputDialog("Enter Your Name: ");
       Surname = JOptionPane.showInputDialog("Enter Your Surname");

       JOptionPane.showMessageDialog(null, "Your Full Name is: "+Name+Surname);

       int Age;
       int Age1;
       String input;

       input = JOptionPane.showInputDialog("Enter Your Birthday: ");
       Age = Integer.parseInt(input);
       input = JOptionPane.showInputDialog("Enter The Current Year: ");
       Age1 = Integer.parseInt(input);

       double Average;
       Average = (Age1 - Age);
       JOptionPane.showMessageDialog(null,"Your Age is: "+ Average);
       


    }
}
