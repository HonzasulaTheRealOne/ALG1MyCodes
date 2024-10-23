/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CV4;

import java.util.Scanner;

/**
 *
 * @author Pavla_2
 */
public class FirstIdk {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean isIt = true;
        int inputCislo = scanner.nextInt();
        
        for (int i = (inputCislo-1); i > 1; i--){
            
            if (inputCislo % i == 0){
                System.out.println(i);
                isIt = false;
                break;
            }
            else {

        }
        }
        if (isIt){
        System.out.println("Je prvočíslo");}
        
        else{
                        System.out.println("Není prvočíslo");

                }
        
    }
}
