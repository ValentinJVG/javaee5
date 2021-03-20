// Calculating perimeter of the circle
package Tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float radius = scanner.nextFloat();
        float pi = (float) Math.PI;
        float diameterOfTheCircle = pi * radius * radius;
        System.out.println(diameterOfTheCircle);
    }
}
