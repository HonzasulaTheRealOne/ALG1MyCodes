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
public class PrestupnyRok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadejte rok který chcete určit: ");
        int Rok = scanner.nextInt();
        
        
        
        
        if(((Rok % 400) == 0)){
                System.out.print("Zadaný rok " + Rok + " je přestupný rok, obsahuje 366 dnů.");

        }
        else if(((Rok % 100) == 0)){
                System.out.print("Zadaný rok " + Rok + " není přestupný rok, obsahuje 365 dnů.");
                
        }
        else if((Rok % 4) == 0){
                System.out.print("Zadaný rok " + Rok + " je přestupný rok, obsahuje 366 dnů.");

        }
        else{
                System.out.print("Zadaný rok " + Rok + " není přestupný rok, obsahuje 365 dnů.");

        }
        
        
    }
}
