package ThuaKe;

public class KinhTe extends SinhVien {
    private double nLKT, mKT;

    public double tinhDiemTB() {
        return (nLKT * 2 + mKT) / 3;
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
        return "KinhTe{" + super.toString() +
                "nLKT= " + nLKT +
                ", mKT= " + mKT + ", TB= " + tinhDiemTB() + ", Xep Loai= " + xepLoai() +
                '}';
    }

    public static void main(String[] args) {
        KinhTe a = new KinhTe("sv002", "Chi Pheo", false,8,7);
        System.out.println(a);
    }

    public KinhTe() {
    }

    public KinhTe(String ma, String hoTen, boolean gioiTinh, double nLKT, double mKT) {
        super(ma, hoTen, gioiTinh);
        this.nLKT = nLKT;
        this.mKT = mKT;
    }

    public double getnLKT() {
        return nLKT;
    }

    public void setnLKT(double nLKT) {
        this.nLKT = nLKT;
    }

    public double getmKT() {
        return mKT;
    }

    public void setmKT(double mKT) {
        this.mKT = mKT;
    }
}