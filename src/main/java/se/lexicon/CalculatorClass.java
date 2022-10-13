package se.lexicon;

public class CalculatorClass {
    public static double addition(double number1, double number2) {
        return number1 + number2;
    }

    public static double substraction(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    public static double division(double number1, double number2) {
        return number1 / number2;
    }

    public static void displayMenu() {
        System.out.println("Welcome to my first Java application: Calculator Whey");
        System.out.println("+ . Addition");
        System.out.println("- . Subtraction");
        System.out.println("* . Multiplication");
        System.out.println("/ . Division");
        System.out.println("______________________");
    }
}
