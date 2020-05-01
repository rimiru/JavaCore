package Java.Core.Chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class Activity32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phần tử mảng 1: ");
        int lengh1 = scanner.nextInt();
        int[] arrNum1 = new int[lengh1];

        for (int i = 0; i < lengh1; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " :");
            arrNum1[i] = scanner.nextInt();
        }

        System.out.println("Nhập số phần tử mảng 2: ");
        int lengh2 = scanner.nextInt();
        int[] arrNum2 = new int[lengh2];

        for (int i = 0; i < lengh2; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " :");
            arrNum2[i] = scanner.nextInt();
        }

        /*
         * Output
         * */

        System.out.print("array1 = ");
        for (int i = 0; i < lengh1; i++) {
            System.out.print(arrNum1[i] + " ");
        }


        System.out.print("\narray2 = ");
        for (int i = 0; i < lengh2; i++) {
            System.out.print(arrNum2[i] + " ");
        }


        int[] result = NoiMang(arrNum1, arrNum2);
        System.out.print("\nresult = ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] NoiMang(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int j = 0;
        for (int i = 0; i < result.length; i++) {
            if (i < arr1.length) {
                result[i] = arr1[i];
            } else {
                result[i] = arr2[j];
                j++;
            }
        }

        Arrays.sort(result);
        return result;
    }
}
