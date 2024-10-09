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
public class SentenceFromUser {
    public static void main(String[] args) {
        
        
         Scanner scanner = new Scanner(System.in);
         String name = scanner.nextLine();
         int year = Integer.valueOf(scanner.nextLine());
         String SchoolClass = scanner.nextLine();    
         final int CURRENT_YEAR = 2024;

         
         
        int age = CURRENT_YEAR - year;
        int classs = age - 6;
         
        String sentence = "Dítě " + name + " má " + age + " let a chodí do " + classs +SchoolClass;
        System.out.println(sentence);
     
        
    }
}
