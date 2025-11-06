package QuanLySieuThi;

public abstract class HangHoa {
    private String maHang;
    private int ngay, thang, nam;
    private double donGia, soLuong;

    public abstract double tinhThanhTien();

    @Override
    public String toString() {
        return maHang + ", ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + ", donGia=" +
                donGia + ", soLuong=" + soLuong+", thanhTien="+tinhThanhTien();
    }

    public static void main(String[] args) {

    }

    public HangHoa() {
    }

    public HangHoa(String maHang, int ngay, int thang, int nam, double donGia, double soLuong) {
        this.maHang = maHang;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }
}
