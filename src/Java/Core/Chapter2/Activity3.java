package Java.Core.Chapter2;

import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        scanner.close();

        String str = String.valueOf(num);
        String sum = "";
        int result = 0;

        for (int i = 0; i < 3; i++) {
            sum += str;
            result = result + Integer.valueOf(sum);
        }
        System.out.println();
        System.out.print("Output: " + result);
    }
}
