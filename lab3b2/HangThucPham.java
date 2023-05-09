package Lab3;

import java.time.LocalDate;

public class HangThucPham extends HangHoa {
    public String NhaCungCap;
    public LocalDate NgaySanXuat,NgayHetHan;

    public String getNhaCungCap() {
        return NhaCungCap;
    }

    public void setNhaCungCap(String NhaCungCap) {
        this.NhaCungCap = NhaCungCap;
    }

    public LocalDate getNgaySanXuat() {
        return NgaySanXuat;
    }

    public void setNgaySanXuat(LocalDate NgaySanXuat) {
        this.NgaySanXuat = NgaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(LocalDate NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }
    
}
