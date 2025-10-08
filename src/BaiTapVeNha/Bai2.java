package BaiTapVeNha;

import java.util.Scanner;

public class Bai2 {

    int A, B;

    void input() {        
        System.out.println("Pham Tai Bac");
        System.out.println("Giai Ax + B = 0");
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap A: ");
        A = kb.nextInt();
        System.out.print("Nhap B: ");
        B = kb.nextInt();
    }

    void output() {
        if (A == 0) {
            if (B == 0) {
                System.out.println("Vo so nghiem");
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            double X = (double) -B / A;
            System.out.println("X = " + X);
        }
    }

    public static void main(String[] args) {
        Bai2 a = new Bai2();
        a.input();
        a.output();
    }
}
