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
public class ToSeconds {
    public static void main(String[] args) {
         // To seconds
         
         //vstup
         Scanner scanner = new Scanner(System.in);

         int seconds = Integer.valueOf(scanner.nextLine());
         int minutes = Integer.valueOf(scanner.nextLine());
         int hours = Integer.valueOf(scanner.nextLine());
         
         int time = (seconds + minutes * 60 + hours * 3600);
         
         System.out.println("Celkový počet je : " + time + " sekund");
         
         /*
         
         int seconds = Integer.valueOf(args[0]);
         int minutes = Integer.valueOf(args[1]);
         int hours = Integer.valueOf(args[2]);
         
         int time = (seconds + minutes * 60 + hours * 3600);
         
         System.out.println("Celkový počet je : " + time + " sekund");
         
         //////////////////////
         
         int seconds = 1;
         int minutes = 24;
         int hours = 56;
         
         int time = (seconds + minutes * 60 + hours * 3600);
         
         System.out.println("Celkový počet je : " + time + " sekund");
         
         
         */
    }
}
