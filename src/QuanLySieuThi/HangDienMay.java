package QuanLySieuThi;

public class HangDienMay extends HangHoa {
    private String noiSanXuat;

    @Override
    public String toString() {
        return "HangDienMay{" + super.toString() + " noiSanXuat= " + noiSanXuat + '}';
    }

    @Override
    public double tinhThanhTien() {
        double thanhTien;
        if (getNoiSanXuat().equalsIgnoreCase("NK")) {
            thanhTien = getSoLuong() * getDonGia() * 1.2;
        } else {
            thanhTien = getSoLuong() * getDonGia();
        }
        return thanhTien;
    }

    public static void main(String[] args) {
        //HangDienMay(String maHang, int ngay, int thang, int nam, double donGia, double soLuong, String noiSanXuat)
        HangDienMay a = new HangDienMay("001", 12, 12, 2020, 200, 100, "NK");
        System.out.println(a);
    }

    public HangDienMay() {
    }

    public HangDienMay(String maHang, int ngay, int thang, int nam, double donGia, double soLuong, String noiSanXuat) {
        super(maHang, ngay, thang, nam, donGia, soLuong);
        this.noiSanXuat = noiSanXuat;
    }

    public String getNoiSanXuat() {
        return noiSanXuat;
    }

    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }
}
