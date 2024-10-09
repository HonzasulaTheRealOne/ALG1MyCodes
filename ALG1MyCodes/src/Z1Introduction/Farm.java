/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Z1Introduction;

/**
 *
 * @author Pavla_2
 */
public class Farm {
    public static void main(String[] args) {
            
        // 3
        
        int pocetKraliku = 13;
        int pocetHus  = 3;
        
        int pocetZvirat = (pocetKraliku + pocetHus );
        int pocetNohou = (pocetKraliku * 4 + pocetHus  * 2);
        
        String sentence = "Na farmě je " + pocetZvirat + " zvířat, a mají " + pocetNohou + " nohou" ;
        System.out.println(sentence);
        
    }
}
