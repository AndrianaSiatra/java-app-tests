package com.intasoft.stsc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String number1 = insertNumber();
        String number2 = insertNumber();
        System.out.println("Number 1 is:" + number1);
        System.out.println("Number 2 is:" + number2);
        //System.out.println(checkNumber(number1));
        //System.out.println(checkNumber(number2));
        System.out.println("Average is:" + getAverage(number1, number2));
    }

    public static String insertNumber() {
        Scanner scanner = new Scanner(System.in);
        String number;
        do {
            System.out.println("Insert a number: ");
            number = scanner.nextLine();
            if (!checkValid(number)) {
                System.out.println("Invalid number");
            }
        } while (!checkValid(number));

        return number;
    }


    public static double getAverage(String number1, String number2) {

        return (Double.parseDouble(number1) + Double.parseDouble(number2)) / 2;
        //System.out.println("Average is:"+ average);

    }

    public static Boolean checkNumber(String number) {
        try {
            Double.parseDouble(number);
        } catch (NumberFormatException nfe) {
            return false;
        }
        if (checkNegativeOrZero(number))
            return true;
        else
            return false;
    }

    public static Boolean checkValid(String number) {
        return checkNumber(number) && checkNumberIfIsEmpty(number);
    }

    public static Boolean checkNumberIfIsEmpty(String number) {

        if (number.isEmpty())
            return false;
        else
            return true;
    }

    public static Boolean checkNegativeOrZero(String number) {
        if (Double.parseDouble(number) <= 0)
            return false;
        else
            return true;
    }

}
