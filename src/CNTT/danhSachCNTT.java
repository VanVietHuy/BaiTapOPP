package CNTT;

import OPP.SinhVien;

import java.io.File;
import java.util.*;

public class danhSachCNTT {
    private ArrayList<CNTT> a = new ArrayList<>();

    public void docFIle(String tenFile) {
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                System.out.println("Da mo FILE");
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    String line = read.nextLine();
                    String s[] = line.split(", ");
                    boolean gT = Boolean.parseBoolean(s[2].trim());
                    double java = Double.parseDouble(s[3].trim());
                    double css = Double.parseDouble(s[4]);
                    double html = Double.parseDouble(s[5]);
                    a.add(new CNTT(s[0], s[1], gT, java, css, html));
                }
            } else {
                System.out.println("File khong ton tai");
            }
        } catch (Exception e) {
            System.out.println("Loi doc file " + e.getMessage());
        }
    }

    public void lietKe(String cauNhac) {
        System.out.println(cauNhac);
        for (CNTT x : a) {
            System.out.println(x);
        }
        System.out.printf("\n");
    }
    public double tinhDiemTrungBinhChungTheoGioi(boolean gT) {
        double s = 0, dem = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).isGioiTinh() == gT) {
                s = s + a.get(i).getDiemTrungBinh();
                dem++;
            }
        }
        if (dem == 0) {
            return 0;
        }
        return s / dem;
    }
    public double tinhDiemTrungBinhCuaSinhVienKha(String xL) {
        double s = 0,dem = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getXepLoai().equalsIgnoreCase(xL)) {
                s += a.get(i).getDiemTrungBinh();
                dem++;
            }
        }
        if (dem == 0) {
            return 0;
        }
        return s / dem;
    }
    public ArrayList<CNTT> sapXepTangDanTheoDiem() {
        ArrayList<CNTT> dsSapXep = new ArrayList<>(a);
        for (int i = 0; i < dsSapXep.size() - 1; i++) {
            for (int j = i + 1; j < dsSapXep.size(); j++) {
                if (dsSapXep.get(i).getDiemTrungBinh() < dsSapXep.get(j).getDiemTrungBinh()) {
                    CNTT temp = dsSapXep.get(i);
                    dsSapXep.set(i, dsSapXep.get(j));
                    dsSapXep.set(j, temp);
                }
            }
        }

        return dsSapXep;
    }


    public int demGioi() {
        int dem = 0;
        for (CNTT x : a) {
            if (x.getXepLoai().trim().equalsIgnoreCase("Gioi")) {
                dem++;
            }
        }
        return dem;
    }

    public void xacDinhViThu() {
        System.out.println("=====F. Xac Dinh Vi Thu=====");
        for (int i = 0; i < a.size(); i++) {
            int dem = 0;
            for (int j = 0; j < a.size(); j++) {
                if (a.get(j).getDiemTrungBinh() > a.get(i).getDiemTrungBinh()) {
                    dem++;
                }
            }
            System.out.println("Thu: " + (dem + 1)+", " + a.get(i).getHoTen() + ", " + a.get(i).getDiemTrungBinh() + ", " + a.get(i).getXepLoai());
        }
    }

    public void output() {
        lietKe("DSSV CNTT Vua Doc Tu File");
        System.out.println("\n=====B. Tinh Diem Trung Binh Theo Gioi Tinh=====");
        System.out.println("Diem TB Nam: " + tinhDiemTrungBinhChungTheoGioi(true));
        System.out.println("Diem TB Nu: " + tinhDiemTrungBinhChungTheoGioi(false));
        System.out.println("\n=====C. Tinh Diem Trung Binh Chung Cua Sinh Vien Kha=====");
        System.out.println("Diem trung binh: "+tinhDiemTrungBinhCuaSinhVienKha("Kha"));
        System.out.println("\n=====F. Sap xep sinh vien tang dan theo diem=====");
        System.out.println("Danh sach: ");
        ArrayList<CNTT> dsSapXep = sapXepTangDanTheoDiem();
        for (CNTT x : dsSapXep) {
            System.out.println(x.getMa() + " - " + x.getHoTen() + ": " + x.getDiemTrungBinh() + x.getXepLoai());
        }
        System.out.println("\nE. So sinh vien hoc luc gioi: " + demGioi()+"\n");
        xacDinhViThu();
    }

    public static void main(String[] args) {
        danhSachCNTT a = new danhSachCNTT();
        a.docFIle("CNTT.txt");
        a.output();
    }
}
