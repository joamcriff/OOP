package BaiTap;

public class NhanVien extends CanBo {
    public NhanVien(String hoten, int tuoi, String gioitinh, String diachi, String congviec) {
        super(hoten, tuoi, gioitinh, diachi);
        this.congviec = congviec;
    }

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    private String congviec;

    @Override
    public String toString() {
        return "Nhan vien{" +
                "Công Việc='" + congviec + '\'' +
                ", Họ tên='" + getHoten() + '\'' +
                ", Tuổi=" + getTuoi() +
                ", Giới tính='" + getGioitinh() + '\'' +
                ", Địa chỉ='" + getDiachi() + '\'' +
                '}';
    }
}
