

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

public class Data_Types_5 {
 public static void main(String[] args){
     System.out.print("Introduce how many minutes you need");
       Scanner keyboard = new Scanner(System.in);
       int Ma = keyboard.nextInt();
       int Ha = Ma/60;
       double Da = Ma/1440;
       System.out.printf("Hours number is "+ Ha + ". Number of Days is "+ Da + "." + "\n");
            System.out.print(Ha);
     
 }   
}
