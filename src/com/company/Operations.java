package com.company;

import java.util.Scanner;
import static com.company.Menu.choice;

public class Operations {

    static float sum = 0;
    static Float[] array = new Float[2];
    static Scanner input = new Scanner(System.in);

    static void Scanner() {

        boolean correct = false;
        while (!correct){
            System.out.print("Ange första talet: ");
            String input1 = input.nextLine();
            try {
                array[0] = Float.parseFloat(input1);
                correct =true;

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

    static void Scanner2Test() {

        boolean correct = false;
        while (!correct){
            System.out.println("Ange dina tal: ");
            System.out.print("1# : ");
            String input1 = input.nextLine();
            System.out.print("2# : ");
            String input2 = input.nextLine();
            try {
                array[0] =Float.parseFloat(input1);
                array[1] =Float.parseFloat(input2);
                correct =true;

            } catch (Exception e) {
                System.out.println("Fel format.");
            }
        }
    }

    static void additionMethod() {
        System.out.println("Du valde addition");
        calcPrint();
    }

    static void subtractionMethod() {
        System.out.println("Du valde subtraktion");
        calcPrint();
    }

    static void multiplicationMethod() {
        System.out.println("Du valde multiplikation");
        calcPrint();
    }

    static void divisionMethod() {
        System.out.println("Du valde division");
        calcPrint();
    }

    static void calcPrint(){
        System.out.println();
        //Scanner();
        Scanner2Test();

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

    static void exitApp() {
        System.out.println("Programmet avslutas");
        System.exit(0);
    }
}