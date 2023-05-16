/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sammysrentalprice;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SammysRentalPrice {

    public static void main(String[] args) {
        // Prompt the user for the number of minutes rented
        Scanner scanner = new Scanner(System.in);
        
        int minutes = Integer.parseInt(JOptionPane.showInputDialog(    "Enter the number of minutes rented: "));

        // Calculate the hours and additional minutes
        int hours = minutes / 60;
        int additionalMinutes = minutes % 60;

        // Calculate the rental cost
        int totalMinutes = minutes + (hours * 60);
        int rentalCost = (hours * 40) + (additionalMinutes * 1);

        // Display the heading
        //JOptionPane.showInputDialog("Sammy’s Seashore Supplies");
        //JOptionPane.showInputDialog("-------------------------");

        // Display the hours, minutes, and total price
        JOptionPane.showMessageDialog(null, "Hours: " + hours);
        JOptionPane.showMessageDialog(null, "Minutes: " + additionalMinutes);
        JOptionPane.showMessageDialog(null, "Total Price: $" + rentalCost);

        // Close the scanner
        scanner.close();
    }
}
