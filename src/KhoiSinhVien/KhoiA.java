package KhoiSinhVien;

public class KhoiA extends HocSinh {
    private double ly, hoa;

    @Override
    public String toString() {
        return "KhoiA{" + super.toString() + ", ly=" + ly + ", hoa=" + hoa + '}';
    }

        @Override
    public double getDiemTrungBinh() {
        return (getToan() * 2 + ly + hoa) /4;
    }
    public static void main(String[] args) {
        KhoiA a = new KhoiA("SV001","Van Viet Huy",
                "23/10/2004",true,"CS311AC",7.8,9,10);
        System.out.println(a);
    }

    public KhoiA() {
    }

    public KhoiA(String maHocSinh, String hoTen, String ngaySinh, boolean gioiTinh,
                 String lop, double toan, double ly, double hoa) {
        super(maHocSinh, hoTen, ngaySinh, gioiTinh, lop, toan);
        this.ly = ly;
        this.hoa = hoa;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
}