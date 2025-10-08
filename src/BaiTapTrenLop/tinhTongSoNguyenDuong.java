package BaiTapTrenLop;

import java.util.Scanner;

public class tinhTongSoNguyenDuong {

    int n;

    void input() {
        System.out.println("Vo Nhat Nam");
        System.out.println("Tinh tong cac chu so cua 1 so nguyen duong.");
        do {
            System.out.print("Nhap so nguyen > 0: ");
            Scanner kb = new Scanner(System.in);
            n = kb.nextInt();
        } while (n < 0);
    }

    int tinhTong(int x) {
        int s = 0;
        while (x != 0) {
            int donVi = x % 10;
            x = x / 10;
            s = s + donVi;
        }
        return s;
    }

    void output() {
        int n1 = n;
        System.out.print("Tong = ");
        while (n1 != 0) {
            int donVi = n1 % 10;
            System.out.print(" " + donVi + " +");
            n1 = n1 / 10;
        }
        System.out.println("\b= "+tinhTong(n));
    }

    public static void main(String[] args) {
        tinhTongSoNguyenDuong a = new tinhTongSoNguyenDuong();
        a.input();
        a.output();
    }
}
