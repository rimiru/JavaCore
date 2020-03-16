package Java.Core.Chapter5_OOP.Activity51;

public class QuanLyCanBo {
    public CanBo themCanBo(String name, String age, String gioiTinh, String diaChi) {
        CanBo cb = new CanBo();
        cb.setHoTen(name);
        cb.setAge(age);
        cb.setGioiTinh(gioiTinh);
        cb.setDiaChi(diaChi);
        return cb;
    }

    public CanBo timKiem(String name, CanBo[] cb) {
        for (CanBo item : cb) {
            if (item.getHoTen().equals(name)) {
                return item;
            }
        }

        return null;
    }

    public void hienThiThongTin(CanBo[] cb) {
        int i = 1;
        for (CanBo item : cb) {
            System.out.println("************/ Can Bo Thu " + i + " **************/");
            System.out.print("\nName: " + item.getHoTen());
            System.out.print("\nAge: " + item.getAge());
            System.out.print("\nGioi Tinh: " + item.getGioiTinh());
            System.out.print("\nDia Chi: " + item.getDiaChi());
            i++;
        }
    }

    public void hienThiThongTin1CB(CanBo cb) {
        System.out.println("************/ Can Bo Can Tim **************/");
        System.out.print("\nName: " + cb.getHoTen());
        System.out.print("\nAge: " + cb.getAge());
        System.out.print("\nGioi Tinh: " + cb.getGioiTinh());
        System.out.print("\nDia Chi: " + cb.getDiaChi());

    }
}
