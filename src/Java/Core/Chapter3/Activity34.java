/*
*Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
* */

package Java.Core.Chapter3;

import java.util.Scanner;

public class Activity34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the length of array: ");
        int lenght = scanner.nextInt();

        int[] arr = new int[lenght];

        System.out.println("Input array: ");
        for (int i=0; i<lenght;i++){
            System.out.println("array[" + i +"] :");
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Output: " + removeTheDuplicateElements(arr));
    }

    public static int removeTheDuplicateElements(int[] arr){
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index-1])
                arr[index++] = arr[i];
        }
        return index;
    }
}
