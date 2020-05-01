/*
    Input: [49, 1, 2, 200, 2, 3, 4, 5, 8, 9, 10]
    The longest consecutive elements sequence is [2, 3, 4, 5], therefore the program will return its length 4
*/


package Java.Core.Chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class Activity31 {
    public static void main(String[] args) {
        int[] array = {49, 1, 2, 200, 3, 4, 5, 8, 9, 10};

        int startIndex = 0;
        int endIndex = 0;
        int longest = 0;

        // Loop
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] == array[i] + 1) {
                endIndex = i + 1;
            } else {
                if (longest < endIndex - startIndex) {
                    startIndex = i + 1;
                    endIndex = i + 1;
                    longest = endIndex - startIndex;
                }
            }
        }
        System.out.println(startIndex + "-" + endIndex);
    }


}
