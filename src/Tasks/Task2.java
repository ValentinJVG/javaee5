
// Calculating BMI (body mass index)
package Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter weight in kg:");
        float weight = scanner.nextFloat();

        System.out.println("Please enter height in cm");
        int height = scanner.nextInt();

//        float bodyMassIndex = weight / (height * height) * 10_000;
        float bodyMassIndex = weight / (((float) height/100) * ((float) height/100));
        if (bodyMassIndex > 18.5 && bodyMassIndex < 24.9) {
            System.out.println("BMI optimal");
        }else{
            System.out.println("BMI not optimal");
        }

    }
}
