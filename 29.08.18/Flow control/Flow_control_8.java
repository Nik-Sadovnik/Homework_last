/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Blackfire
 */
public class Flow_control_8 {
 public static void main(String[] args){

     System.out.println("Enter points scored by Art..");
            Scanner scan1 = new Scanner(System.in);
            int Art = scan1.nextInt();

     System.out.println("Enter points scored by Bob..");
            Scanner scan2 = new Scanner(System.in);
            int Bob = scan2.nextInt();

     System.out.println("Enter points scored by Cal..");
            Scanner scan3 = new Scanner(System.in);
            int Cal = scan3.nextInt();

     System.out.println("Enter points scored by Dan..");
            Scanner scan4 = new Scanner(System.in);
            int Dan = scan4.nextInt();

     System.out.println("Enter points scored by Eli..");
            Scanner scan5 = new Scanner(System.in);
            int Eli = scan5.nextInt();

System.out.print("Art Scored:   ");
           for(int i=0; i<Art; i++){
               System.out.print("*");}            
           
           System.out.print("\n");
           
System.out.print("Bob Scored:   ");
           for(int i=0; i<Bob; i++){
               System.out.print("*");}
           
           System.out.print("\n");
            
System.out.print("Cal Scored:   ");
           for(int i=0; i<Cal; i++){
               System.out.print("*");}
           
            System.out.print("\n");
            
System.out.print("Dac Scored:   ");
           for(int i=0; i<Dan; i++){
               System.out.print("*");}
           
            System.out.print("\n");
     
            
System.out.print("Eli Scored:   ");
           for(int i=0; i<Eli; i++){
               System.out.print("*");}
     
             System.out.print("\n");
                     
}
}