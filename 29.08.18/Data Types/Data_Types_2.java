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

public class Data_Types_2 {
    public static void main (String[] args){
        
        
        
        
        System.out.println("What is the number of eggs you would like to buy?");
        Scanner scan = new Scanner(System.in);
        int Sc = scan.nextInt();
        System.out.print("You ordered " + Sc + " eggs. ");
        double pb = 3.25;
        double pe = 0.45;
        int a=0;
        for(int b=0; Sc>11; b++){
           Sc=Sc-12; 
           a=a+1;
        }

        
        System.out.print("That’s "+ a +" dozen at $3.25  per dozen and "+ Sc +" loose eggs at 45 cents each for a total of $"+  (a*pb+Sc*pe)  );  
            

        
            
            
        
    }
    }   

