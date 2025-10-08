package BaiTapTrenLop;

import java.util.Scanner;

public class timSoDaoNguocCuaMotSoNguyenDuong {

    int n;

    void input() {
        System.out.println("Vo Nhat Nam");
        System.out.println("Tim So Dao Nguoc Cua Mot So Nguyen Duong.");
        do {
            System.out.print("Nhap so nguyen > 0: ");
            Scanner kb = new Scanner(System.in);
            n = kb.nextInt();
        } while (n < 0);
    }

    int soDaoNguoc(int x) {
        int s = 0;
        while (x != 0) {
            int donVi = x % 10;
            s = s * 10 + donVi;
            x = x/10;
        }
        return s;
    }

    void output() {
        System.out.println("So dao nguoc cua "+n+" la: "+soDaoNguoc(n));
    }

    public static void main(String[] args) {
        timSoDaoNguocCuaMotSoNguyenDuong a = new timSoDaoNguocCuaMotSoNguyenDuong();
        a.input();
        a.output();
    }
}
