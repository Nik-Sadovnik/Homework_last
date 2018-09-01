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

public class Flow_control_3 {
    public static void main(String[] args){
        
        
        
     System.out.println("Introduce maximum talk minutes used");
        Scanner scan1 = new Scanner(System.in);
        int Tm = scan1.nextInt();
        
     System.out.println("Introduce maximum text messages sent");
        Scanner scan2 = new Scanner(System.in);
        int Te = scan2.nextInt();
        
     System.out.println("Introduce maximum gigabytes of data used");
        Scanner scan3 = new Scanner(System.in);
        int Gy = scan3.nextInt();
        
        if(Tm<500 && Te<1 && Gy<1){System.out.println("We advice you ''Plan A'' which is $49 per month");}
        if(Tm<500 && Te>0 && Gy<1){System.out.println("We advice you ''Plan B'' which is $55 per month");}
        if(Tm>500 && Te<100 && Gy<1){System.out.println("We advice you ''Plan C'' which is $61 per month");}   
        if(Tm>500 && Te>99 && Gy<1){System.out.println("We advice you ''Plan D'' which is $70 per month");}
        if(Tm!=0 && Te!=0 && Gy<2){System.out.println("We advice you ''Plan E'' which is $79 per month");}
        if(Tm!=0 && Te!=0 && Gy>2){System.out.println("We advice you ''Plan F'' which is $87 per month");}
        }}