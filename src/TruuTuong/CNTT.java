package TruuTuong;

public class CNTT extends SinhVien {
    private double java, css, html;

    @Override
    public double tinhDTB() {
        return (java * 2 + css + html) / 4;
    }

    @Override
    public String toString() {
        return "CNTT{" + super.toString() + "java=" + java + ", css=" + css + ", html=" + html + '}';
    }

    public static void main(String[] args) {
        CNTT a = new CNTT("sv001", "Bao Cong", true, 8, 9, 5);
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
