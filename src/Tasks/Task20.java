// game
package Tasks;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = (int) (1 + (100 * Math.random()));

        System.out.println("Enter the number:");
        int guess = 0;

        while (guess != number) {

            guess = scanner.nextInt();
            if (number == guess) {
                System.out.println("Congratulations!");
            } else if (number < guess) {
                System.out.println("Too much");
            } else {
                System.out.println("Not enough");
            }
        }





    }
}