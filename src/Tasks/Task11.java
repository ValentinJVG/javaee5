//Enough!

package Tasks;

import java.util.Scanner;


//dunno how to enter only text!

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");

        String word1 = "";
        String word2 = "";
        int length1 = 0;
        int length2 = 0;
        word2 = countingLenght(input, word2, length2);
        System.out.println("Longest Word: " + word2);

    }

    private static String countingLenght(Scanner input, String word2, int length2) {
        String word1;
        int length1;
        while (input.hasNext()) {
      word1 = input.next();

      if (word1.equals("Enough!"))
          break;

      length1 = word1.length();
      if (length1 > length2) {
          length2 = length1;
          word2 = word1;
      }
  }
        return word2;
    }
}

