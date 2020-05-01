package Java.Core.Chapter8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Activity84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        boolean accessToMiddleElement = false;


        System.out.println("Nhập vào kích thước của list");
        int sizeOfList = scanner.nextInt();
        System.out.println();

        /**
         * Generate random values of ArrayList and LinkedList
         */
        for (int i = 0; i < sizeOfList; i++) {
            int value = random.nextInt();
            arrayList.add(i, value);
            linkedList.add(i, value);
        }

        /**
         * Calculate delta time
         */
        System.out.println();
        int middleIndex = sizeOfList / 2;

        long startTimeArrayList = System.nanoTime();
        arrayList.get(middleIndex);
        long lastTimeArrayList = System.nanoTime();
        long deltaTimeArrayList = lastTimeArrayList - startTimeArrayList;
        System.out.println("Thời gian để Array List truy cập tới phần tử giữa của list là: " + deltaTimeArrayList + " ns");

        long startTimeLinkedList = System.nanoTime();
        linkedList.get(middleIndex);
        long lastTimeLinkedList = System.nanoTime();
        long deltaTimeLinkedList = lastTimeLinkedList - startTimeArrayList;
        System.out.println("Thời gian để Linked List truy cập tới phần tử giữa của list là: " + deltaTimeLinkedList + " ns");
    }
}
