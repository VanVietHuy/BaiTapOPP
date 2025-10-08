package OPP;

import java.util.*;

public class PhanSoBai3 {
    PhanSo a, b;
    char nhapPhepTinh;
    Scanner kb = new Scanner(System.in);

    public PhanSo nhap(String cauBa) {
        int t, m;
        System.out.println(cauBa);
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
        System.out.print("Nhap phep toan can tinh ( + , - , * , / ): ");
        nhapPhepTinh = kb.next().charAt(0);
    }

    void output() {
        switch (nhapPhepTinh) {
            case '+':
                System.out.println("Tong = " + a + " + " + b + " = " + a.cong(b));
                break;
            case '-':
                System.out.println("Hieu = " + a + " - " + b + " = " + a.hieu(b));
                break;
            case '*':
                System.out.println("Tich = " + a + " * " + b + " = " + a.tich(b));
                break;
            case '/':
                if (b.getTu() == 0) System.out.println("Khong chia 0");
                else System.out.println("Thuong = " + a + " / " + b + " = " + a.thuong(b));
                break;
            default:
                System.out.println("Khong tinh");
        }
    }

    public static void main(String[] args) {
        PhanSoBai3 a = new PhanSoBai3();
        System.out.println("Van Viet Huy");
        a.input();
        a.output();
    }
}
