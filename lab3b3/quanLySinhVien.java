package Lab3;

import java.util.ArrayList;

public class quanLySinhVien {
    public  ArrayList<SinhVien> SinhVienList;

    public quanLySinhVien() {
        SinhVienList = new ArrayList<>();
    }

    public ArrayList<SinhVien> getSinhVien() {
        return SinhVienList;
    }

    public void themSinhVien(SinhVien sv) {
        SinhVienList.add(sv);
    }

    public void xoaSinhVien(String MaSV) {
        for (int i = 0; i < SinhVienList.size(); i++) {
            if (SinhVienList.get(i).getMaSV().equals(MaSV)) {
                SinhVienList.remove(i);
                break;
            }
        }
    }

    public void capNhatSinhVien(String MaSV, String HoTen, int NamSinh) {
        for (SinhVien sv : SinhVienList) {
            if (sv.getMaSV().equals(MaSV)) {
                sv.HoTen = HoTen;
                sv.NamSinh = NamSinh;
                break;
            }
        }
    }

    public SinhVien timKiemMa(String MaSV) {
        for (SinhVien sv : SinhVienList) {
            if (sv.getMaSV().equals(MaSV)) {
                return sv;
            }
        }
        return null;
    }

    public ArrayList<SinhVien> timKiemTen(String HoTen) {
        ArrayList<SinhVien> result = new ArrayList<>();
        for (SinhVien sv : SinhVienList) {
            if (sv.getHoTen().contains(HoTen)) {
                result.add(sv);
            }
        }
        return result;
    }

    public void sapXepMa() {
        SinhVienList.sort((s1, s2) -> s1.getMaSV().compareToIgnoreCase(s2.getMaSV()));
    }

}
