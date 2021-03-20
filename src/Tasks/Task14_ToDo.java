package Tasks;

import java.util.Scanner;

public class Task14_ToDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first letter: ");
        char firstLetter = charAt (scanner.nextLine());

        System.out.println("Please enter second letter");
        char secondLetter = charAt (scanner.nextLine());



        if (firstLetter < secondLetter){
            secondLetter = firstLetter;}

        for (char i = firstLetter; i <= secondLetter; i ++){
            System.out.println(i);}
    }

    private static char charAt(String nextLine) {
        return 0;
    }
}
