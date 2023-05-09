package Lab3;

import java.util.ArrayList;

public class Main {

   public static void main(String[] args) {
    quanLySinhVien quanLySinhVien = new quanLySinhVien();

    // Thêm sinh viên
    quanLySinhVien.themSinhVien(new SinhVien("SV001", "Do Quoc Bao", 1998));
    quanLySinhVien.themSinhVien(new SinhVien("SV002", "Vo Thu Ngan", 1999));
    quanLySinhVien.themSinhVien(new SinhVien("SV003", "Nguyen Ngoc Nhu", 2000));
    quanLySinhVien.themSinhVien(new SinhVien("SV004", "Le Gia Bao", 1997));
    quanLySinhVien.themSinhVien(new SinhVien("SV005", "Ly Gia Han", 1996));

    ArrayList<SinhVien> sv = quanLySinhVien.getSinhVien();
    System.out.println("Danh sach sinh vien:");
    for (SinhVien sinhVien : sv) {
        System.out.println(sv);
    }

    quanLySinhVien.themSinhVien(new SinhVien("SV006", "Nguyen Van Nam", 2001));
    System.out.println("Danh sach sau khi them:");
    for (SinhVien sinhVien : sv) {
        System.out.println(sv);
    }

    quanLySinhVien.xoaSinhVien("SV003");
    System.out.println("Danh sach hoc sinh sau khi xoa ma sv003:");
    for (SinhVien sinhVien : sv) {
        System.out.println(sv);
    }

    quanLySinhVien.capNhatSinhVien("SV004", "Le Gia Bao", 1998);
    System.out.println("Danh sach sinh vien sau khi cap nhat nam sinh cua hoc sinh ma so SV004:");
    for (SinhVien sinhVien : sv) {
        System.out.println(sv);
    }

    SinhVien TimKiemMa = quanLySinhVien.timKiemMa("SV002");
    System.out.println("Tim kiem ma SV002: " + TimKiemMa);

    ArrayList<SinhVien> TimKiemTen = quanLySinhVien.timKiemTen("Do");
    System.out.println("Tim kiem Do Quoc Bao:");
    for (SinhVien sinhVien : TimKiemTen) {
        System.out.println(TimKiemTen);
    }

    quanLySinhVien.sapXepMa();

    System.out.println("Danh sach sinh vien sau khi sap xep theo ma:");
    for (SinhVien sinhVien : sv) {
        System.out.println(sv);
    }
}

    
}
