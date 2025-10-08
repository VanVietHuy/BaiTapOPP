package BaiTapVeNha;

import java.util.Scanner;

public class Bai3 {

    int N;

    void input() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap vao so 9999 < N < 100000: ");
        N = kb.nextInt();
        if (N > 100000 || N < 9999) {
            System.out.println("So khong hop le vui long nhap lai");
            input();
        }
    }

    void output() {
        int a, b, c, d, e;
        int tongChan = 0;
        String dauCong = "";

        e = N % 10;
        d = (N / 10) % 10;
        c = (N / 100) % 10;
        b = (N / 1000) % 10;
        a = N / 10000;
        if (a % 2 == 0) {
            dauCong += a;
            tongChan += a;
        }
        if (b % 2 == 0) {
            if (a % 2 == 0) {
                dauCong += " + ";
            }
            dauCong += b;
            tongChan += b;
        }
        if (c % 2 == 0) {
            if (a % 2 == 0 || b % 2 == 0) {
                dauCong += " + ";
            }
            dauCong += c;
            tongChan += c;
        }
        if (d % 2 == 0) {
            if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
                dauCong += " + ";
            }
            dauCong += d;
            tongChan += d;
        }
        if (e % 2 == 0) {
            if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0 || d % 2 == 0) {
                dauCong += " + ";
            }
            dauCong += e;
            tongChan += e;
        }
        System.out.println("Tong cac so chan la: " + dauCong + " = " + tongChan);
    }

    public static void main(String[] args) {
        Bai3 a = new Bai3();
        System.out.println("Phong");
        System.out.println("Tinh tong cac chu so chan cua 1 so nguyen hang van");
        a.input();
        a.output();
    }
}
