import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.println("Type: +, -, *, or / to add, subtract, multiply, or divide.");
        String opperator = inputs.nextLine();
        
        System.out.print("First Number: ");
        double firstNumber = inputs.nextDouble();
        System.out.print("Second Number: ");
        double secondNumber = inputs.nextDouble();

        if (opperator.contains("+") == true) {
            double lastNumber = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + lastNumber);
            System.out.println("The answer is " + lastNumber);
        }

        else if (opperator.contains("-") == true) {
            double lastNumber = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + lastNumber);
            System.out.println("The answer is " + lastNumber);
        }

        else if (opperator.contains("*") == true) {
            double lastNumber = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + lastNumber);
            System.out.println("The answer is " + lastNumber);
        }

        else if (opperator.contains("/") == true) {
            double lastNumber = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + lastNumber);
            System.out.println("The answer is " + lastNumber);
        }

    }
}
