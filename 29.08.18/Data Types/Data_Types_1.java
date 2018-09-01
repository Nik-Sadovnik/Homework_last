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
public class Data_Types_1 {
    public static void main(String[] args){
        
             System.out.println("Enter first number..");
            Scanner scan1 = new Scanner(System.in);
            int J = scan1.nextInt();

     System.out.println("Enter second number..");
            Scanner scan2 = new Scanner(System.in);
            int M = scan2.nextInt();

     System.out.println("Enter third number..");
            Scanner scan3 = new Scanner(System.in);
            int F = scan3.nextInt();
        
        System.out.print(J + " . " + M + " . " + F + " . ");
    }
}
