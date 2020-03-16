package Java.Core.Chapter4_OOP.Activity41;

public class Rectangle {
    private int chieuDai;
    private int chieuRong;

    public Rectangle(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public int TinhChuVi(){
        return (this.chieuDai+this.chieuRong)*2;
    }

    public int TinhDienTich(){
        return this.chieuDai*this.chieuRong;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}
