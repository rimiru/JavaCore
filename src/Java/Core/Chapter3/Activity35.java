package Java.Core.Chapter3;

import java.awt.*;
import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class Activity35 {
    public static void main(String[] args) {
        Activity35 ac = new Activity35();
        Scanner sc = new Scanner(System.in);

        int[] arrResult = ac.nhapMang();

        while (true) {
            ac.menu();
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    ac.trungBinhCong(arrResult);
                    break;
                case 2:
                    ac.timMax(arrResult);
                    break;
                case 3:
                    ac.findPositionMin(arrResult);
                    break;
                case 4:
                    int a = ac.demSoChinhPhuong(arrResult);
                    System.out.printf("So Chinh phuong co trong mang la " + a);
                    break;
                case 5:
                    ac.timSoNguyenTo(arrResult);
                    break;
                case 6:
                    ac.changeNegativeToZero(arrResult);
                    break;
                case 7:
                    ac.xoaCacPhanTuAm(arrResult).toArray();
                    System.out.println("Mang sau khi xoa cac phan tu am la: ");
                    ac.xuatMang(arrResult);
                case 8:
                    System.out.println("Mang sau khi sap xep la: ");
                    ac.sapXepMangTheoGiamDan(arrResult);
                case 9:
                    ac.xuatMang(arrResult);
                    break;
                case 10:
                    arrResult = ac.nhapMang();
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Moi nhap lai: ");
                    break;
            }
        }

    }

    int[] nhapMang() {

        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhap so phan tu mang : ");
            num = scanner.nextInt();

            if (num < 0) {
                System.out.println("Nhap so duong.");
            } else {
                break;
            }
        }
        int[] arr = new int[num];

        System.out.println();

        for (int i = 0; i < num; i++) {
            System.out.print("\nNhap phan tu thu " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    void xuatMang(int[] arr) {
        System.out.println("\n\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\n");
    }

    void menu() {
        System.out.println("\nMenu: ");
        System.out.println("1. Tính trung bình cộng các số lẻ ở vị trí chẵn");
        System.out.println("2. Tìm số lớn nhất trong mảng vừa nhập");
        System.out.println("3. Tìm vị trí các số nhỏ nhất trong mảng");
        System.out.println("4. Đếm các số chính phương có trong mảng");
        System.out.println("5. Hiện thị các số nguyên tố có trong mảng lên màn hình");
        System.out.println("6. Thay thế các phần tử âm có trong mảng bằng giá trị 0");
        System.out.println("7. Xóa các phần tử âm có trong mảng");
        System.out.println("8. Sắp xếp mảng đã nhập theo thứ tự giảm dần");
        System.out.println("9. Xuất mảng");
        System.out.println("10. Nhập mảng");
        System.out.println("11. Exit.");

        System.out.print("Choose: ");
    }


    /*
     * 1. Tính trung bình cộng các số lẻ ở vị trí chẵn
     * */
    void trungBinhCong(int[] arr) {
        int num = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && arr[i] % 2 != 0) {
                sum += arr[i];
                num++;
            }
        }
        System.out.println("\nTrung bình cộng các số lẻ ở vị trí chẵn: " + ((float) sum / num));
    }


    /*
     * 2. Tìm số lớn nhất trong mảng vừa nhập
     * */
    void timMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("\nSố lớn nhất trong mảng vừa nhập: " + max);
    }


    /*
     * 3. Tìm vị trí các số nhỏ nhất trong mảng
     * */
    void findPositionMin(int[] arr) {
        int min = arr[0];
        int position = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                position = i + 1;
            }
        }

        System.out.println("\nSố nhỏ nhất trong mảng là: " + min + "\nỞ vị trí thứ: " + position);
    }


    /*
     * 4. Đếm các số chính phương
     * */
    int demSoChinhPhuong(int[] arr) {
        int dem = 0;
        for (int i = 1; i < arr.length; i++) {
            int temp = (int) Math.sqrt(arr[i]);
            if (temp * temp == arr[i]) {
                dem++;
            }
        }
        return dem;
    }


    /*
     * 5. Tìm số nguyên tố
     * */
    void timSoNguyenTo(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (checkNguyenTo(i)) {
                System.out.printf("Nhung so nguyen to trong mang la: ");
                System.out.print(" " + i);
            }
        }
    }

    boolean checkNguyenTo(int n) {
        if (n <= 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }


    /*
     * 6. Thay thế các phần tử âm có trong mảng bằng giá trị 0
     * */
    void changeNegativeToZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

        System.out.println("Mảng sau khi thay thế các phần tử âm có trong mảng bằng giá trị 0: ");
        xuatMang(arr);
    }


    /*
     * 7. Xoá các phần tử âm có trong mảngs
     * */
    ArrayList<Integer> xoaCacPhanTuAm(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arrayList.add(arr[i]);
            }
        }
        return arrayList;

    }


    /*
     * 8. Sắp xếp mảng theo thứ tự giảm dần
     * */
    void sapXepMangTheoGiamDan(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}
