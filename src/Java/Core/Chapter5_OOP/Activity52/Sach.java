package Java.Core.Chapter5_OOP.Activity52;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach() {
    }

    public Sach(String tenTacGia, int soTrang) {
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach(TaiLieu taiLieu, String tenTacGia, int soTrang) {
        this.setMa(taiLieu.getMa());
        this.setTenNhaXuatBan(taiLieu.getTenNhaXuatBan());
        this.setSoBanPhatHanh(taiLieu.getSoBanPhatHanh());
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach(String ma, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(ma, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }


    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maTaiLieu=" + super.getMa() +
                ", tenNhaXuatBan='" + super.getTenNhaXuatBan() + '\'' +
                ", soBanPhatHanh=" + super.getSoBanPhatHanh() +
                ", tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }
}
