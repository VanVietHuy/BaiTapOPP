package BaiTapTrenLop;

import java.util.Scanner;

public class tinhTongSoNguyenDuongChan {

    int n;

    void input() {
        System.out.println("Vo Nhat Nam");
        System.out.println("Tinh Tong Cac Chu So Chan Cua Mot So Nguyen Duong");
        Scanner kb = new Scanner(System.in);
        do {
            System.out.print("Nhap So Nguyen > 0: ");
            n = kb.nextInt();
        } while (n < 0);
    }

    int tinhTong(int x) {
        int s = 0;
        while (x > 0) {
            int donVi = x % 10;
            if (donVi % 2 == 0) {
                s = s + donVi;
            }
            x = x / 10;
        }
        return s;
    }

    void output() {
        int ketQua = tinhTong(n);
        System.out.println("Tong cac chu so chan cua " + n + " la: " + ketQua);
    }

    public static void main(String[] args) {
        tinhTongSoNguyenDuongChan a = new tinhTongSoNguyenDuongChan();
        a.input();
        a.output();
    }
}