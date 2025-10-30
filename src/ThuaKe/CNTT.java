package ThuaKe;

public class CNTT extends SinhVien {
    private double java, css, html;

    public double tinhDiemTB() {
        return (java * 2 + css + html) / 4;
    }

    public String xepLoai() {
        double diem = tinhDiemTB();
        if (diem < 3.5) return "Kem";
        if (diem < 5) return "Yeu";
        if (diem < 6.5) return "TB";
        if (diem < 8) return "Kha";
        if (diem < 9) return "Gioi";
        return "Xuat Sac";
    }

    @Override
    public String toString() {
        return "CNTT{" + super.toString() +
                "java=" + java +
                ", css=" + css +
                ", html=" + html + " , TB= " + tinhDiemTB() + ", Xep Loai= " + xepLoai() +
                '}';
    }

    static void main(String[] args) {
        CNTT a = new CNTT("sv001", "Bao Cong", false,7.8, 9.2, 4.0);
        System.out.println(a);
    }

    public CNTT() {
    }

    public CNTT(String ma, String hoTen, boolean gioiTinh, double java, double css, double html) {
        super(ma, hoTen, gioiTinh);
        this.java = java;
        this.css = css;
        this.html = html;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }
}
