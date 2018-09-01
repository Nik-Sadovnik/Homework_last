/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blackfire
 */
public class Flow_control_7 {
    public static void main(String[] args){
        int Mp = 121000000;
        int Ap = 315000000;
        
        double Mper = 1.01;
        double Aper = 0.15;
        
        int PMp=0;
        int PAp=0;
        
        int Year = 0;
       while(Ap>Mp) {
           PMp = (int) (Mp/100*1.01);
           Mp = Mp+PMp;
           
           PAp = (int) (Ap/100*0.15);
           Ap = Ap-PAp;

            Year = Year+1;    
       
       System.out.println("Population of Mexico is: " + Mp );
       System.out.println("Population of United S. is: " + Ap);
       System.out.println("Today is year: " + Year);
       } 
        System.out.println("The population of Mexico exceeds than of the United states");
    }
}
