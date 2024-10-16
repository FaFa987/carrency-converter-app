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
        System.out.println("Choose one of the options:");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Enter currency symbol:");
                String currency = sc.next();
                break;
            case 2:
                System.out.println("Enter currency symbol:");
                String currency2 = sc.next();
                break;
            case 3:
                System.out.println("Enter currency symbol:");
                String currency3 = sc.next();
                break;
            case 4:
                System.out.println("Enter currency symbol:");
                String currency4 = sc.next();
                break;
            case 5:
                System.exit(0);
            default:

        }
    }

}
