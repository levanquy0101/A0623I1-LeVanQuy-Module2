package Test;

import java.util.ArrayList;
import java.util.List;

public class DienThoaiController {
    private List<DienThoai> danhSachDienThoai;

    public DienThoaiController() {
        danhSachDienThoai = new ArrayList<>();
    }

    public void themDienThoai(DienThoai dienThoai) {
        danhSachDienThoai.add(dienThoai);
    }

    public List<DienThoai> hienThiDanhSach() {
        return danhSachDienThoai;
    }

    public void xoaDienThoai(int id) throws Exception {
        boolean found = false;
        for (DienThoai dt : danhSachDienThoai) {
            if (dt.getId() == id) {
                danhSachDienThoai.remove(dt);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new Exception("Không tìm thấy điện thoại có id = " + id);
        }
    }

    public List<DienThoai> timKiemTheoTen(String ten) {
        List<DienThoai> ketQua = new ArrayList<>();
        for (DienThoai dt : danhSachDienThoai) {
            if (dt.getTen().equalsIgnoreCase(ten)) {
                ketQua.add(dt);
            }
        }
        return ketQua;
    }
}