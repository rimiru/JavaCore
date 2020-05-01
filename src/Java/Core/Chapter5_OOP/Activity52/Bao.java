package Java.Core.Chapter5_OOP.Activity52;

public class Bao extends TaiLieu {
    private String ngayPhatHanh;

    public Bao() {
    }

    public Bao(String ma, String tenNhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        super(ma, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "maTaiLieu=" + super.getMa() +
                ", tenNhaXuatBan='" + super.getTenNhaXuatBan() + '\'' +
                ", soBanPhatHanh=" + super.getSoBanPhatHanh() +
                ", ngayPhatHanh='" + ngayPhatHanh + '\'' +
                '}';
    }
}
