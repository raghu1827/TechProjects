import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        // Declare two variables
        int num1;
        int num2;

        // Creating Scanner object
        Scanner scan = new Scanner(System.in);

        // Taking userinput

        // Entering first number
        System.out.println("Enter the First number");
        num1 = scan.nextInt();

        // Entering second number
        System.out.println("Enter the Second number");
        num2 = scan.nextInt();

        // Declaring variable
        char operator;

        // Taking userinput for selecting operator
        System.out.println("Select the operator (+,-,*,/):");
        operator = scan.next().charAt(0);

        // Initialize variable to store values
        double result = 0;

        // Switch statement
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':

                // Checking is num2 is zero or not
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error!,Divisible by zero");
                }
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }

        // Printing the result
        System.out.println("Result: " + result);

        // Closing scan object
        scan.close();
    }
}
