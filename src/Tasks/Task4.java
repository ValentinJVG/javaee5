// Fizz Buzz ( / 3 / 7)
package Tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++){
            if (i % 21 == 0)
                System.out.println("Fizz buzz" + " ");

                else if (i % 7 == 0)
                System.out.println("Buzz" + " ");

                else if  (i % 3 == 0 )
                System.out.println("Fizz" + " ");

                else
                    System.out.println(i);}

    }
}
