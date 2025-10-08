package BaiTapTrenLop;

import java.util.Scanner;

public class kiemTraSoDoiXung {

    int n;

    void input() {
        System.out.println("Vo Nhat Nam");
        System.out.println("Kiem Tra So Doi Xung");
        Scanner kb = new Scanner(System.in);
        do {
            System.out.print("Nhap So Nguyen > 0: ");
            n = kb.nextInt();
        } while (n < 0);
    }

    int kiemTra(int x) {
        if (x >= 0 && x < 10) {
            return 0;
        }
        
        int soGoc = x;
        int soDaoNguoc = 0;
        while (x > 0) {
            int phanDu = x % 10;
            soDaoNguoc = soDaoNguoc * 10 + phanDu;
            x = x / 10;
        }
        if (soGoc == soDaoNguoc) {
            return 1;
        } else {
            return 0;
        }
    }

    void output() {
        int ketQua = kiemTra(n);
        if (ketQua == 1) {
            System.out.println(n + " la so doi xung.");
        } else {
            System.out.println(n + " khong phai la so doi xung.");
        }
    }

    public static void main(String[] args) {
        kiemTraSoDoiXung a = new kiemTraSoDoiXung();
        a.input();
        a.output();
    }
}