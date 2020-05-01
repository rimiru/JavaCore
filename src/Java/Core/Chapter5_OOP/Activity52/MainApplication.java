package Java.Core.Chapter5_OOP.Activity52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu();
    private static ArrayList<TaiLieu> listTaiLieu = new ArrayList<>();

    private static String maTaiLieu;
    private static String tenNhaXuatBan;
    private static int soBanPhatHanh;
    private static String tenTacGia;
    private static int soTrang;
    private static String ngayPhatHanh;
    private static int soPhatHanh;
    private static String thangPhatHanh;


    public static void main(String[] args) {
        luaChonHanhDong();
        scanner.close();
    }

    private static void luaChonHanhDong() {

        System.out.println("1. Them moi thong tin tai lieu ");
        System.out.println("2. Xoa tai lieu theo ma tai lieu ");
        System.out.println("3. Hien thi thong tin cac tai lieu ");
        System.out.println("4. Tim kiem theo loai tai lieu ");

        int i;
        do {
            System.out.print("Lua chon hanh dong 1-4: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Sai cu phap. Vui long thu lai: ");
                scanner.next();
            }
            i = scanner.nextInt();
        } while (i < 1 || i > 4);

        switch (i) {
            case 1:
                nhapThongTinTaiLieu();
                luaChonHanhDong();
                break;
            case 2:
                xoaTaiLieuTheoMaTaiLieu(maTaiLieu, listTaiLieu);
                luaChonHanhDong();
                break;
            case 3:
                hienThiThongTinCacTaiLieu(listTaiLieu);
                luaChonHanhDong();
                break;
            case 4:
                timKiemTheoLoaiTaiLieu(maTaiLieu, listTaiLieu);
                luaChonHanhDong();
                break;
        }
    }

    private static void nhapThongTinTaiLieu() {
        System.out.println("\nChon loai tai lieu can them: ");
        System.out.println("1. Sach ");
        System.out.println("2. Bao ");
        System.out.println("3. Tap chi ");

        String inputString = "";

        int i;
        do {
            System.out.print("\nLua chon loai tai lieu: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Sai cu phap. Vui long thu lai: ");
                scanner.next();
            }
            i = scanner.nextInt();
        } while (i < 1 || i > 3);


        switch (i) {
            case 1:
                scanner.nextLine();
                System.out.println("Nhap thong tin sach theo mau sau: Ma tai lieu, ten nha xuat ban, so ban phat hanh, ten tac gia, so trang: ");
                inputString = scanner.nextLine();
                splitString(inputString, 1);

                Sach sach = new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
                sach.setMa(maTaiLieu);
                sach.setTenNhaXuatBan(tenNhaXuatBan);
                sach.setSoBanPhatHanh(soBanPhatHanh);
                sach.setTenTacGia(tenTacGia);
                sach.setSoTrang(soTrang);
                System.out.println("Da them " + sach.toString());
                listTaiLieu.add(sach);
                break;
            case 2:
                scanner.nextLine();
                System.out.println("Nhap thong tin sach theo mau sau: Ma tai lieu, ten nha xuat ban, so ban phat hanh, ngay phat hanh: ");
                inputString = scanner.nextLine();
                splitString(inputString, 2);
                Bao bao = new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh);
                bao.setMa(maTaiLieu);
                bao.setTenNhaXuatBan(tenNhaXuatBan);
                bao.setSoBanPhatHanh(soBanPhatHanh);
                bao.setNgayPhatHanh(ngayPhatHanh);
                System.out.println("Da them " + bao.toString());
                listTaiLieu.add(bao);
                break;
            case 3:
                scanner.nextLine();
                System.out.println("Nhap thong tin sach theo mau sau: Ma tai lieu, ten nha xuat ban, so ban phat hanh, so phat hanh, thang phat hanh: ");
                inputString = scanner.nextLine();
                splitString(inputString, 3);
                TapChi tapChi = new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh);
                tapChi.setMa(maTaiLieu);
                tapChi.setTenNhaXuatBan(tenNhaXuatBan);
                tapChi.setSoBanPhatHanh(soBanPhatHanh);
                tapChi.setSoPhatHanh(soPhatHanh);
                tapChi.setThangPhatHanh(thangPhatHanh);
                System.out.println("Da them " + tapChi.toString());
                listTaiLieu.add(tapChi);
                break;
        }
    }

    private static void xoaTaiLieuTheoMaTaiLieu(String maTaiLieu, ArrayList<TaiLieu> listTaiLieu) {
        System.out.println("Nhap ma tai lieu can xoa: ");
        maTaiLieu = scanner.nextLine();
        scanner.nextLine();
        quanLyTaiLieu.xoaTaiLieuTheoMaTaiLieu(maTaiLieu, listTaiLieu);
        System.out.println("Da xoa tai lieu theo ma tai lieu vua nhap");
    }

    private static void hienThiThongTinCacTaiLieu(ArrayList<TaiLieu> listTaiLieu) {
        System.out.println("Hien thi thong tin cac tai lieu: ");
        quanLyTaiLieu.hienThiThongTinVeTaiLieu(listTaiLieu);
    }

    private static void timKiemTheoLoaiTaiLieu(String maTaiLieu, ArrayList<TaiLieu> listTaiLieu) {
        System.out.println("Nhap ma tai lieu can tim kiem: ");
        maTaiLieu = scanner.nextLine();
        scanner.nextLine();
        TaiLieu taiLieuTimKiem = quanLyTaiLieu.timKiemTheoLoaiTaiLieu(maTaiLieu, listTaiLieu);
        System.out.println("Da tim duoc tai lieu theo ma tai lieu vua nhap");
        System.out.println(taiLieuTimKiem.toString());
    }

    private static void splitString(String inputString, int type) {
        ArrayList<String> items = new ArrayList<>(Arrays.asList(inputString.split(",")));
        maTaiLieu = String.valueOf(items.indexOf(0));
        tenNhaXuatBan = String.valueOf(items.indexOf(1));
        soBanPhatHanh = items.indexOf(2);
        if (type == 1) {
            tenTacGia = String.valueOf(items.indexOf(3));
            soTrang = items.indexOf(4);
        } else if (type == 2) {
            ngayPhatHanh = String.valueOf(items.indexOf(3));

        } else if (type == 3) {
            soPhatHanh = items.indexOf(3);
            thangPhatHanh = String.valueOf(items.indexOf(4));
        }
    }
}
