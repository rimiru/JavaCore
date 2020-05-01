package Java.Core.Chapter9.Activity95;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Activity95 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input path to file (Ex: 'src\\bai_tap_ve_nha\\lesson_09\\activity_95\\file.txt'): ");
        String pathName = scanner.nextLine();

        FileReader fileReader = new FileReader(pathName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String i = "";
        StringBuilder stringBuilder = new StringBuilder();

        while ((i = bufferedReader.readLine()) != null) {
            stringBuilder.append(" ").append(i);
        }

        String text = stringBuilder.toString().trim();
        String[] words = text.split(" ");

        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("All text: \n" + text);
        System.out.println("\nThe longest word: \n" + longestWord);

        fileReader.close();
        bufferedReader.close();
    }
}
