
package laboration1;

import java.util.Scanner;
import Shapes.Circle;
import Shapes.Square;
import Shapes.Triangle;
        
public class Laboration1 {
 
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Räkna ut arean för din:");
        System.out.println("1. Cirkel");
        System.out.println("2. Triangel");
        System.out.println("3. Fyrkant");
        
        int choice = scnr.nextInt();
        switch (choice) {
            case 1:
                
            case 2:
                
            case 3:
                
            default:
                System.out.println("Felaktigt val!");
                break;
        }
        
        
    }

}
