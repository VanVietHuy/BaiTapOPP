package TruuTuong;

public class KinhTe extends SinhVien{
    private double nLKT,marketing;

    @Override
    public double tinhDTB() {
        return (nLKT*2+marketing)/3;
    }

    @Override
    public String toString() {
        return "KinhTe{" +super.toString()+ "nLKT=" + nLKT + ", marketing=" + marketing + '}';
    }

    public KinhTe() {
    }

    public KinhTe(String ma, String hoTen, boolean gioiTinh, double marketing, double nLKT) {
        super(ma, hoTen, gioiTinh);
        this.marketing = marketing;
        this.nLKT = nLKT;
    }

    public double getnLKT() {
        return nLKT;
    }

    public void setnLKT(double nLKT) {
        this.nLKT = nLKT;
    }

    public double getMarketing() {
        return marketing;
    }

    public void setMarketing(double marketing) {
        this.marketing = marketing;
    }
    public static void main (String[] args) {
        KinhTe a = new KinhTe("sv001","Thi No",false,8,9);
        System.out.println(a);
    }
}
