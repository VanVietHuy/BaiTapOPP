package BaiTapTrenLop;

import java.util.Scanner;

public class tinhToanHaiPhanSo {

    int a, b,mau1,mau2;

    void input() {
        System.out.println("Van Viet Huy");
        System.out.println("Tinh Toan tren 2 phan so.");
        System.out.print("Nhap tu 1: ");
        Scanner kb = new Scanner(System.in);
        a = kb.nextInt();
        System.out.print("Nhap mau 1: ");
        mau1 = kb.nextInt();
        System.out.print("Nhap tu 2: ");
        b = kb.nextInt();
        System.out.print("Nhap mau 2: ");
        mau2 = kb.nextInt();
    }

    void output() {
        System.out.println("Tong: " + (a * mau2 + b * mau1) + "/" + mau1 * mau2);
        System.out.println("Hieu: " + (a * mau2 - b * mau1) + "/" + mau1 * mau2);
        System.out.println("Tich: " + a * b + "/" + mau1 * mau2);
        System.out.println("Thuong: " + (a * mau2) + "/" + b * mau1);
    }

    public static void main(String[] agrs) {
        tinhToanHaiPhanSo a = new tinhToanHaiPhanSo();
        a.input();
        a.output();
    }
}
