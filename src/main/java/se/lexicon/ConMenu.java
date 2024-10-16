package se.lexicon;

import java.util.Scanner;

public class ConMenu {
    public Converter converter = new Converter();
    public Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        boolean isActive = true;
        while (isActive) {
            System.out.println("**Currency Converter**");
            System.out.println("choose one of the following operations");
            System.out.println("1.Sek to Usd");
            System.out.println("2.Usd to Sek");
            System.out.println("3.Sek to Euro");
            System.out.println("4.Euro to Sek");
            System.out.println("5.Exit");

            int userChoice = validChoice();
            switch (userChoice) {
                case 1:
                    converter.convert("sek", "USD", 0.09);
                    break;
                case 2:
                    converter.convert("USD", "Sek", 10.42);
                    break;
                case 3:
                    converter.convert("Sek", "Eur", 0.08);
                    break;
                case 4:
                    converter.convert("Euro", "Sek", 11.34);
                    break;
                case 5:
                    isActive = false;
                    System.out.println("Thank you!! bye bye..");
                    break;
                default:
                    System.out.println("invalid choice, enter a number between 1-5");
            }
        }
    }

    public int validChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid input between 1-5");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
