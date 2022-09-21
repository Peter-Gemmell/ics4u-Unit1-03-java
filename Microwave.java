/*
*  Program makes rock paper scissor
*
* @author  Peter Gemmell
* @version 1.0
* @since 2022-9-16
*/

// Imports the scanner class
import java.util.Scanner;
/**
* Calculates the amount of time required to heat up certain food.
*/
final class Microwave {
    /**
    * Constant for the time sub takes.
    */
    public static final double SUB_TIME = 60;
    /**
    * Constant for the time pizza takes.
    */
    public static final double PIZZA_TIME = 45;
    /**
    * Constant for the time soup takes.
    */
    public static final double SOUP_TIME = 105;
    /**
    * Constant for magic number 1.
    */
    public static final double AMOUNT_ONE = 1;
    /**
    * Constant for magic number 2.
    */
    public static final double AMOUNT_TWO = 2;
    /**
    * Constant for magic number 3.
    */
    public static final double AMOUNT_THREE = 3;
    /**
    * Constant for amount multiplier for amount 1.
    */
    public static final double AMOUNT_MULTIPLIER_1 = 1.0;
    /**
    * Constant for amount multiplier for amount 2.
    */
    public static final double AMOUNT_MULTIPLIER_2 = 1.5;
    /**
    * Constant for amount multiplier for amount 3.
    */
    public static final double AMOUNT_MULTIPLIER_3 = 2;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Microwave() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Input and scanner
        final Scanner myObj = new Scanner(System.in);
        double time = 1.0;
        double percent = 1.0;
        try {
            System.out.println("What are you heating?(sub, pizza or soup): ");
            final String foodType = myObj.next();
            try {
                System.out.println("How many of that " + foodType
                    + " item are you putting in? : ");
                final double foodAmount = myObj.nextDouble();
                // Process
                if ("sub".equals(foodType)) {
                    time = SUB_TIME;
                } else if ("pizza".equals(foodType)) {
                    time = PIZZA_TIME;
                } else if ("soup".equals(foodType)) {
                    time = SOUP_TIME;
                }
                if (foodAmount == AMOUNT_ONE) {
                    percent = AMOUNT_MULTIPLIER_1;
                } else if (foodAmount == AMOUNT_TWO) {
                    percent = AMOUNT_MULTIPLIER_2;
                } else if (foodAmount == AMOUNT_THREE) {
                    percent = AMOUNT_MULTIPLIER_3;
                }

                if (time > 1 & percent >= 1) {
                final double finaltime = time * percent;
                // Output
                System.out.println("The time in the microwave is " + finaltime
                    + " seconds");
                System.out.println("\nDone.");
                } else { 
                     System.out.println("Input wrong");
                }
            } catch (java.util.InputMismatchException error) {
                System.out.println("Invalid number");
            }
        } catch (java.util.InputMismatchException error) {
            System.out.println("Invalid food type");
        }
    }
}
