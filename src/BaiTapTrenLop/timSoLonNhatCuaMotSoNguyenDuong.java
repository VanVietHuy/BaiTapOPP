package BaiTapTrenLop;

import java.util.Scanner;

public class timSoLonNhatCuaMotSoNguyenDuong {

    int n;

    void input() {
        System.out.println("Vo Nhat Nam");
        System.out.println("Tim So Lon Nhat Cua 1 So Nguyen Duong.");
        do {
            System.out.print("Nhap so nguyen > 0: ");
            Scanner kb = new Scanner(System.in);
            n = kb.nextInt();
        } while (n < 0);
    }

    int timSoLonNhat(int x) {
        int max = -1;
        while (x != 0) {
            int donVi = x % 10;
            if (max < donVi) {
                max = donVi;
            }
            x = x / 10;
        }
        return max;
    }

    void output() {
        System.out.println("Max = "+timSoLonNhat(n));
    }

    public static void main(String[] args) {
        timSoLonNhatCuaMotSoNguyenDuong a = new timSoLonNhatCuaMotSoNguyenDuong();
        a.input();
        a.output();
    }
}