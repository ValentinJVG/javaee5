package Tasks;

import java.util.Scanner;
import java.util.Arrays;

public class Task15_ToDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 numbers: ");

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
                }
            System.out.println(Arrays.toString(numbers));


        }
    }


