package MangVaArrayList;

import java.util.*;

public class thucHanhVeMang {
    ArrayList<Integer> a = new ArrayList<>();
    Scanner kb = new Scanner(System.in);
    int n;

    void input() {
        System.out.println("Vo Nhat Nam");
        do {
            System.out.print("1. Nhap so phan tu mang > 0: ");
            n = kb.nextInt();
        } while (n <= 0);
        for (int i = 0; i < n; i++) {
            a.add((int) (Math.random() * 100));
        }
    }

    void lietKe() {
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println("");
    }

    int timMax() {
        int x = a.get(0);
        for (int i = 1; i < n; i++) {
            if (x < a.get(i)) {
                x = a.get(i);
            }
        }
        return x;
    }

    int timMin() {
        int x = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (x > a.get(i)) {
                x = a.get(i);
            }
        }
        return x;
    }

    int tongCacSoChan() {
        int s = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) {
                s += a.get(i);
            }
        }
        return s;
    }

    int timTongMax() {
        int maxSum = a.get(0) + a.get(1);
        for (int i = 1; i < a.size() - 1; i++) {
            int sum = a.get(i) + a.get(i + 1);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    void chenPtu() {
        int x, k;
        System.out.print("6. Nhap gia tri va chi so can chen: ");
        x = kb.nextInt();
        k = kb.nextInt();
        a.add(k, x);
        System.out.print("Mang vua chen xong: ");
        lietKe();
    }

    void xoaPtu() {
        int x;
        System.out.print("7. Nhap chi so can xoa: ");
        x = kb.nextInt();
        a.remove(x);
        System.out.print("Mang vua xoa xong: ");
        lietKe();
    }

    void sapXepMang() {
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i) > a.get(j)) {
                    int tmp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, tmp);
                }
            }
        }
        System.out.print("Mang sau khi sap xep la: ");
        lietKe();
    }

    void output() {
        int hieu = timMax() - timMin();
        System.out.print("Mang vua tao ngau nhien la: ");
        lietKe();
        System.out.println("2. Max: " + timMax());
        System.out.println("3. Max - Min: " + timMax() + "-" + timMin() + "= " + hieu);
        System.out.println("4. Tong 2 so lien tiep co tong lon nhat: " + timTongMax());
        System.out.println("5. Tong cac so chan: " + tongCacSoChan());
        chenPtu();
        xoaPtu();
        sapXepMang();
    }

    public static void main(String[] args) {
        thucHanhVeMang a = new thucHanhVeMang();
        a.input();
        a.output();
    }
}
