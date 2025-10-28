package CNTT;

public class CNTT {
    private String ma, hoTen;
    private boolean gioiTinh;
    private double java, css, html;

    public double getDiemTrungBinh() {
        return (java * 2 + css + html) / 4;
    }
    public String getXepLoai() {
        double diem = getDiemTrungBinh();
        if (diem < 3.5) return "Kem";
        if (diem < 5) return "Yeu";
        if (diem < 6.5) return "TB";
        if (diem < 8) return "Kha";
        if (diem < 9) return "Gioi";
        return "Xuat sac";
    }

    @Override
    public String toString() {
        return ma +", "+  hoTen +", "+ gioiTinh + ", java=" + java + ", css=" + css + ", html=" + html + ", diem TB: "+ getDiemTrungBinh() + ", xep loai: "+ getXepLoai();
    }

    public CNTT() {
    }

    public CNTT(String ma, String hoTen, boolean gioiTinh, double java, double css, double html) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.java = java;
        this.css = css;
        this.html = html;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public static void main(String[] args) {
    CNTT a = new CNTT("sv001","Bao Cong",true,8.9,9.2,7);
        System.out.println(a);
    }
}
