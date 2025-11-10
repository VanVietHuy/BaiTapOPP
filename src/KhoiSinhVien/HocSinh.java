package KhoiSinhVien;

public abstract class HocSinh {
    private String maHocSinh, hoTen, ngaySinh;
    private boolean gioiTinh;
    private String lop;
    private double toan;

    public abstract double getDiemTrungBinh();

    @Override
    public String toString() {
        return maHocSinh + ", " + hoTen + ", " + ngaySinh + ", " + (gioiTinh ? "Nam" : "Nu") +
                ", lop=" + lop + '\'' + ", toan= " + toan + ", Diem Trung Binh= " + getDiemTrungBinh();
    }

    public static void main(String[] args) {

    }

    public HocSinh() {
    }

    public HocSinh(String maHocSinh, String hoTen, String ngaySinh, boolean gioiTinh, String lop, double toan) {
        this.maHocSinh = maHocSinh;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.lop = lop;
        this.toan = toan;
    }

    public String getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(String maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }
}
