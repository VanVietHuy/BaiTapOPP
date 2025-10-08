package BaiTapVeNha;

import java.util.Scanner;

public class Bai1 {

    int a, b, c, d;

    void input() {
        System.out.println("Pham Tai Bac");
        System.out.println("Tim Max cua 4 so nguyen");
        System.out.print("Nhap vao 4 so nguyen: ");
        Scanner kb = new Scanner(System.in);
        a = kb.nextInt();
        b = kb.nextInt();
        c = kb.nextInt();
        d = kb.nextInt();
    }

    void output() {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        System.out.println("So lon nhat trong 4 so la: " + max);
    }

    public static void main(String[] args) {
        Bai1 a = new Bai1();
        a.input();
        a.output();
    }
}
