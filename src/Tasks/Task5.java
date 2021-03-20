// prime numbers
package Tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter positive number:");
        int input = scanner.nextInt();
        int i = 0;
        int num = 0;
        String primeNumbers = " ";
        for (i = 1; i <= input; i++)
        {
            int counter = 0;
            for(num = i; num >= 1; num--)
        {
            if(i % num == 0)
            {
                counter = counter + 1;
            }
        }
            if (counter == 2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers are:\n" + primeNumbers);

    }
}
