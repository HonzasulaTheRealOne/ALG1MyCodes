/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Z1Introduction;

/**
 *
 * @author Pavla_2
 */
public class Sentence {
    public static void main(String[] args) {
            
        //String name = scanner.nextLine();
        String name = "Tomáš";
        int year = 2014;
        String SchoolClass = ".B";
        final int CURRENT_YEAR = 2024;
        
        int age = CURRENT_YEAR - year;
        int classs = age - 6;
        
        String sentence = "Dítě " + name + " má " + age + " let a chodí do " + classs +SchoolClass;
        
        System.out.println(sentence);
        
        
    }
}
