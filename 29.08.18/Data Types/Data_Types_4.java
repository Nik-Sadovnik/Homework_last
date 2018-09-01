/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blackfire
 */

  

import java.util.Scanner;


public class Data_Types_4 { 
    public static void main(String[] args){

        
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a dollar amount: ");
        int dollarAmount = keyboard.nextInt();
        //Integer data fields and calculations 
        int numTwenties = dollarAmount/20;
        int numTens = (dollarAmount - 20*numTwenties)/10;
        int numFives = (dollarAmount - (10*numTens + 20*numTwenties))/5;
        int numOnes = (dollarAmount - (10*numTens + 20*numTwenties + 5*numFives));
        System.out.println("You have entered  $" + dollarAmount );
        System.out.println("That is " + numTwenties + " twenties, " + numTens + " tens, " + numFives + " fives, and " + numOnes + " ones.");

    }

} 

