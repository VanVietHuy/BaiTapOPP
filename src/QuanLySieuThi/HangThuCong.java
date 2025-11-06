package QuanLySieuThi;

public class HangThuCong extends HangHoa {
    private String nhaSanXuat;

    @Override
    public String toString() {
        return "HangThuCong{" + super.toString() + ", nhaSanXuat= " + nhaSanXuat + '}';
    }

    @Override
    public double tinhThanhTien() {
        return getSoLuong() * getDonGia();
    }

    public HangThuCong() {
    }

    public HangThuCong(String maHang, int ngay, int thang, int nam, double donGia, double soLuong, String nhaSanXuat) {
        super(maHang, ngay, thang, nam, donGia, soLuong);
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public static void main(String[] args) {
        HangThuCong a = new HangThuCong("001",11,10,2020,110,210,"Duy Tan");
        System.out.println(a);
    }
}
