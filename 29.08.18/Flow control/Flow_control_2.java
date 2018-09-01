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

public class Flow_control_2 {
    public static void main(String[] args){
        System.out.println("Introduce first number...");
        
              Scanner scan1 = new Scanner(System.in);
        int N1 = scan1.nextInt();
        
        System.out.println("Introduce second number...");
        
              Scanner scan2 = new Scanner(System.in);
        int N2 = scan2.nextInt();
        
        System.out.println("Introduce third number...");
        
              Scanner scan3 = new Scanner(System.in);
        int N3 = scan3.nextInt();
        
        if(N1>N2) {
            if(N2>N3){ System.out.println("Numbers ascending order is " + N3 + " " + N2 + " " + N1);
                       System.out.println("Numbers descending order is " + N1 + " " + N2 + " " + N3);
            }else {System.out.println("Numbers ascending order is " + N1 + " " + N3 + " " + N2);
                   System.out.println("Numbers descending order is " + N2 + " " + N3 + " " + N1);
            }
        }else{ if(N1>N3){System.out.println("Numbers ascending order is " + N3 + " " + N1 + " " + N2);
                         System.out.println("Numbers descending order is " + N2 + " " + N1 + " " + N3);
                    }else{System.out.println("Numbers ascending order is " + N1 + " " + N2 + " " + N3);
                          System.out.println("Numbers descending order is " + N3 + " " + N2 + " " + N1);
        }
                
        }   
    }
}
