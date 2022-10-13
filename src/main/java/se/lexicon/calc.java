package se.lexicon;

import java.util.Scanner;

import static se.lexicon.CalculatorClass.*;

public class calc {
    public static void main() {
        Scanner whey = new Scanner(System.in);

        //boolean Condition = true;
        while (true) {
            CalculatorClass.displayMenu();
            System.out.print("Input the first number: ");
            double x = whey.nextDouble();
            System.out.print("Input the second number: ");
            double y = whey.nextDouble();
            System.out.println("Select operation type: [+, -, *, /]");

            System.out.println("Enter Operation Type (+ , - , * , /)");
            char operationType = whey.next().charAt(0);

            switch (operationType) {

                case '*':
                    System.out.println("The product is = " + multiplication(x, y));
                    break;
                case '/':
                    System.out.println("The quotient is = " + division(x, y));
                    break;
                case '+':
                    System.out.println("The sum is = " + addition(x, y));
                    break;
                case '-':
                    System.out.println("The difference is = " + substraction(x, y));
                    break;
                default:
                    System.out.println("\n Please select a valid operation character");
            }
            break;
        }

        }
    }
