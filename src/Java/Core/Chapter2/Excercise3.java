package Java.Core.Chapter2;

import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("/**resolve problem with for");
        System.out.print("Input a number: ");
        int num = sc.nextInt();
        sc.close();

        // resolve problem with for
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum of 1 to " + num + " is: " + sum);
        System.out.println("The average is: " + ((float) num + 1) / 2);

        // resolve problem with while
        System.out.println();
        System.out.println("/**resolve problem with while");
        sum = 0;
        int i = 1;
        while (true) {
            sum += i;
            i++;
            if (i > num) break;
        }
        System.out.println("The sum of 1 to " + num + " is: " + sum);
        System.out.println("The average is: " + ((float) num + 1) / 2);


        // resolve problem with do while
        System.out.println();
        System.out.println("/**resolve problem with do while");
        sum = 0;
        int j = 1;
        do {
            sum += j;
            j++;
        } while (j <= num);
        System.out.println("The sum of 1 to " + num + " is: " + sum);
        System.out.println("The average is: " + ((float) num + 1) / 2);
    }
}
