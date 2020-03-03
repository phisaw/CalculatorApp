package com.company;

import java.util.Scanner;
import static com.company.Menu.choice;

public class Operations {

    static float sum = 0;
    static Float[] array = new Float[2];
    static Scanner input = new Scanner(System.in);

    public static void Scanner() {

        boolean correct = false;
        while (!correct){
            System.out.print("Ange första talet: ");
            String input1 = input.nextLine();
            try {
                array[0] = Float.parseFloat(input1);
                correct = true;

            } catch (Exception e) {
                System.out.println("Fel format.");
            }
         }
        correct = false;
        while (!correct){
            System.out.print("Ange andra talet: ");
            String input2 = input.nextLine();
            try {
                array[1] =Float.parseFloat(input2);
                correct = true;

            } catch (Exception e) {
                System.out.println("Fel format");
            }
        }
    }

    public static void additionMethod() {
        System.out.println("Du valde addition");
        CalcPrint();
    }

    public static void subtractionMethod() {
        System.out.println("Du valde subtraktion");
        CalcPrint();
    }

    public static void multiplicationMethod() {
        System.out.println("Du valde multiplikation");
        CalcPrint();
    }

    public static void divisionMethod() {
        System.out.println("Du valde division");
        CalcPrint();
    }

    public static void CalcPrint(){
        System.out.println();
        Scanner();

        switch (choice) {
            case "1":
                sum = (array[0]) + (array[1]);
                break;
            case "2":
                sum = (array[0]) - (array[1]);
                break;
            case "3":
                sum = (array[0]) * (array[1]);
                break;
            default:
                sum = (array[0]) / (array[1]);
                break;
        }

        System.out.println();
        System.out.println("Svaret blir: " + sum);
        System.out.println();
    }

    public static void exitApp() {
        System.out.println("Programmet avslutas");
        System.exit(0);
    }
}
