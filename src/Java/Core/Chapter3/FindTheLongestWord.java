package Java.Core.Chapter3;

import java.util.Scanner;

public class FindTheLongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a sentence: ");
        String input = scanner.nextLine();

        String[] array = input.split(" ");

        String longest = array[0];

        for (String item : array) {
            int length = item.length();
            if (length > longest.length()) {
                longest = item;
            }
        }

        System.out.println("Output: " + longest);
    }
}
