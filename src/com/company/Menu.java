package com.company;
import java.util.Scanner;

public class Menu {

    static String choice = "";
    Scanner scan = new Scanner(System.in);

    void switchCase() {

        while (true) {
            System.out.println("vad vill du göra?");
            System.out.println("1. Addera");
            System.out.println("2. Subtrahera");
            System.out.println("3. Multiplicera");
            System.out.println("4. Dividera");
            System.out.println("5. Avsluta");
            System.out.println();
            System.out.print("Ange ditt val:");

            choice = scan.nextLine();

            switch (choice) {

                case "1":
                    Operations.additionMethod();
                    break;

                case "2":
                    Operations.subtractionMethod();
                    break;

                case "3":
                    Operations.multiplicationMethod();
                    break;

                case "4":
                    Operations.divisionMethod();
                    break;

                case "5":
                    Operations.exitApp();
                    break;

                default:
                    System.out.println("Fel val, välj mellen 1-5");
                    System.out.println();
                    break;
            }
        }
    }
}