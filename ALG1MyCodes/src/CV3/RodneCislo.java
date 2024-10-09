/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CV3;

import java.util.Scanner;

/**
 *
 * @author Pavla_2
 */
public class RodneCislo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadejte první část rodného čísla: ");
        int prvniCast = scanner.nextInt();

        System.out.print("Zadejte druhou část rodného čísla: ");
        int druhaCast = scanner.nextInt();

        String rodneCislo = String.join("",String.valueOf(prvniCast), String.valueOf((druhaCast)));
        System.out.print(rodneCislo +"\n");
        
        boolean jePlatne = true;
        if (rodneCislo.length() != 10){
        jePlatne = false;
        System.out.print("Rodné číslo musí mít přesně 10 znaků");
        
        }
        String prvnichDevet = rodneCislo.substring(0, 9);
        String posledniCislo = rodneCislo.substring(9);
        System.out.print(prvnichDevet +"\n");
        System.out.print(posledniCislo +"\n");

        int zbytek;
        if(jePlatne){
            if((Integer.valueOf(prvnichDevet) % 11 == 10) && (Integer.valueOf(posledniCislo) == 0)){
                System.out.println("Zadané rodné číslo " + prvniCast + "/" + druhaCast + " je platné");
        }
            else if (Integer.valueOf(prvnichDevet) % 11 != 10){
            zbytek = Integer.valueOf(prvnichDevet) % 11 ;
            if (Integer.valueOf(posledniCislo) == zbytek){
            System.out.println("Zadané rodné číslo " + prvniCast + "/" + druhaCast + " je platné");
            }
            else {
            System.out.println("Zadané rodné číslo " + prvniCast + "/" + druhaCast + " je neplatné");
            }
                    
            }
            else {
            System.out.println("Zadané rodné číslo " + prvniCast + "/" + druhaCast + " je neplatné");
            }
        }
        
        
    }
}
