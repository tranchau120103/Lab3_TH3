package Lab3;

class SinhVien {
    String MaSV;
    String HoTen;
    int NamSinh;

    public SinhVien(String MaSV, String HoTen, int NamSinh) {
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }
    

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    @Override
    public String toString() {
        return "Sinh vien{" + "MaSV=" + MaSV + ", HoTen=" + HoTen + ", NamSinh=" + NamSinh + '}';
    }

}
