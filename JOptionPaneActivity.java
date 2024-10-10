/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joptionpaneactivity;
import javax.swing.JOptionPane;
/**
 *
 * @author macbookpro
 */
public class JOptionPaneActivity {
    
public class Calculator {
    
}
 
    public static void main(String[] args) {
       /* Create a class called Calculator that has four methods:
       add(), subtract(), divide(), multiple(), all these returns a value
       Using JOptionPane, accepts input of 2 numbers from the user, display a 
       menu for a user to chose what calculation they want to perform on the 2 
       numbers. Also use a while loop so that a user can choose other operations
       they would want to perform on the numbers, do not use if statements but switch case
       statements. Your application should run up until you enter zero as an option. */
   
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter first number"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter second number"));

        int choice;
        do {
            choice = Integer.parseInt(JOptionPane.showInputDialog("Choose an operation:\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n0. Exit"));
            switch (choice) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Result: " + (num1 + num2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Result: " + (num1 - num2));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Result: " + (num1 * num2));
                    break;
                case 4:
                        JOptionPane.showMessageDialog(null, "Result: " + (num1 / num2));                 
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Exiting...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please choose a valid operation.");
            }
        } 
        while (choice != 0);
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }
        } 
    

