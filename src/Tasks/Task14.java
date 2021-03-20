package Tasks;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first letter: ");
        char firstLetter = scanner.next().toLowerCase().charAt(0);

        System.out.println("Please enter second letter: ");
        char secondLetter = scanner.next().toLowerCase().charAt(0);

        System.out.println(Math.abs(Character.toLowerCase(firstLetter)-Character.toLowerCase(secondLetter)));
    }
}
