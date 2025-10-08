package BaiTapTrenLop;

import java.util.Scanner;

public class timHieuCuaHaiSoMaxMin {

    int n;

    void input() {
        System.out.println("Vo Nhat Nam");
        System.out.println("Tim Hieu Cua 2 So Max Min.");
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

    int timSoNhoNhat(int x) {
        int min = 9;
        while (x != 0) {
            int donVi = x % 10;
            if (min > donVi) {
                min = donVi;
            }
            x = x / 10;
        }
        return min;
    }

    int hieuHaiSo(int x) {
        int s = timSoLonNhat(n) - timSoNhoNhat(n);
        return s;
    }

    void output() {
        System.out.println("Max - Min:" + timSoLonNhat(n) + "-" + timSoNhoNhat(n) + "=" + hieuHaiSo(n));
    }

    public static void main(String[] args) {
        timHieuCuaHaiSoMaxMin a = new timHieuCuaHaiSoMaxMin();
        a.input();
        a.output();
    }
}
