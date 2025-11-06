package QuanLySieuThi;

import java.io.File;
import java.util.*;

public class DanhSachHangHoa {
    private ArrayList<HangHoa> a = new ArrayList<>();

    public void docFile(String tenFile) {
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                System.out.println("Mo File Thanh Cong");
                Scanner read = new Scanner(f);

                while (read.hasNextLine()) {
                    String line = read.nextLine();
                    String s[] = line.split(",");
                    if (s.length < 5) {
                        System.err.println("Dong loi (thieu truong): " + line);
                        continue;
                    }
                    String maHang = s[0].trim();
                    String[] dateParts = s[1].trim().split("/");
                    int ngay = Integer.parseInt(dateParts[0]);
                    int thang = Integer.parseInt(dateParts[1]);
                    int nam = Integer.parseInt(dateParts[2]);
                    double donGia = Double.parseDouble(s[2].trim());
                    int soLuong = Integer.parseInt(s[3].trim());
                    String thuocTinhCuoi = s[4].trim();
                    HangHoa hh = null;
                    if (thuocTinhCuoi.equalsIgnoreCase("Duy Tan") || thuocTinhCuoi.
                            equalsIgnoreCase("Nam Son") || thuocTinhCuoi.equalsIgnoreCase("Dien Luc")) {
                        hh = new HangThuCong(maHang, ngay, thang, nam, donGia, soLuong, thuocTinhCuoi);
                    } else {
                        hh = new HangDienMay(maHang, ngay, thang, nam, donGia, soLuong, thuocTinhCuoi);
                    }
                    a.add(hh);
                }
            } else {
                System.out.println("File khong ton tai");
            }
        } catch (Exception e) {
        }
    }

    public void timKiemVaInKetQua() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập mã hàng cần tìm: ");
        String maCanTim = sc.nextLine().trim();

        HangHoa ketQua = timKiemTheoMa(maCanTim);

        if (ketQua != null) {
            System.out.println("--- TÌM THẤY HÀNG HÓA ---");
            System.out.println(ketQua);
        } else {
            System.out.println("Không tìm thấy hàng hóa có mã: " + maCanTim);
        }
    }

    public HangHoa timKiemTheoMa(String maHang) {
        for (HangHoa hh : a) {
            if (hh.getMaHang().equalsIgnoreCase(maHang)) {
                return hh;
            }
        }
        return null;
    }

    public void themMoi() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- THÊM MỚI HÀNG HÓA ---");
        System.out.println("Chọn loại hàng (1: Hàng Điện Máy, 2: Hàng Thủ Công): ");
        int loai = sc.nextInt();
        sc.nextLine();

        String maHang;
        while (true) {
            System.out.print("Nhập mã hàng: ");
            maHang = sc.nextLine().trim();
            if (timKiemTheoMa(maHang) != null) {
                System.out.println("Lỗi: Mã hàng này đã tồn tại. Vui lòng nhập mã khác.");
            } else {
                break;
            }
        }
        System.out.print("Nhập ngày nhập: ");
        int ngay = sc.nextInt();
        System.out.print("Nhập tháng nhập: ");
        int thang = sc.nextInt();
        System.out.print("Nhập năm nhập: ");
        int nam = sc.nextInt();
        System.out.print("Nhập đơn giá: ");
        double donGia = sc.nextDouble();
        System.out.print("Nhập số lượng: ");
        int soLuong = sc.nextInt();
        sc.nextLine();
        HangHoa hh = null;
        if (loai == 1) {
            System.out.print("Nhập nơi sản xuất: ");
            String noiSanXuat = sc.nextLine().trim();
            hh = new HangDienMay(maHang, ngay, thang, nam, donGia, soLuong, noiSanXuat);
        } else if (loai == 2) {
            System.out.print("Nhập nhà sản xuất (ví dụ: Duy Tan...): ");
            String nhaSanXuat = sc.nextLine().trim();
            hh = new HangThuCong(maHang, ngay, thang, nam, donGia, soLuong, nhaSanXuat);
        } else {
            System.out.println("Lựa chọn không hợp lệ. Hủy thêm mới.");
            return;
        }
        this.a.add(hh);
        System.out.println("=> Đã thêm mới thành công mặt hàng có mã: " + maHang);
        lietKe("DS Hang Hoa Sau Khi Them", a);
    }

    public void lietKe(String cauNhac, ArrayList<HangHoa> a) {
        System.out.println(cauNhac);
        for (HangHoa x : a) {
            System.out.println(x);
        }
    }

    public ArrayList<HangHoa> tachHang(String tenHang) {
        ArrayList<HangHoa> b = new ArrayList<>();
        for (HangHoa x : a) {
            if (x.getClass().getSimpleName().equalsIgnoreCase(tenHang)) {
                b.add(x);
            }
        }
        return b;
    }

    public void inDSTheoTungLoai() {
        System.out.println("\n--- DANH SÁCH HÀNG ĐIỆN MÁY (TRONG NƯỚC) ---");
        for (HangHoa hh : a) {
            if (hh instanceof HangDienMay) {
                HangDienMay hdm = (HangDienMay) hh;
                if (hdm.getNoiSanXuat().equalsIgnoreCase("TN")) {
                    System.out.println(hdm);
                }
            }
        }

        System.out.println("\n--- DANH SÁCH HÀNG ĐIỆN MÁY (NHẬP KHẨU) ---");
        for (HangHoa hh : a) {
            if (hh instanceof HangDienMay) {
                HangDienMay hdm = (HangDienMay) hh;
                if (hdm.getNoiSanXuat().equalsIgnoreCase("NK")) {
                    System.out.println(hdm);
                }
            }
        }

        System.out.println("\n--- DANH SÁCH HÀNG THỦ CÔNG ---");
        for (HangHoa hh : a) {
            if (hh instanceof HangThuCong) {
                System.out.println(hh);
            }
        }
    }

    public void tinhTongThanhTienTheoLoai() {
        double tongTrongNuoc = 0;
        double tongNhapKhau = 0;
        double tongThuCong = 0;

        for (HangHoa hh : a) {
            if (hh instanceof HangDienMay) {
                HangDienMay hdm = (HangDienMay) hh;
                if (hdm.getNoiSanXuat().equalsIgnoreCase("NK")) {
                    tongNhapKhau += hdm.tinhThanhTien();
                } else {
                    tongTrongNuoc += hdm.tinhThanhTien();
                }
            } else if (hh instanceof HangThuCong) {
                tongThuCong += hh.tinhThanhTien();
            }
        }
        System.out.println("\n--- Tổng Tiền Hàng Theo Loại ---");
        System.out.printf("Tổng tiền Hàng Trong Nước: %,.2f VND\n", tongTrongNuoc);
        System.out.printf("Tổng tiền Hàng Nhập Khẩu: %,.2f VND\n", tongNhapKhau);
        System.out.printf("Tổng tiền Hàng Thủ Công: %,.2f VND\n", tongThuCong);
    }

    public void xoaTheoMa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập mã hàng cần xóa: ");
        String maCanXoa = sc.nextLine().trim();
        boolean removed = a.removeIf(hh -> hh.getMaHang().equalsIgnoreCase(maCanXoa));
        if (removed) {
            System.out.println("Đã xóa thành công : " + maCanXoa);
            lietKe("DS Hang Hoa Sau Khi Xoa", a);
        } else {
            System.out.println("Không tìm thấy mã: " + maCanXoa);
        }
    }

    public void timHoaDonThanhTienLonNhat() {
        if (a.isEmpty()) {
            System.out.println("Danh sách rỗng. Không thể tìm.");
            return;
        }
        HangHoa maxHoaDon = a.get(0);
        double maxThanhTien = maxHoaDon.tinhThanhTien();
        for (int i = 1; i < a.size(); i++) {
            HangHoa hhHienTai = a.get(i);
            double tienHienTai = hhHienTai.tinhThanhTien();
            if (tienHienTai > maxThanhTien) {
                maxThanhTien = tienHienTai;
                maxHoaDon = hhHienTai;
            }
        }
        System.out.println("\n--- HÓA ĐƠN CÓ THÀNH TIỀN LỚN NHẤT ---");
        System.out.println(maxHoaDon);
    }

    public void tinhTongTienTheoNgay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- TÍNH TỔNG TIỀN THEO NGÀY ---");
        System.out.print("Nhập ngày cần kiểm tra: ");
        int ngay = sc.nextInt();
        System.out.print("Nhập tháng cần kiểm tra: ");
        int thang = sc.nextInt();
        System.out.print("Nhập năm cần kiểm tra: ");
        int nam = sc.nextInt();
        sc.nextLine();

        double tongTien = 0;
        boolean timThay = false;

        for (HangHoa hh : a) {
            if (hh.getNgay() == ngay && hh.getThang() == thang && hh.getNam() == nam) {
                tongTien += hh.tinhThanhTien();
                timThay = true;
            }
        }
        String ngayKiemTra = ngay + "/" + thang + "/" + nam;
        if (timThay) {
            System.out.printf("Tổng thành tiền cho ngày %s là: %,.2f VND\n", ngayKiemTra, tongTien);
        } else {
            System.out.println("Không tìm thấy hóa đơn nào trong ngày " + ngayKiemTra);
        }
    }


    public void output() {
        themMoi();
        xoaTheoMa();
        timKiemVaInKetQua();
        inDSTheoTungLoai();
        lietKe("\n--- DS Hang Hoa Vua Doc Tu File ---", a);
        lietKe("\n---Danh Sach Hang Dien May", tachHang("HangDienMay"));
        lietKe("\n---Danh Sach Hang Thu Cong", tachHang("HangThuCong"));
        inDSTheoTungLoai();
        tinhTongThanhTienTheoLoai();
        timHoaDonThanhTienLonNhat();
        tinhTongTienTheoNgay();
    }

    public static void main(String[] args) {
        DanhSachHangHoa a = new DanhSachHangHoa();
        a.docFile("DSHangHoa.txt");
        a.output();
    }
}