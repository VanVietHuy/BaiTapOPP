package QuanLySVGV;

public class Nguoi {
    private String ma, hoTen, ngaySinh;
    private boolean gioiTinh;

    @Override
    public String toString() {
        return "Nguoi{" +
                "ma='" + ma + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh=" + (gioiTinh ? "Nam": "Nu") +
                '}';
    }
    public static void main(String[] args) {
        //Nguoi(String ma, String hoTen, String ngaySinh, boolean gioiTinh)
        Nguoi a = new Nguoi("SV001","Chi Pheo","01/01/2004",true);
        System.out.println(a);
    }
    public Nguoi() {
    }

    public Nguoi(String ma, String hoTen, String ngaySinh, boolean gioiTinh) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
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

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }


}
