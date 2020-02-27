package com.company;

import java.util.Scanner;
import java.util.Vector;

public class Operations {

    float float1 = 0;
    float float2 = 0;
    static float sum = 0;

    static Vector<Float> array = new Vector<Float>(2);

    static Scanner input = new Scanner(System.in);

    public static void Scanner(String input1, String input2) {

        System.out.print("ange första talet: ");
        input1 = input.nextLine();
        try {
            float float1 = Float.parseFloat(input1);
            array.add(float1);

        } catch (Exception e) {
            System.out.println("fel inmatning!");
            System.out.println("Programmet avslutas");
            System.exit(0);
        }

        System.out.print("ange andra talet: ");
        input2 = input.nextLine();
        try {
            float float2 = Float.parseFloat(input2);
            array.add(float2);

        } catch (Exception e) {
            System.out.println("fel inmatning");
            System.out.println("Programmet avslutas");
            System.exit(0);
        }
//		System.out.println(float1);
//		System.out.println(float2);
//		System.out.println(array);

    }

    public static void additionMethod() {
        System.out.println("Du valde addition");
        System.out.println();
        Scanner(null, null);

        sum = (array.get(0) + (array.get(1)));

        System.out.println("Svaret blir: " + sum);

        //print  vector
        //System.out.println("The Vector is: " + array);
    }

    public static void subtractionMethod() {
        System.out.println("Du valde subtraktion");
        System.out.println();
        Scanner(null, null);

        sum = (array.get(0) - (array.get(1)));
        System.out.println();
        System.out.println("Svaret blir: " + sum);
        System.out.println();
    }

    public static void muliplicationMethod() {
        System.out.println("Du valde multiplication");
        System.out.println();
        Scanner(null, null);

        sum = (array.get(0) * (array.get(1)));
        System.out.println();
        System.out.println("Svaret blir: " + sum);
        System.out.println();
    }

    public static void divisionMethod() {
        System.out.println("Du valde division");
        System.out.println();
        Scanner(null, null);

        sum = (array.get(0) / (array.get(1)));
        System.out.println();
        System.out.println("Svaret blir: " + sum);
        System.out.println();
    }

    public static void exitApp() {
        System.out.println("Programmet avslutas");
        System.exit(0);
    }

}
