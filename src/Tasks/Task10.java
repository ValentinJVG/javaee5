// calculates sum of the digits of given numbers
package Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            long input = scanner.nextLong();
            System.out.println(sumDigits(input));
        }

        public static int sumDigits(long n) {
            int sum = 0;
            while (n != 0) {
                sum = (int) (sum + n % 10);
                n = n / 10;
            }
            return sum;
        }
    }




