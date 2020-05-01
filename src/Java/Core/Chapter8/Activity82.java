package Java.Core.Chapter8;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity82 {

    private static ArrayList<String> listColor = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Cách 1: Fix cứng trước các phần tử list
         */
        listColor.add(0, "Red");
        listColor.add(1, "Green");
        listColor.add(2, "Orange");
        listColor.add(3, "White");
        listColor.add(4, "Black");


//        /**
//         * Cách 2: Nhập vào từng phần tử
//         * Nhập vào n phần tử và giá trị của các phần tử trong Array List
//         */
//        System.out.println("Nhập vào n phần tử: ");
//        int n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập vào index và giá trị của từng phần tử: ");
//            System.out.println("Dòng 1: Nhập index (nếu vị trí đầu tiên của list thì nhập là 0, vị trí thứ hai nhập là 1,...");
//            System.out.println("Dòng 2: Nhập vào tên màu sắc (Red, Yellow, Blue,...)");
//            int index = scanner.nextInt();
//            String value = scanner.next();
//            listColor.add(index, value);
//        }

        printAllColorList();
        System.out.println();

        /**
         * Insert phần tử mới
         */
        System.out.println("* Insert phần tử mới (Nhập vào index và giá trị phần tử mới)");
        System.out.println("Dòng 1: Nhập index (nếu vị trí đầu tiên của list thì nhập là 0, vị trí thứ hai nhập là 1,...");
        System.out.println("Dòng 2: Nhập vào tên màu sắc (Red, Yellow, Blue,...)");

        int index = scanner.nextInt();
        String value = scanner.next();
        listColor.add(index, value);

        printAllColorList();
        System.out.println();
    }

    private static void printAllColorList() {
        /**
         * In ra toàn bộ phần tử
         */
        listColor.forEach(color -> {
            System.out.printf("%s ", color);
        });
    }
}

