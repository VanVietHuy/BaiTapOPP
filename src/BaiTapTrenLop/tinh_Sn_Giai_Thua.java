package BaiTapTrenLop;

import java.util.Scanner;

public class tinh_Sn_Giai_Thua {

    int n;
    Scanner kb = new Scanner(System.in);

    void input() {
        System.out.println("Tinh tong S(n) = 1/2! - 2/3! + 3/4! - ... ");
        do {
            System.out.print("Nhap n > 0: ");
            n = kb.nextInt();
        } while (n <= 0);
    }

    int tinhGiaiThua(int k) {
        if (k == 0 || k == 1) {
            return 1;
        }
        int ketQua = 1;
        for (int i = 2; i <= k; i++) {
            ketQua = ketQua * i;
        }
        return ketQua;
    }
    void output() {
        double s = 0.0;
        for (int i = 1; i <= n; i++) {
            int giaiThua = tinhGiaiThua(i + 1);
            if (i % 2 != 0) {
                s = s + (double) i / giaiThua;
            } else {
                s = s - (double) i / giaiThua;
            }
        }
        System.out.print("S("+n+") = (");
        for (int i = 1; i <=n; i++) {
            System.out.print(" 1/"+i+"! +");
        }
        System.out.println("\b)= "+ s);
    }

    public static void main(String[] args) {
        tinh_Sn_Giai_Thua a = new tinh_Sn_Giai_Thua();
        System.out.println("Van Viet Huy");
        a.input();
        a.output();
    }
}
