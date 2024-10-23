/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CV6;

import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author Pavla_2
 */
public class HadaniCisla {
    public static Scanner sc = new Scanner(System.in);
    public static int min = 1;
    public static int max = 100;
    
    public static void main(String[] args) {
        boolean end = false;
        int answer;
        do{
            displayMenu(); 
            answer = Choose();
            switch (answer) {
                case 1:  changeRange(); break;              
                case 2:  pcPlays();break;         
                case 3:  userPlays();break;
                case 0: end = true; System.out.println("Konec");break;
                default:
                    System.out.println("Špatná volba");
            }
        }while(!end);
    }
    
    public static void displayMenu(){
        System.out.println("Vyber volbu (0-3): ");        
        System.out.println("(1.) Zmen rozsah");        
        System.out.println("(2.) Pocitac hada");        
        System.out.println("(3.) Uzivatel hada");        
        System.out.println("(0) Konec");
    }
    public static int Choose(){
        int a = sc.nextInt();
        return a;
    }
    private static void pcPlays(){
        System.out.println("Mysli si cislo od " + min + " do " + max);
        int lower = min;
        int upper = max;
        int middle;
        int answer;
        boolean found = false;
        do{
        middle = (lower + upper) / 2;
        System.out.println("Myslel jsi si " + middle);
        System.out.println("Odpovez: 0 - pokud je to myslene cislo");        
        System.out.println("Odpovez: 1 - myslene cislo je vetsi");        
        System.out.println("Odpovez: 2 - myslene cislo je mensi");
        answer = Choose();
        switch(answer){
            case 0: System.out.println("Uhodl jsem"); found = true; break;            
            case 1: lower = middle + 1; break;            
            case 2: upper = middle - 1; break;
        }
        }while(!found && lower <= upper);

    }
    private static void userPlays(){
        Random random = new Random();
        int rand = random.nextInt((max - min + 1) + min);
        System.out.println(rand);
        }
    private static void changeRange(){
    }
    
}


