package CV3;
import java.util.Scanner;

/**
 *
 * @author Pavla_2
 */
public class Kruznice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Zadejte souřadnici x bodu: ");
        double xBod = scanner.nextDouble();
        System.out.print("Zadejte souřadnici y bodu: ");
        double yBod = scanner.nextDouble();
        System.out.print("Zadejte souřadnici x kružnice: ");
        double xStred = scanner.nextDouble();
        System.out.print("Zadejte souřadnici y kružnice: ");
        double yStred = scanner.nextDouble();
        System.out.print("Zadejte poloměr kružnice: ");
        double polomer = scanner.nextDouble();

        double vzdalenost = Math.sqrt(Math.pow(xBod - xStred, 2) + Math.pow(yBod - yStred, 2));

        if (vzdalenost < polomer) {
            System.out.println("Bod je uvnitř kružnice.");
        } else if (vzdalenost == polomer) {
            System.out.println("Bod leží na kružnici.");
        } else {
            System.out.println("Bod je mimo kružnici.");
        }
    }
}
