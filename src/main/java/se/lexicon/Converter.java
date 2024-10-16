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

    public static double getAmount(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        double amount = scanner.nextDouble();
        return amount;
    }





}







