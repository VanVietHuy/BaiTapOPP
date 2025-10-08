package OPP;

import java.util.*;

public class PhanSoBai2 {
    PhanSo a, b;

    public PhanSo nhap(String cauHai) {
        int t, m;
        System.out.println(cauHai);
        Scanner kb = new Scanner(System.in);
        System.out.print("\tTu: ");
        t = kb.nextInt();
        do {
            System.out.print("\tMau>0: ");
            m = kb.nextInt();
        } while (m == 0);
        return new PhanSo(t, m);
    }

    void input() {
        a = nhap("Nhap phan so 1: ");
        b = nhap("Nhap phan so 2: ");
    }

    void output() {
        System.out.println("Tong = " + a + " + " + b + " = " + a.cong(b));
        System.out.println("Hieu = " + a + " - " + b + " = " + a.hieu(b));
        System.out.println("Tich = " + a + " * " + b + " = " + a.tich(b));
        System.out.println("Thuong = " + a + " / " + b + " = " + a.thuong(b));
    }

    public static void main(String[] args) {
        PhanSoBai2 a = new PhanSoBai2();
        System.out.println("Van Viet Huy");
        a.input();
        a.output();
    }
}
