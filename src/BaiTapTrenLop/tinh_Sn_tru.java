
package BaiTapTrenLop;

import java.util.Scanner;

public class tinh_Sn_tru {

    Scanner kb = new Scanner(System.in);
    int n;

    void input() {
        System.out.println("Tinh tru S(n) = 1 - 1/2 + 1/3 - ...");
        do {
            System.out.print("Nhap n > 0: ");
            n = kb.nextInt();
        } while (n <= 0);
    }

    double tinhTong(int x) {
        double s = 0;
        for (int i = 1; i <= x; i++) {
            if(i % 2 != 0) {
               s = s + 1.0 / i; 
            } else {
                s = s - 1.0 / i;
            }
        }
        return s;
    }

    void output() {
        System.out.print("S("+n+")= ");
        for (int i = 1; i <= n; i++) {
            System.out.print("1/"+i+" +");
        }
        System.out.println("\b= "+ tinhTong(n));
    }

    public static void main(String[] args) {
        tinh_Sn_tru a = new tinh_Sn_tru();
        System.out.println("Van Viet Huy");
        a.input();
        a.output();

    }
}
