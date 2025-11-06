package TruuTuong;

public abstract class SinhVien {
    private String ma, hoTen;
    private boolean gioiTinh;

    public abstract double tinhDTB();

    public String xepLoai() {
        double diem = tinhDTB();
        if (diem < 3.5) return "Kem";
        if (diem < 5) return "Yeu";
        if (diem < 6.5) return "TB";
        if (diem < 8) return "Kha";
        if (diem < 9) return "Gioi";
        return "Xuat sac";
    }

    @Override
    public String toString() {
        return ma + ", hoTen= " + hoTen + ", gioiTinh=" + (gioiTinh ? "Nam" : "Nu")
                + ", TB= " + tinhDTB() + ", loai= " + xepLoai() + '}';
    }

    public static void main(String[] args) {
//        SinhVien a = new SinhVien("sv001", "Chi Pheo",true);
//        System.out.println(a);
    }

    public SinhVien() {
    }

    public SinhVien(String ma, String hoTen, boolean gioiTinh) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
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
}
