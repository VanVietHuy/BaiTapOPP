package KhoiSinhVien;

import java.io.File;
import java.util.*;

public class DanhSachHocSinh {
    public ArrayList<HocSinh> a = new ArrayList<>();
    Scanner kb = new Scanner(System.in);

    public void docFile(String tenFile) {
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                System.out.println("Mo File Thanh Cong");
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    String line = read.nextLine();
                    String s[] = line.split(", ");
                    boolean gT = Boolean.parseBoolean(s[3].trim());
                    double mon1 = Double.parseDouble(s[5].trim());
                    double mon2 = Double.parseDouble(s[6].trim());
                    double mon3 = Double.parseDouble(s[7].trim());

                    if (s[4].equalsIgnoreCase("A")) {
                        a.add(new KhoiA(s[0], s[1], s[2], gT, s[4], mon1, mon2, mon3));
                    } else {
                        a.add(new KhoiD(s[0], s[1], s[2], gT, s[4], mon1, mon2, mon3));
                    }
                }
            } else {
                System.out.println("File loi");
            }
        } catch (Exception e) {

        }
    }

    public void lietKe(String cauNhac, ArrayList<HocSinh> a) {
        System.out.println(cauNhac);
        for (HocSinh x : a) {
            System.out.println(x);
        }
    }

    public ArrayList<HocSinh> tachKhoi(String tenKhoi) {
        ArrayList<HocSinh> b = new ArrayList<>();
        for (HocSinh x : a) {
            if (x.getClass().getSimpleName().equalsIgnoreCase(tenKhoi)) {
                b.add(x);
            }
        }
        return b;
    }

    public void timKiemHocSinhTheoMa(String maCanTim) {
        boolean timThay = false;
        for (HocSinh x : a) {
            if (x.getMaHocSinh().trim().equalsIgnoreCase(maCanTim.trim())) {
                System.out.println("Hoc Sinh Can Tim: " + x);
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Khong co hoc sinh ma " + maCanTim + " ton tai");
        }
    }

    public double tinhDTBChungTheoKhoi(String tenKhoi) {
        ArrayList<HocSinh> ds = tachKhoi(tenKhoi);
        double s = 0;
        for (HocSinh x : ds) {
            s += x.getDiemTrungBinh();
        }
        return s / ds.size();
    }

    public void dSSVNhanHocBong() {
        System.out.println("DS Hoc Sinh Nhan Hoc Bong");
        int dem = 0;
        for (HocSinh x : a) {
            if (x.getDiemTrungBinh() > 9.0) {
                double mon2 = 0.0;
                if (x instanceof KhoiA) {
                    mon2 = x.getToan();
                } else if (x instanceof KhoiD) {
                    mon2 = x.getToan();
                }
                if (mon2 > 8.5) {
                    System.out.println(x);
                    dem++;
                }
            }
        }
        if (dem == 0) {
            System.out.println("Khong co hoc sinh nao nhan hoc bong");
        }
    }

    public void output() {
        lietKe("DS Hoc Sinh Vua Doc Tu File", a);
        System.out.print("Nhap Ma Hoc Sinh Can Tim: ");
        String ma = kb.nextLine();
        timKiemHocSinhTheoMa(ma);
        System.out.println("Diem Trung Binh Khoi A: " + tinhDTBChungTheoKhoi("KhoiA"));
        System.out.println("Diem Trung Binh Khoi D: " + tinhDTBChungTheoKhoi("KhoiD"));
        dSSVNhanHocBong();
    }

    public static void main(String[] args) {
        DanhSachHocSinh a = new DanhSachHocSinh();
        a.docFile("THPT.txt");
        a.output();
    }
}
