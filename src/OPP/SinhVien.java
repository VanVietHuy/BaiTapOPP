package OPP;

public class SinhVien {

    private String ma, hoTen;
    private boolean gioiTinh;
    private String ngaySinh, queQuan;
    private double toan, ly, hoa, van;

    public double tinhDiemTrungBinh() {
        return (toan * 2 + ly + hoa + van * 2) / 6;
    }

    public String xepLoai() {
        double diem = tinhDiemTrungBinh();
        if (diem < 3.5) {
            return "Kem";
        }
        if (diem < 5) {
            return "Yeu";
        }
        if (diem < 6.5) {
            return "TB";
        }
        if (diem < 8) {
            return "Kha";
        }
        if (diem < 9) {
            return "Gioi";
        }
        return "Xuat sac";
    }

    @Override
    public String toString() {
        return ma + ", " + hoTen + ", " + gioiTinh + ", " + ngaySinh + ", " + queQuan + ", toan = " + toan + ", ly = " + ly + ", hoa = " + hoa + ", van = " + van +", xep loai = "+ xepLoai();
    }

    public SinhVien() {
    }

    public SinhVien(String ma, String hoTen, boolean gioiTinh, String ngaySinh, String queQuan, double toan, double ly, double hoa, double van) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.van = van;
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

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
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

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public static void main(String[] args) {
        SinhVien a = new SinhVien("sv001", "Chi Pheo", true, "10/01/2000", "Lang Vu Dai", 7, 9, 6.5, 8);
        System.out.println(a);
    }
}
