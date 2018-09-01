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

public class Flow_control_1 {
    public static void main(String[] args){
        System.out.println("Introduce a number to see if it's odd or even");
        
                Scanner scan = new Scanner(System.in);
                int N = scan.nextInt();
        if (N % 2 == 0) {
                System.out.println("That's an Even number...");
        }    else {System.out.println("That's an Odd number..");
        
        }                
    }
}
