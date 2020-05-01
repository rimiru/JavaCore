package Java.Core.Chapter5_OOP.Activity52;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyTaiLieu {
    public TaiLieu themMoiTaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        TaiLieu taiLieu = new TaiLieu();
        taiLieu.setMa(maTaiLieu);
        taiLieu.setTenNhaXuatBan(tenNhaXuatBan);
        taiLieu.setSoBanPhatHanh(soBanPhatHanh);
        return taiLieu;
    }

    public TaiLieu timKiemTheoLoaiTaiLieu(String maTaiLieu, ArrayList<TaiLieu> listTaiLieu) {
        for (TaiLieu taiLieu : listTaiLieu) {
            if (taiLieu.getMa() == maTaiLieu) {
                return taiLieu;
            }
        }
        return null;
    }

    public void xoaTaiLieuTheoMaTaiLieu(String maTaiLieu, ArrayList<TaiLieu> listTaiLieu) {
        for (TaiLieu taiLieu : listTaiLieu) {
            if (taiLieu.getMa() == maTaiLieu) {
                taiLieu = null;
                return;
            }
        }
    }

    public void hienThiThongTinVeTaiLieu(ArrayList<TaiLieu> listTaiLieu) {
        for (TaiLieu taiLieu : listTaiLieu) {
            System.out.println(taiLieu.toString());
        }
    }
}
