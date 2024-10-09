/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Z1Introduction;

import java.util.Scanner;

/**
 *
 * @author Pavla_2
 */
public class FarmFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
         
         int pocetKraliku = Integer.valueOf(scanner.nextLine());
         int pocetHus = Integer.valueOf(scanner.nextLine());
         
          int pocetZvirat = (pocetKraliku + pocetHus );
        int pocetNohou = (pocetKraliku * 4 + pocetHus  * 2);
        
        String sentence = "Na farmě je " + pocetZvirat + " zvířat, a mají " + pocetNohou + " nohou" ;
        System.out.println(sentence);


     
        
    }
}
