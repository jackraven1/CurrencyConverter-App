package se.lexicon;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Converter {
    public Scanner scanner = new Scanner(System.in);

    public void convert(String fromC, String toC, double exRate) {
        double amount = validAmount(fromC);
        double conAmount = amount * exRate;

        DecimalFormat format = new DecimalFormat("#.##");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(amount + " " + fromC + " = " + format.format(conAmount) + " " + toC);
        System.out.println("Done at : " + dateTime);
    }

    public double validAmount(String fromC) {
        System.out.println("please enter the amount in " + fromC + ":");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error..please enter a valid amount");
            scanner.next();
        }
        double amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Value you should be positive number only ");
            return validAmount(fromC);
        }
        return amount;
    }
}
