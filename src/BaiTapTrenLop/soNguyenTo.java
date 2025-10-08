package BaiTapTrenLop;

import java.util.Scanner;

public class soNguyenTo {

    int n;
    Scanner kb = new Scanner(System.in);

    void input() {
        System.out.println("Van Viet Huy");
        System.out.println("Kiem Tra So Nguyen To");
        System.out.print("Nhap 1 so nguyen > 0: ");
        n = kb.nextInt();
    }

    int kiemTraSoNguyenTo(int x) {
        if (n < 2) {
            return 0;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    void output() {
        if (kiemTraSoNguyenTo(n) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        soNguyenTo a = new soNguyenTo();
        a.input();
        a.output();
    }
}
