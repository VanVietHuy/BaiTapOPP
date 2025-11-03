package QuanLySVGV;

public class GiangVien extends Nguoi {
    private String monDay;
    private double soGio, donGia;

    public double thanhTien() {
        return soGio * donGia;
    }

    @Override
    public String toString() {
        return "GiangVien{" + super.toString() +
                "monDay='" + monDay + '\'' +
                ", soGio=" + soGio +
                ", donGia=" + donGia + ", ThanhTien= " + thanhTien() +
                '}';
    }

    public GiangVien() {
    }

    public GiangVien(String ma, String hoTen, String ngaySinh, boolean gioiTinh,
                     String monDay, double soGio, double donGia) {
        super(ma, hoTen, ngaySinh, gioiTinh);
        this.monDay = monDay;
        this.soGio = soGio;
        this.donGia = donGia;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public double getSoGio() {
        return soGio;
    }

    public void setSoGio(double soGio) {
        this.soGio = soGio;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public static void main(String[] args) {
        GiangVien a = new GiangVien("GV001", "Le Van Nam", "12/12/1990",
                true, "Java", 60, 250000);
        System.out.println(a);
    }
}
