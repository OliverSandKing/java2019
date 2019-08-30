package laboration1;

import java.util.Scanner;
import Shapes.Circle;
import Shapes.Square;
import Shapes.Triangle;

public class Laboration1 {

    static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {

        boolean exit = false;
        int choice;

        do {
            System.out.println("\n-----------------------");
            System.out.println("Räkna ut arean för din:");
            System.out.println("1. Cirkel");
            System.out.println("2. Triangel");
            System.out.println("3. Fyrkant");
            System.out.println("0. Avsluta");

            choice = scnr.nextInt();
            switch (choice) {
                case 1:
                    createCircle();
                    break;
                case 2:
                    createTriangle();
                    break;
                case 3:
                    createSquare();
                    break;
                case 0:
                    System.out.println("Programmet avslutas");
                    exit = true;
                    break;
                default:
                    System.out.println("Felaktigt val!");
                    break;
            }
        } while (exit == false);

    }

    private static void createSquare() {
        System.out.print("Ange höjd: ");
        double height = scnr.nextDouble();
        System.out.print("Ange längd: ");
        double length = scnr.nextDouble();
        Square square = new Square(height, length);

        System.out.println("1. Visa Area");
        System.out.println("2. Visa Omkrets");
        System.out.println("3. Visa Area och Omkrets");
        int choice = scnr.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Arean är: " + square.area() + " cm");
                break;
            case 2:
                System.out.println("Omkretsen är: " + square.circumference() + " cm");
                break;
            case 3:
                System.out.println("Arean är: " + square.area() + " cm");
                System.out.println("Omkretsen är: " + square.circumference() + " cm");
                break;
        }
    }

    private static void createTriangle() {

        while (true) {
            System.out.println("Ange de tre sidornas längd:");
            double sideA = scnr.nextDouble();
            double sideB = scnr.nextDouble();
            double sideC = scnr.nextDouble();
            Triangle triangle = new Triangle(sideA, sideB, sideC);
            if (triangle.correct()) {
                System.out.println("1. Visa Area");
                System.out.println("2. Visa Omkrets");
                System.out.println("3. Visa Area och Omkrets");
                int choice = scnr.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Arean är: " + triangle.area() + " cm");
                        break;
                    case 2:
                        System.out.println("Omkretsen är: " + triangle.circumference() + " cm");
                        break;
                    case 3:
                        System.out.println("Arean är: " + triangle.area() + " cm");
                        System.out.println("Omkretsen är: " + triangle.circumference() + " cm");
                        break;
                }
                break;
            } else {
                System.out.println("Du angav fel värden, försök igen.");
            }
        }

    }

    private static void createCircle() {
        System.out.print("Ange radie: ");
        double radie = scnr.nextDouble();
        Circle circle = new Circle(radie);

        System.out.println("1. Visa Area");
        System.out.println("2. Visa Omkrets");
        System.out.println("3. Visa Area och Omkrets");
        int choice = scnr.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Arean är: " + circle.area() + " cm");
                break;
            case 2:
                System.out.println("Omkretsen är: " + circle.circumference() + " cm");
                break;
            case 3:
                System.out.println("Arean är: " + circle.area() + " cm");
                System.out.println("Omkretsen är: " + circle.circumference() + " cm");
                break;
        }
    }

}
