package Test;

import java.util.List;
import java.util.Scanner;

public class DienThoaiView {
    private DienThoaiController controller;
    private Scanner scanner;

    public DienThoaiView() {
        controller = new DienThoaiController();
        scanner = new Scanner(System.in);
    }

    public void hienThiMenu() {
        System.out.println("----- CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI -----");
        System.out.println("1. Thêm mới điện thoại");
        System.out.println("2. Hiển thị danh sách điện thoại");
        System.out.println("3. Xóa điện thoại");
        System.out.println("4. Tìm kiếm theo tên");
        System.out.println("0. Thoát");
        System.out.print("Vui lòng chọn: ");
    }

    public void themMoiDienThoai() {
        System.out.print("Nhập tên điện thoại: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập giá điện thoại: ");
        double gia = scanner.nextDouble();
        scanner.nextLine(); // Đọc kí tự '\n' sau khi đọc số
        System.out.print("Nhập nhà sản xuất: ");
        String nhaSanXuat = scanner.nextLine();
        System.out.print("Chọn loại điện thoại (1 - Chính hãng, 2 - Xách tay): ");
        int loai = scanner.nextInt();
        scanner.nextLine(); // Đọc kí tự '\n' sau khi đọc số

        DienThoai dienThoai = new DienThoai();
        dienThoai.setTen(ten);
        dienThoai.setGia(gia);
        dienThoai.setNhaSanXuat(nhaSanXuat);

        if (loai == 1) {
            dienThoai.setChinhHang(true);
            System.out.print("Nhập thời gian bảo hành: ");
            int thoiGianBaoHanh = scanner.nextInt();
            scanner.nextLine(); // Đọc kí tự '\n' sau khi đọc số
            System.out.print("Nhập mã số bảo hành: ");
            String maSoBaoHanh = scanner.nextLine();

            dienThoai.setThoiGianBaoHanh(thoiGianBaoHanh);
            dienThoai.setMaSoBaoHanh(maSoBaoHanh);
        } else if (loai == 2) {
            dienThoai.setChinhHang(false);
            System.out.print("Nhập quốc gia: ");
            String quocGia = scanner.nextLine();
            System.out.print("Nhập trạng thái: ");
            String trangThai = scanner.nextLine();

            dienThoai.setQuocGia(quocGia);
            dienThoai.setTrangThai(trangThai);
        }

        controller.themDienThoai(dienThoai);
        System.out.println("Thêm mới điện thoại thành công!");
    }

    public void hienThiDanhSach() {
        List<DienThoai> danhSach = controller.hienThiDanhSach();
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách điện thoại trống!");
        } else {
            System.out.println("----- DANH SÁCH ĐIỆN THOẠI -----");
            for (DienThoai dt : danhSach) {
                System.out.println("ID: " + dt.getId());
                System.out.println("Tên: " + dt.getTen());
                System.out.println("Giá: " + dt.getGia());
                System.out.println("Nhà sản xuất: " + dt.getNhaSanXuat());
                if (dt.isChinhHang()) {
                    System.out.println("Loại: Chính hãng");
                    System.out.println("Thời gian bảo hành: " + dt.getThoiGianBaoHanh());
                    System.out.println("Mã số bảo hành: " + dt.getMaSoBaoHanh());
                } else {
                    System.out.println("Loại: Xách tay");
                    System.out.println("Quốc gia: " + dt.getQuocGia());
                    System.out.println("Trạng thái: " + dt.getTrangThai());
                }
                System.out.println("-----------------------------");
            }
        }
    }

    public void xoaDienThoai() {
        System.out.print("Nhập ID điện thoại cần xóa: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Đọc kí tự '\n' sau khi đọc số

        try {
            controller.xoaDienThoai(id);
            System.out.println("Xóa điện thoại thành công!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void timKiemTheoTen() {
        System.out.print("Nhập tên điện thoại cần tìm kiếm: ");
        String ten = scanner.nextLine();

        List<DienThoai> ketQua = controller.timKiemTheoTen(ten);
        if (ketQua.isEmpty()) {
            System.out.println("Không tìm thấy điện thoại nào có tên là " + ten);
        } else {
            System.out.println("----- KẾT QUẢ TÌM KIẾM -----");
            for (DienThoai dt : ketQua) {
                System.out.println("ID: " + dt.getId());
                System.out.println("Tên: " + dt.getTen());
                System.out.println("Giá: " + dt.getGia());
                System.out.println("Nhà sản xuất: " + dt.getNhaSanXuat());
                if (dt.isChinhHang()) {
                    System.out.println("Loại: Chính hãng");
                    System.out.println("Thời gian bảo hành: " + dt.getThoiGianBaoHanh());
                    System.out.println("Mã số bảo hành: " + dt.getMaSoBaoHanh());
                } else {
                    System.out.println("Loại: Xách tay");
                    System.out.println("Quốc gia: " + dt.getQuocGia());
                    System.out.println("Trạng thái: " + dt.getTrangThai());
                }
                System.out.println("-----------------------------");
            }
        }
    }

    public void chayChuongTrinh() {
        int luaChon;
        do {
            hienThiMenu();
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc kí tự '\n' sau khi đọc số

            switch (luaChon) {
                case 1:
                    themMoiDienThoai();
                    break;
                case 2:
                    hienThiDanhSach();
                    break;
                case 3:
                    xoaDienThoai();
                    break;
                case 4:
                    timKiemTheoTen();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        } while (luaChon != 0);
    }

    public static void main(String[] args) {
        DienThoaiView view = new DienThoaiView();
        view.chayChuongTrinh();
    }
}
