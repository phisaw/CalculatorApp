package com.company;

import java.util.Scanner;
import java.util.Vector;

public class Operations {

    static float sum = 0;
    static Float[] array = new Float[2];
    static Scanner input = new Scanner(System.in);

    public static void Scanner() {

        boolean correct = false;
        while (!correct){
            System.out.print("ange första talet: ");
            String input1 = input.nextLine();
            try {

                array[0] = Float.parseFloat(input1);

                correct = true;

            } catch (Exception e) {
                System.out.println("fel inmatningsformat.");
            }
         }



        correct = false;
        while (!correct){
            System.out.print("ange andra talet: ");
            String input2 = input.nextLine();
            try {
                array[1] =Float.parseFloat(input2);

                correct = true;

            } catch (Exception e) {
                System.out.println("Fel inmatningsformat");
            }
        }
    }
    public static void additionMethod() {
        System.out.println("Du valde addition");
        System.out.println();
        Scanner();

        sum = array[0] + (array[1]);
        //sum = (array.get(0) + (array.get(1)));
        System.out.println();
        System.out.println("Svaret blir: " + sum);
        System.out.println();
    }

    public static void subtractionMethod() {
        System.out.println("Du valde subtraktion");
        System.out.println();
        Scanner();

        sum = array[0] - (array[1]);
        //sum = (array.get(0) - (array.get(1)));
        System.out.println();
        System.out.println("Svaret blir: " + sum);
        System.out.println();
    }

    public static void multiplicationMethod() {
        System.out.println("Du valde multiplication");
        System.out.println();
        Scanner();

        sum = array[0] * (array[1]);
        //sum = (array.get(0)*(array.get(1)));
        System.out.println();
        System.out.println("Svaret blir: " + sum);
        System.out.println();
    }

    public static void divisionMethod() {
        System.out.println("Du valde division");
        System.out.println();
        Scanner();

        sum = array[0] / (array[1]);
        //sum = (array.get(0) / (array.get(1)));
        System.out.println();
        System.out.println("Svaret blir: " + sum);
        System.out.println();
    }

    public static void exitApp() {
        System.out.println("Programmet avslutas");
        System.exit(0);
    }
}
