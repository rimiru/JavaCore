package Java.Core.Chapter8;

import java.util.LinkedList;
import java.util.Scanner;

public class Activity81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        /**
         * Nhập số phần tử và giá trị của các phần tử vào list
         **/

        System.out.println("Nhập vào số phần tử của list: ");
        int n = scanner.nextInt();
        LinkedList<Integer> listOfNumbers = new LinkedList<>();

        System.out.println("Nhập giá trị của các phần tử: ");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            listOfNumbers.add(value);
        }

        /**
         * Nhập số hành động: Insert hoặc Delete phần tử
         */
        System.out.println("Nhập số lượng hành động (queries): ");
        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            System.out.println("Nhập tên hành động thao tác với dữ liệu: Insert hoặc Delete");
            String action = scanner.next();

            if (action.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                listOfNumbers.add(index, value);

            } else if (action.equals("Delete")) {
                int index = scanner.nextInt();
                listOfNumbers.remove(index);
            }
        }

        /**
         * In ra list (toàn bộ phần tử sau khi đã Insert hoặc Delete
         */
        System.out.println("In ra toàn bộ list sau khi đã sửa: ");
        for (Integer number : listOfNumbers) {
            System.out.printf("%d ", number);
        }

        scanner.close();
    }
}
