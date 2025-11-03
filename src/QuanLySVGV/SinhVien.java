package QuanLySVGV;

public class SinhVien extends Nguoi {
    private double mon1, mon2, mon3;

    public double tinhDTB() {
        return (mon1 + mon2 + mon3) / 3;
    }

    @Override
    public String toString() {
        return "SinhVien{" + super.toString() +
                "mon1=" + mon1 +
                ", mon2=" + mon2 +
                ", mon3=" + mon3 + ", DiemTB= " + tinhDTB() +
                '}';
    }

    public SinhVien() {
    }

    public SinhVien(String ma, String hoTen, String ngaySinh, boolean gioiTinh, double mon1, double mon2, double mon3) {
        super(ma, hoTen, ngaySinh, gioiTinh);
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public double getMon1() {
        return mon1;
    }

    public void setMon1(double mon1) {
        this.mon1 = mon1;
    }

    public double getMon2() {
        return mon2;
    }

    public void setMon2(double mon2) {
        this.mon2 = mon2;
    }

    public double getMon3() {
        return mon3;
    }

    public void setMon3(double mon3) {
        this.mon3 = mon3;
    }
    public static void main(String[] args) {
        SinhVien a = new SinhVien("SV001", "Chi Pheo", "01/01/2004", true, 9, 8, 6);
        System.out.println(a);
    }
}
