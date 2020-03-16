package Java.Core.Chapter5_OOP.Activity51;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyCanBo qlcb = new QuanLyCanBo();
        String name = "",age="",gioiTinh = "", diaChi = "";

        System.out.println("Nhap so can bo: ");
        int num = sc.nextInt();
        CanBo[] canBo = new CanBo[num];

        for (int i = 0; i<num; i++){
            System.out.println("/********************************************/");
            System.out.println("Nhap ho ten: ");
            name = sc.nextLine();

            System.out.println("Nhap age: ");
            age = sc.nextLine();

            System.out.println("Nhap gioi tinh: ");
            gioiTinh = sc.nextLine();

            System.out.println("Nhap dia chi: ");
            diaChi = sc.nextLine();

            canBo[i] = qlcb.themCanBo(name, age, gioiTinh, diaChi);
        }

        System.out.println("Nhap ho ten muon tim kiem: ");
        String tk = sc.next();
        CanBo cbtk = qlcb.timKiem(tk,canBo);
        System.out.println("OUtput: ");
        qlcb.hienThiThongTin1CB(cbtk);


        System.out.println("Hiện thị thông tin về danh sách các cán bộ: ");
        qlcb.hienThiThongTin(canBo);
        sc.close();
    }
}
