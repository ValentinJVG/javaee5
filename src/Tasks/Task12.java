package Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String string = scanner.nextLine();
        int spaces = (string.length()) - string.replaceAll(" ", "").length();
        float percentInString = (float)(spaces * 100f) / string.length() ;
        System.out.println("String length is " + string.length());
        System.out.println("Amount of spaces is " + spaces);
        System.out.println("Per cent of spaces" + percentInString + "%");

    }
}
