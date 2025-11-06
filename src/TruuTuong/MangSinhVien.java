package TruuTuong;

import java.io.File;
import java.util.*;

public class MangSinhVien {
    private ArrayList<SinhVien> a = new ArrayList<>();

    public void docFile(String tenFile) {
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                System.out.println("Da mo file");
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
                System.out.println("Mo file that bai");
            }
        } catch (Exception e) {

        }
    }

    public void lietKe(String cauNhac, ArrayList<SinhVien> b) {
        System.out.println(cauNhac);
        for (SinhVien x : b) {
            System.out.println(x);
        }
    }

    public ArrayList<SinhVien> tachNganh(String tenNganh) {
        ArrayList<SinhVien> b = new ArrayList<>();
        for (SinhVien x : a) {
            if (x.getClass().getSimpleName().equalsIgnoreCase(tenNganh)) {
                b.add(x);
            }
        }
        return b;
    }

    public double tinhDTBChung() {
        double s = 0;
        for (SinhVien x : a) {
            s += x.tinhDTB();
        }
        return s / a.size();
    }

    public double tinhDTBTheoNganh(String tenNganh) {
        ArrayList<SinhVien> ds = tachNganh(tenNganh);
        if (ds.isEmpty()) return 0;
        double tong = 0;
        for (SinhVien x : ds) {
            tong += x.tinhDTB();
        }
        return tong / ds.size();
    }

    public int demSVGioiTheoNganh(String tenNganh) {
        int dem = 0;
        for (SinhVien x : a) {
            if (x.getClass().getSimpleName().equalsIgnoreCase(tenNganh)
                    && x.tinhDTB() >= 8.0) {
                dem++;
            }
        }
        return dem;
    }

    public void xacDinhViThuTheoNganh(String tenNganh) {
        ArrayList<SinhVien> ds = tachNganh(tenNganh);

        System.out.println("\nVị thứ sinh viên ngành " + tenNganh + ":");

        for (SinhVien sv : ds) {
            int thuHang = 1;
            for (SinhVien x : ds) {
                if (x.tinhDTB() > sv.tinhDTB()) {
                    thuHang++;
                }
            }
            System.out.println(sv + "Thứ: " + thuHang);
        }
    }

    public double tinhDTBTheoGioiTinh(boolean gT) {
        double s = 0, dem = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).isGioiTinh() == gT) {
                s += a.get(i).tinhDTB();
                dem++;
            }
        }
        if (dem == 0) {
            return 0;
        }
        return s / dem;
    }

    public void lietKeDanhSachSinhVienNhanHocBong() {
        System.out.println("\nDSSV Nhan Duoc Hoc Bong");
        int dem = 0;
        for (SinhVien sv : a) {
            if (sv.tinhDTB() > 8.0) {
                double mon2 = 0;
                if (sv instanceof CNTT) {
                    mon2 = ((CNTT) sv).getCss();
                } else if (sv instanceof KinhTe) {
                    mon2 = ((KinhTe) sv).getMarketing();
                }
                if (mon2 >= 7.5) {
                    System.out.println(sv);
                    dem++;
                }
            }
        }
        if (dem == 0) {
            System.out.println("Không có sinh viên nào đạt học bổng.");
        }
    }


    public void output() {
        lietKe("DSSV Vua Doc Tu FILE", a);
        lietKe("\nDSSV theo nganh CNTT", tachNganh("CNTT"));
        lietKe("\nDSSV theo nganh KinhTe", tachNganh("KinhTe"));
        System.out.println("\nĐiểm Trung Bình Chung: " + tinhDTBChung());
        System.out.println("\nĐiểm TB ngành CNTT: " + tinhDTBTheoNganh("CNTT"));
        System.out.println("\nĐiểm TB ngành Kinh Tế: " + tinhDTBTheoNganh("KinhTe"));
        System.out.println("\nSố SV Giỏi Ngành Kinh Tế: " + demSVGioiTheoNganh("KinhTe"));
        System.out.println("\nXác Định Vị Thứ");
        xacDinhViThuTheoNganh("CNTT");
        xacDinhViThuTheoNganh("KinhTe");
        System.out.println("\nĐiểm Trung Bình Của Nam: " + tinhDTBTheoGioiTinh(true));
        System.out.println("\nĐiểm Trung Bình Của Nữ: " + tinhDTBTheoGioiTinh(false));
        System.out.println("\nSố SV Giỏi Ngành CNTT: " + demSVGioiTheoNganh("CNTT"));
        System.out.println("\nSố SV Giỏi Ngành Kinh Tế: " + demSVGioiTheoNganh("KinhTe"));
        lietKe("\nDSSV theo nganh CNTT", tachNganh("CNTT"));
        lietKe("\nDSSV theo nganh KinhTe", tachNganh("KinhTe"));
        lietKeDanhSachSinhVienNhanHocBong();
    }

    public static void main(String[] args) {
        MangSinhVien a = new MangSinhVien();
        a.docFile("CNTT_KT.txt");
        a.output();
    }
}
