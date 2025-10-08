package BaiTapTrenLop;

import java.util.Scanner;

public class tinhGiaiThua {

    int n;
    Scanner kb = new Scanner(System.in);

    void input() {
        System.out.println("Tinh tong n! = 1 * 2 * ... * n ");
        do {
            System.out.print("Nhap n > 0: ");
            n = kb.nextInt();
        } while (n <= 0);
    }

    int tinhTong(int x) {
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s = s * i;
        }
        return s;
    }

    void output() {
        System.out.print(n + "! = ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" *");
        }
        System.out.println("\b= "+tinhTong(n));
    }

    public static void main(String[] args) {
        tinhGiaiThua a = new tinhGiaiThua();
        System.out.println("Van Viet Huy");
        a.input();
        a.output();
    }

}
