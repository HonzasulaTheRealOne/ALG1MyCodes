/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Z1Introduction;

/**
 *
 * @author Pavla_2
 */
public class SentenceFromArg {
    public static void main(String[] args) {
            
         // 4
        
         String name = args[0];
         int year = Integer.valueOf(args[1]);
         String SchoolClass = args[2];   
         final int CURRENT_YEAR = 2024;

                 
                 
        int age = CURRENT_YEAR - year;
        int classs = age - 6;
        
        
        String sentence = "Dítě " + name + " má " + age + " let a chodí do " + classs +SchoolClass;
        
        System.out.println(sentence);
        
    }
}
