package se.lexicon;

import java.util.Scanner;

public class Converter {

    public static void showMenu() {
        System.out.println("Currency Converter:");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to Euro");
        System.out.println("4. Convert Euro to SEK");
        System.out.println("5. Exit");
    }


    public static void runConvertor() {
        while (true) {
            showMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose from the above options:");
            int input = scanner.nextInt();

            if (input == 5) {
                break;
            }
            else if (input > 5 || input < 1) {
                System.out.println("Invalid input");
                break;
            }

            double amount = getAmount("Please enter the amount you would like to convert: ");

            double result = value(input , amount);
            System.out.println("Amount converted: " + result);
        }
    }

    public static double value(int input, double amount) {
        return switch (input) {
            case 1 -> amount * 0.01;
            case 2 -> amount * 0.02;
            case 3 -> amount * 0.03;
            case 4 -> amount * 0.04;
            default -> amount;
        };
    }

    public static double getAmount(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        double amount = scanner.nextDouble();
        return amount;
    }
}









