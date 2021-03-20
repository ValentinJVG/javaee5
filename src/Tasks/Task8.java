//Calculator
package Tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        float firstNumber = scanner.nextFloat();

        System.out.println("Please enter one of the operators: +, -, /, *");
        String operator = scanner.next();

        System.out.println("Please enter second number:");
        float secondNumber = scanner.nextFloat();

        switch (operator) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            default:
                System.out.println("Invalid symbol");
                break;

        }


    }
}
