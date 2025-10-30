package ThuaKe;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MangSinhVien {
    private ArrayList<SinhVien> a = new ArrayList<SinhVien>();

    public void docFIle(String tenFile) {
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                System.out.println("Da mo FILE");
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    String line = read.nextLine();
                    String s[] = line.split(",");
                    boolean gT = Boolean.parseBoolean(s[2].trim());
                    double mon1 = Double.parseDouble(s[3].trim());
                    double mon2 = Double.parseDouble(s[4].trim());
                    if (s.length == 5) {
                        a.add(new KinhTe(s[0], s[1], gT, mon1, mon2));
                    } else {
                        double html = Double.parseDouble(s[5].trim());
                        a.add(new CNTT(s[0], s[1], gT, mon1, mon2, html));
                    }

                }
            } else {
                System.out.println("File khong ton tai");
            }
        } catch (Exception e) {
        }
    }

    public void lietKe(String cauNhac) {
        System.out.println(cauNhac);
        for (SinhVien x : a) {
            System.out.println(x);
        }
    }

    public double diemTBTheoGioiTinh(boolean gT) {
        double s = 0, dem = 0;
        for (SinhVien x : a) {
            if (x.isGioiTinh() == gT) {
                if (x instanceof CNTT) {
                    s += ((CNTT) x).tinhDiemTB();
                }
                if (x instanceof KinhTe) {
                    s += ((KinhTe) x).tinhDiemTB();
                }
                dem++;
            }
        }
        if (dem == 0) {
            return 0;
        }
        return s / dem;
    }

    public double tinhDTBTheoHocSinhKha(String xL) {
        double s = 0, dem = 0;
        for (SinhVien x : a) {
            if (x instanceof CNTT) {
                if (((CNTT) x).xepLoai().equalsIgnoreCase(xL)) {
                    s += ((CNTT) x).tinhDiemTB();
                    dem++;
                }
            }
            if (x instanceof KinhTe) {
                if (((KinhTe) x).xepLoai().equalsIgnoreCase(xL)) {
                    s += ((KinhTe) x).tinhDiemTB();
                    dem++;
                }
            }
        }
        if (dem == 0) {
            return 0;
        }
        return s / dem;
    }

    public void sapXepTangDanTheoDTB() {
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = i + 1; j < a.size(); j++) {
                double diemA = 0, diemB = 0;
                if (a.get(i) instanceof CNTT) {
                    diemA = ((CNTT) a.get(i)).tinhDiemTB();
                }
                if (a.get(i) instanceof KinhTe) {
                    diemA = ((KinhTe) a.get(i)).tinhDiemTB();
                }
                if (a.get(j) instanceof CNTT) {
                    diemB = ((CNTT) a.get(j)).tinhDiemTB();
                }
                if (a.get(j) instanceof KinhTe) {
                    diemB = ((KinhTe) a.get(j)).tinhDiemTB();
                }
                if (diemA > diemB) {
                    SinhVien temp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, temp);
                }
            }
        }
    }

    public int demGioi() {
        int dem = 0;
        for (SinhVien x : a) {
            if (x instanceof CNTT) {
                if (((CNTT) x).xepLoai().equalsIgnoreCase("Gioi")) {
                    dem++;
                }
            }
            if (x instanceof KinhTe) {
                if (((KinhTe) x).xepLoai().equalsIgnoreCase("Gioi")) {
                    dem++;
                }
            }
        }
        return dem;
    }

    public void xacDInhViThu() {
        for (int i = 0; i < a.size(); i++) {
            int dem = 0;
            double diemA = 0, diemB = 0;
            if (a.get(i) instanceof CNTT) {
                diemA = ((CNTT) a.get(i)).tinhDiemTB();
            }
            if (a.get(i) instanceof KinhTe) {
                diemA = ((KinhTe) a.get(i)).tinhDiemTB();
            }
            for (int j = 0; j < a.size(); j++) {
                if (a.get(j) instanceof CNTT) {
                    diemB = ((CNTT) a.get(j)).tinhDiemTB();
                }
                if (a.get(j) instanceof KinhTe) {
                    diemB = ((KinhTe) a.get(j)).tinhDiemTB();
                }
                if (diemA > diemB) {
                    dem++;
                }
            }
            System.out.println(a.get(i).getMa() + ", " + a.get(i).getHoTen() + ", Thu: " + (dem + 1));
        }
    }

    public void output() {
        lietKe("DSSV Vua Doc Tu File");
        System.out.println("Tinh Diem Trung Binh Theo Gioi Tinh");
        System.out.println("Nam = " + diemTBTheoGioiTinh(true));
        System.out.println("Nu = " + diemTBTheoGioiTinh(false));
        System.out.println("Tinh Diem Trung Binh Theo Hoc Sinh Kha: " + tinhDTBTheoHocSinhKha("Kha"));
        sapXepTangDanTheoDTB();
        lietKe("DSSV Sau Khi Sap Xep");
        System.out.println("Dem Hoc Sinh Gioi: " + demGioi());
        System.out.println("Xac Dinh Vi Thu");
        xacDInhViThu();
    }

    public static void main(String[] args) {
        MangSinhVien a = new MangSinhVien();
        a.docFIle("CNTT_KT.txt");
        a.output();
    }
}
