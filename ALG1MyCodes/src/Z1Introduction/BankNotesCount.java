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
public class BankNotesCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = Integer.valueOf(scanner.nextLine());
        int stoBankovka = 0;
        int padesatKoruna = 0;
        int dvacetKoruna = 0;
        int desetKoruna = 0;
        int petKoruna = 0;
        int dvouKoruna = 0;
        int jednoKoruna = 0;
        
        
        
        while(money > 0){
        if (money > 100){
            money -= 100;
            stoBankovka++;
        
        }
        else if (money >= 50){
            money -= 50;
            padesatKoruna++;
        
        }
        else if (money >= 20){
            money -= 20;
            dvacetKoruna++;
        
        }
        else if (money > 10){
            money -= 10;
            desetKoruna++;
        
        }
        else if (money > 5){
            money -= 5;
            petKoruna++;
        
        }
        else if (money > 2){
            money -= 2;
            dvouKoruna++;
        
        }
        else if (money > 1){
            money -= 1;
            jednoKoruna++;
        
        }
        
        
        }
        
        System.out.println("Bankomat vrátí :" + stoBankovka + "stokorun, " + padesatKoruna + "padesatikorun, " + dvacetKoruna + "dvacetikorun" + desetKoruna + "desetikorun" + petKoruna + "pětikorun" + dvouKoruna + "dvoukorun" + jednoKoruna + "");
        
        
    }
}
