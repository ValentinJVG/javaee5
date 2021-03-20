//Harmonic numbers

package Tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter positive number: ");
        int number = scanner.nextInt();
        System.out.println("Sum is "+ sum(number));


    }
    static double sum (int harmonicNumbers) {
        double i;
        double s = 0.0d;
        for (i = 1; i <= harmonicNumbers; i++)
            s = s + 1 / i;
        return s;
    }

}
