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

public class Data_Types_6 {
    public static void main(String[] args){
      System.out.println("Introduce a Noun...");
        Scanner keyboard = new Scanner(System.in);
        String noun = keyboard.nextLine();
      System.out.println("Introduce a Verb in past continous...");
        Scanner keyboard2 = new Scanner(System.in);
        String verb = keyboard2.nextLine();
      System.out.println("Introduce second Noun(place) ...");
        Scanner keyboard3 = new Scanner(System.in);
        String noun2 = keyboard3.nextLine();
      System.out.println("Introduce Adjective for first Noun...");
        Scanner keyboard4 = new Scanner(System.in);
        String adj1 = keyboard4.nextLine();
      System.out.println("Introduce Adjective for second Noun...");
        Scanner keyboard5 = new Scanner(System.in);
        String adj2 = keyboard5.nextLine();
        
        System.out.println("Now you will see the fairy tale");
        
        
        System.out.print("\n" + "Once upon a time, there was a knight. He decided to go to the " + adj2 + " " + noun2 +
                         ". The brave man wanted to find the " + adj1 + " " + noun  + "\n" +  
                         ". In his road he met a woman that " + verb + 
                           " but he didn't payed any attention to that." + 
                           " After he finded what he wanted, the knight in bright armor took " + noun + " with him, went home and drinked a tasty beer.." + "\n" + "The end.");
    }
}
