package se.lexicon;

import java.util.Scanner;

public class Converter {

    public static void showMenu() {
        DateTime.localTime();
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

            if (input >= 1 && input < 5) {
                double amount = getAmount("Please enter the amount you would like to convert: ");
                performOperation(input, amount);
            } else if(input == 5){
                break;
            } else {
                System.out.println("You have entered an invalid input");
            }
        }
    }

    public static void performOperation(int input, double amount) {
        switch (input) {
            case 1:
                System.out.println("Result (SEK to USD): " + Operation.convertSekToUsd(amount));
                break;
            case 2:
                System.out.println("Result (USD to SEK): " + Operation.convertUsdToSek(amount));
                break;
            case 3:
                System.out.println("Result (SEK to EURO): " + Operation.convertSekToEuro(amount));
                break;
            case 4:
                System.out.println("Result (EURO to SEK): " + Operation.convertEuroToSek(amount));
                break;
        }
    }

    public static double getAmount(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        double amount = scanner.nextDouble();
        return amount;
    }
}









