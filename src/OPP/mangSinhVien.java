package OPP;

import java.util.ArrayList;

public class mangSinhVien {
    private ArrayList<SinhVien> a = new ArrayList<>();

    public void taoDS() {
        a.add(new SinhVien("sv001", "Bao Cong", true, "1/1/2000", "Da Nang", 8.9, 7.6, 7, 9));
        a.add(new SinhVien("sv002", "Cong Ton Sach", true, "12/13/2001", "Nghe An", 9.2, 8.6, 9, 4));
        a.add(new SinhVien("sv003", "Hoang Thuong", true, "10/10/2004", "Quang Nam", 4.5, 4.6, 2, 8));
        a.add(new SinhVien("sv004", "Ly Nuong Nuong", false, "11/11/2003", "Hue", 5.6, 2.6, 7.5, 4.9));
        a.add(new SinhVien("sv005", "Trien Chieu", true, "5/5/2002", "Nghe An", 8.9, 6.6, 7, 8));
        a.add(new SinhVien("sv006", "Hoang Hau", false, "21/2/2002", "Hue", 9.5, 7.4, 8.9, 9.4));
        a.add(new SinhVien("sv007", "Vuong Trieu", true, "11/2/2001", "Nghe An", 8.2, 8.6, 7.5, 9.2));
    }

    public void lietKe() {
        for (SinhVien x : a) {
            System.out.println(x);
        }
    }

    public double tinhDiemTrungBinhTheoGioi(boolean gT) {
        double s = 0, dem = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).isGioiTinh() == gT) {
                s = s + a.get(i).tinhDiemTrungBinh();
                dem++;
            }
        }
        if (dem == 0) {
            return 0;
        }
        return s / dem;
    }

    public double tinhDiemTrungBinhTheoQueQuan(String qQ) {
        double s = 0, dem = 0;
        for (SinhVien x : a) {
            if (x.getQueQuan().equalsIgnoreCase(qQ)) {
                s = s + x.tinhDiemTrungBinh();
                dem++;
            }
        }
        if (dem == 0) {
            return 0;
        }
        return s / dem;
    }

    public double tinhDiemTBChung() {
        double tong = 0;
        for (SinhVien x : a) {
            tong += x.tinhDiemTrungBinh();
        }
        return tong / a.size();
    }

    public ArrayList<SinhVien> loaiSinhVien() {
        double dtbChung = tinhDiemTBChung();
        ArrayList<SinhVien> dsConLai = new ArrayList<>();

        for (SinhVien x : a) {
            if (x.tinhDiemTrungBinh() >= dtbChung) {
                dsConLai.add(x);
            }
        }
        return dsConLai;
    }

    public ArrayList<SinhVien> sapXepGiamDanTheoDiem() {
        ArrayList<SinhVien> dsSapXep = new ArrayList<>(a);
        for (int i = 0; i < dsSapXep.size() - 1; i++) {
            for (int j = i + 1; j < dsSapXep.size(); j++) {
                if (dsSapXep.get(i).tinhDiemTrungBinh() < dsSapXep.get(j).tinhDiemTrungBinh()) {
                    SinhVien temp = dsSapXep.get(i);
                    dsSapXep.set(i, dsSapXep.get(j));
                    dsSapXep.set(j, temp);
                }
            }
        }

        return dsSapXep;
    }

    public ArrayList<SinhVien> xacDinhViTri() {
        return sapXepGiamDanTheoDiem();
    }

    public void output() {
        System.out.println("DSSV vua duoc tao");
        lietKe();
        System.out.println("C. Diem TB Nam: " + tinhDiemTrungBinhTheoGioi(true));
        System.out.println("C. Diem TB Nu: " + tinhDiemTrungBinhTheoGioi(false));
        System.out.println("D. Diem TB Theo Da Nang: " + tinhDiemTrungBinhTheoQueQuan("Da Nang"));
        System.out.println("D. Diem TB Theo Nghe An: " + tinhDiemTrungBinhTheoQueQuan("Nghe An"));
        System.out.println("D. Diem TB Theo Quang Nam: " + tinhDiemTrungBinhTheoQueQuan("Quang Nam"));
        System.out.println("D. Diem TB Theo Hue: " + tinhDiemTrungBinhTheoQueQuan("Hue"));
        System.out.println("E. Danh sach sinh vien con lai sau khi loai:");
        ArrayList<SinhVien> dsConLai = loaiSinhVien();
        for (SinhVien x : dsConLai) {
            System.out.println(x);
        }
        System.out.println("F. Sap xep sinh vien giam dan theo diem:");
        ArrayList<SinhVien> dsSapXep = sapXepGiamDanTheoDiem();
        for (SinhVien x : dsSapXep) {
            System.out.println(x.getMa() + " - " + x.getHoTen() + ": " +
                    x.tinhDiemTrungBinh() + " (" + x.xepLoai() + ")");
        }
        System.out.println("\nG. Xac dinh vi tri thu cua moi sinh vien:");
        ArrayList<SinhVien> dsXepHang = xacDinhViTri();
        for (int i = 0; i < dsXepHang.size(); i++) {
            SinhVien x = dsXepHang.get(i);
            System.out.println("Thu " + (i + 1) + ": " + x.getMa() + " - " +
                    x.getHoTen() + " (" + x.tinhDiemTrungBinh() + ")");
        }
    }

    public static void main(String[] args) {
        mangSinhVien a = new mangSinhVien();
        a.taoDS();
        a.output();
    }
}
