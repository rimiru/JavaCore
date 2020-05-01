package Java.Core.Chapter5_OOP.Activity52;

public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private String thangPhatHanh;

    public TapChi() {
    }

    public TapChi(int soPhatHanh, String thangPhatHanh) {
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, String thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "maTaiLieu=" + super.getMa() +
                ", tenNhaXuatBan='" + super.getTenNhaXuatBan() + '\'' +
                ", soBanPhatHanh=" + super.getSoBanPhatHanh() +
                ", soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh='" + thangPhatHanh + '\'' +
                '}';
    }
}
