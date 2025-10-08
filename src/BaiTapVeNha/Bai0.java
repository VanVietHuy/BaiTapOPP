package BaiTapVeNha;

import java.util.Scanner;

public class Bai0 {

    int a, b, c;

    void input() {
        System.out.println("Pham Tai Bac");
        System.out.println("Tim Max cua 3 so nguyen");
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap vao 3 so nguyen: ");
        a = kb.nextInt();
        b = kb.nextInt();
        c = kb.nextInt();
    }

    void output() {
        int max = (a > b) ? a : b;
        if (max < c) {
            max = c;
        }
        System.out.println("So lon nhat trong 3 so la: " + max);
    }

    public static void main(String[] args) {
        Bai0 a = new Bai0();
        a.input();
        a.output();
    }
}
