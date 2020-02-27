package com.company;

import java.util.Scanner;
import java.util.Vector;

public class Operations {

    static float sum = 0;

    static Vector<Float> array = new Vector<>();

    static Scanner input = new Scanner(System.in);

    public static void Scanner() {

        System.out.print("ange första talet: ");
        String input1 = input.nextLine();
        try {
            float float1 = Float.parseFloat(input1);
            array.add(0,float1);

        } catch (Exception e) {
            System.out.println("fel inmatning!");
            System.out.println("Programmet avslutas");
            System.exit(0);
        }

        System.out.print("ange andra talet: ");
        String input2 = input.nextLine();
        try {
            float float2 = Float.parseFloat(input2);
            array.add(1,float2);

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
        Scanner();

        sum = (array.get(0) + (array.get(1)));

        System.out.println("Svaret blir: " + sum);
        System.out.println();
        //print  vector
        //System.out.println("The Vector is: " + array);
    }

    public static void subtractionMethod() {
        System.out.println("Du valde subtraktion");
        System.out.println();
        Scanner();

        sum = (array.get(0) - (array.get(1)));
        System.out.println();
        System.out.println("Svaret blir: " + sum);
        System.out.println();
    }

    public static void muliplicationMethod() {
        System.out.println("Du valde multiplication");
        System.out.println();
        Scanner();

        sum = (array.get(0)*(array.get(1)));
        System.out.println();
        System.out.println("Svaret blir: " + sum);
        System.out.println();
    }

    public static void divisionMethod() {
        System.out.println("Du valde division");
        System.out.println();
        Scanner();

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
