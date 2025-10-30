package ThuaKe;

public class SinhVien {
    private String ma,hoTen;
    private boolean gioiTinh;

    @Override
    public String toString() {
        return "SinhVien{" +
                "ma='" + ma + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh=" + (gioiTinh?"Nam":"Nu") +
                '}';
    }

    static void main() {
        SinhVien a = new SinhVien("sv001", "Chi Pheo", true);
        System.out.println(a);
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
