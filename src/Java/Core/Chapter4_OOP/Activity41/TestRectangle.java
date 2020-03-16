package Java.Core.Chapter4_OOP.Activity41;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chieu dai: ");
        int chieuDai = scanner.nextInt();

        while (chieuDai < 0){
            System.out.println("Chieu dai phai >0. Moi nhap lai: ");
            chieuDai = scanner.nextInt();
        }

        System.out.println("Nhap chieu dai: ");
        int chieuRong = scanner.nextInt();

        while (chieuRong < 0){
            System.out.println("Chieu rong phai >0. Moi nhap lai: ");
            chieuRong = scanner.nextInt();
        }

        scanner.close();

        Rectangle hcn = new Rectangle(chieuDai,chieuRong);

        System.out.print(hcn.toString());
        System.out.print("\nChu vi hcn la: " + hcn.TinhChuVi());
        System.out.print("\nDien tich hcn la: " + hcn.TinhDienTich());
    }
}
