//quadratic equation
package Tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            System.out.println("Delta is negative");
            return;
        }
        double firstX = (-b - Math.sqrt(delta)) / 2 * a;
        double secondX = (-b + Math.sqrt(delta)) / 2 * a;

        System.out.println(firstX);
        System.out.println(secondX);




        }
    }

