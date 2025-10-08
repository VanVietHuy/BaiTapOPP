package OPP;

public class PhanSo {
    private int tu, mau;

    public PhanSo() {
        mau = 1;
    }

    public PhanSo(int t, int m) {
        tu = t;
        mau = m;
    }

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }

    public void setTu(int x) {
        tu = x;
    }

    public void setMau(int x) {
        mau = x;
    }

    public String toString() {
        return tu + "/" + mau;
    }

    private int uCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    private void rutGon() {
        if (tu != 0) {
            int t = uCLN(Math.abs(tu), Math.abs(mau));
            tu = tu / t;
            mau = mau / t;
        }
    }

    public PhanSo cong(PhanSo b) {
        PhanSo c = new PhanSo();
        c.tu = tu * b.mau + mau * b.tu;
        c.mau = mau * b.mau;
        c.rutGon();
        return c;
    }

    public PhanSo hieu(PhanSo b) {
        PhanSo c = new PhanSo();
        c.tu = tu * b.mau - mau * b.tu;
        c.mau = mau * b.mau;
        c.rutGon();
        return c;
    }

    public PhanSo tich(PhanSo b) {
        PhanSo c = new PhanSo();
        c.tu = tu * b.tu;
        c.mau = mau * b.mau;
        c.rutGon();
        return c;
    }
    public PhanSo thuong(PhanSo b) {
        PhanSo c = new PhanSo();
        c.tu = tu * b.mau;
        c.mau = b.tu * mau;
        c.rutGon();
        return c;
    }

    public static void main(String[] args) {
        PhanSo x = new PhanSo(1, 2);
        PhanSo y = new PhanSo(3, 4);
        System.out.println("Van Viet Huy");
        System.out.println("Tong = " + x + " + " + y + " = " + x.cong(y));
        System.out.println("Hieu = " + x + " - " + y + " = " + x.hieu(y));
        System.out.println("Tich = " + x + " * " + y + " = " + x.tich(y));
        System.out.println("Thuong = " + x + " / " + y + " = " + x.thuong(y));
    }
}
