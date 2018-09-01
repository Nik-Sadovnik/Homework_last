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

public class Data_Types_3 {
    public static void main (String[] args){

        System.out.println("How many Child meals you would like?");
        Scanner scan = new Scanner(System.in);
        int Cm = scan.nextInt();
        System.out.print("How many Adult meals you would like?");
        Scanner scan2 = new Scanner(System.in);
        int Am = scan.nextInt();
        System.out.print("You ordered " + Cm +" child meals that in total cost $" + Cm*4 + ". Also you ordered " +Am+" adult meals that in total cost $"+ Am*7 +". You have to pay for all "+ (Cm*4+Am*7) );
    
    
    }
}
