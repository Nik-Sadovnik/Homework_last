
import java.util.Random;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blackfire
 */
public class Flow_control_5 {
    public static void main(String[] args){

        Random rand = new Random(); 
        int R = rand.nextInt(2) + 1;

        System.out.println("This is Rock, Paper, Scissors, Introduce:" + "\n" + "1)Rock" + "\n" + "2)Paper" + "\n" + "3)Scissors");
        
        Scanner scan = new Scanner(System.in);
        int P = scan.nextInt();
       

       if(R<2 && P<2)  {System.out.println("Tie: Rock vs Rock");}
       if(R<2 && P>1 && P<3)  {System.out.println("Player wins: Rock vs Paper");}
       if(R<2 && P>2)  {System.out.println("Com wins: Rock vs Scissors ");}
       
       if(R<3 && R>1 && P<2)  {System.out.println("Com wins: Paper vs Rock");}
       if(R<3 && R>1 && P>1 && P<3)  {System.out.println("Tie: Paper vs Paper");}
       if(R<3 && R>1 && P>2)  {System.out.println("Player wins: Paper vs Scissors");}
       
       if(R>2 && P<2)  {System.out.println("Player wins: Scissors vs Rock");}
       if(R>2 && P>2)  {System.out.println("Tie: Scissors vs Scissors");}
       if(R>2 && P>1 && P<3)  {System.out.println("Com wins: Scissors vs Paper");}
    
    System.out.println("PC took   " + R);
    }
}

