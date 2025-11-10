package KhoiSinhVien;

public class KhoiD extends HocSinh{
    private double van,ngoaiNgu;

    @Override
    public String toString() {
        return "KhoiD{" +super.toString()+ ", van= " + van + ", ngoaiNgu= " + ngoaiNgu + '}';
    }

    @Override
    public double getDiemTrungBinh() {
        return (getToan()+ngoaiNgu*2+van)/4;
    }

    public static void main(String[] args) {
        //KhoiD(String maHocSinh, String hoTen, String ngaySinh, boolean gioiTinh, String lop, double toan, double van, double ngoaiNgu)
        KhoiD a = new KhoiD("SV001","Van Viet Huy",
                "23/10/2004",true,"CS311AC",7.8,9,8);
        System.out.println(a);
    }

    public KhoiD() {
    }

    public KhoiD(String maHocSinh, String hoTen, String ngaySinh,
                 boolean gioiTinh, String lop, double toan, double van, double ngoaiNgu) {
        super(maHocSinh, hoTen, ngaySinh, gioiTinh, lop, toan);
        this.van = van;
        this.ngoaiNgu = ngoaiNgu;
    }

    public double getNgoaiNgu() {
        return ngoaiNgu;
    }

    public void setNgoaiNgu(double ngoaiNgu) {
        this.ngoaiNgu = ngoaiNgu;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }
}
