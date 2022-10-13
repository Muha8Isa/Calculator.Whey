package se.lexicon;

import java.util.Scanner;

// This is the main calculator app to run!
public class Calculator {
    public static void main(String[] args) {
        calc.main();

        Scanner whey = new Scanner(System.in);
        while(true) {
            System.out.println("To continue calculating, press Y. Otherwise to stop, press N ");
            String continueOperation = whey.next();
            if (continueOperation.equalsIgnoreCase("N")) {
                System.out.println("Goodbye!");
                break; }
            else if (continueOperation.equalsIgnoreCase("Y")) calc.main();
            else System.out.println("Enter a valid character");
        }
    }
}
