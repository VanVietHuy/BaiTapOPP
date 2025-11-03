package QuanLySVGV;

import java.util.ArrayList;
import java.util.Scanner;


public class DanhSach {
    private ArrayList<Nguoi> a = new ArrayList<>();

    public void nhapTT() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhập số lượng người: ");
        int n = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Người thứ " + (i + 1) + ":");
            System.out.print("1. Sinh viên chọn 1.\n  Giảng viên chọn 2\nChọn (1/2) để nhập: ");
            int loai;
            while (true) {
                String s = kb.nextLine().trim();
                if (s.equals("1") || s.equals("2")) {
                    loai = Integer.parseInt(s);
                    break;
                }
                System.out.print("Chỉ nhập 1 hoặc 2. Chọn lại: ");
            }
            if (loai == 1) {
                System.out.print("Ma: ");
                String ma = kb.nextLine();
                System.out.print("Ho Ten: ");
                String hoTen = kb.nextLine();
                System.out.print("Ngay Sinh: ");
                String ngaySinh = kb.nextLine();
                System.out.print("Gioi Tinh: ");
                boolean gioiTinh = Boolean.parseBoolean(kb.nextLine());
                System.out.print("Điểm môn 1: ");
                double mon1 = Double.parseDouble(kb.nextLine());
                System.out.print("Điểm môn 2: ");
                double mon2 = Double.parseDouble(kb.nextLine());
                System.out.print("Điểm môn 3: ");
                double mon3 = Double.parseDouble(kb.nextLine());
                SinhVien sv = new SinhVien(ma, hoTen, ngaySinh, gioiTinh, mon1, mon2, mon3);
                a.add(sv);
            }
            if (loai == 2) {
                System.out.print("Ma: ");
                String ma = kb.nextLine();
                System.out.print("Ho Ten: ");
                String hoTen = kb.nextLine();
                System.out.print("Ngay Sinh: ");
                String ngaySinh = kb.nextLine();
                System.out.print("Gioi Tinh: ");
                boolean gioiTinh = Boolean.parseBoolean(kb.nextLine());
                System.out.print("Môn Dạy: ");
                String monDay = kb.nextLine();
                System.out.print("Số Giờ: ");
                double soGio = Double.parseDouble(kb.nextLine());
                System.out.print("Don Gia: ");
                double donGia = Double.parseDouble(kb.nextLine());
                GiangVien gv = new GiangVien(ma, hoTen, ngaySinh, gioiTinh, monDay, soGio, donGia);
                a.add(gv);
            }
        }
    }

    public void lietKe(String cauNhac, ArrayList<Nguoi> b) {
        System.out.println(cauNhac);
        for (Nguoi x : b) {
            System.out.println(x);
        }
    }

    public int demSinhVien(ArrayList<Nguoi> b) {
        int dem = 0;
        for (Nguoi x : b) {
            if (x instanceof SinhVien) {
                dem++;
            }
        }
        return dem;
    }

    public int demGiangVien(ArrayList<Nguoi> b) {
        int dem = 0;
        for (Nguoi x : b) {
            if (x instanceof GiangVien) {
                dem++;
            }
        }
        return dem;
    }

    public double sVDTBCaoNhat(ArrayList<Nguoi> b) {
        double max = 0;
        for (Nguoi x : b) {
            if (x instanceof SinhVien) {
                SinhVien sv = (SinhVien) x;
                double dTB = sv.tinhDTB();
                if (dTB > max) {
                    max = dTB;
                }
            }
        }
        return max;
    }

    public double tongThanhTienGiangVien(ArrayList<Nguoi> b) {
        double sum = 0.0;
        for (Nguoi x : b) {
            if (x instanceof GiangVien) {
                GiangVien gv = (GiangVien) x;
                sum += gv.thanhTien();
            }
        }
        return sum;
    }

    public void sapXep(ArrayList<Nguoi> b) {
        ArrayList<SinhVien> svList = new ArrayList<>();
        ArrayList<GiangVien> gvList = new ArrayList<>();

        for (Nguoi x : b) {
            if (x instanceof SinhVien) {
                svList.add((SinhVien) x);
            } else if (x instanceof GiangVien) {
                gvList.add((GiangVien) x);
            }
        }

        for (int i = 0; i < svList.size() - 1; i++) {
            for (int j = i + 1; j < svList.size(); j++) {
                if (svList.get(i).tinhDTB() > svList.get(j).tinhDTB()) {
                    SinhVien tam = svList.get(i);
                    svList.set(i, svList.get(j));
                    svList.set(j, tam);
                }
            }
        }

        for (int i = 0; i < gvList.size() - 1; i++) {
            for (int j = i + 1; j < gvList.size(); j++) {
                if (gvList.get(i).thanhTien() < gvList.get(j).thanhTien()) {
                    GiangVien tam = gvList.get(i);
                    gvList.set(i, gvList.get(j));
                    gvList.set(j, tam);
                }
            }
        }

        System.out.println("\n--- Danh sách sinh viên (tăng dần theo điểm TB) ---");
        for (SinhVien sv : svList) {
            System.out.println(sv);
        }

        System.out.println("\n--- Danh sách giảng viên (giảm dần theo thành tiền) ---");
        for (GiangVien gv : gvList) {
            System.out.println(gv);
        }
    }

    public void output() {
        lietKe("DS Nguoi Vua Nhap", a);
        System.out.println("Số Sinh Viên Có Trong Danh Sách: " + demSinhVien(a));
        System.out.println("Số Giảng Viên Có Trong Danh Sách: " + demGiangVien(a));
        System.out.println("Sinh Vien Điểm Trung Bình Cao Nhat: " + sVDTBCaoNhat(a));
        System.out.println("Tong Tien Giang Vien: " + tongThanhTienGiangVien(a));
        sapXep(a);
    }

    public static void main(String[] args) {
        DanhSach a = new DanhSach();
        a.nhapTT();
        a.output();
    }
}
