package BaiTap;

public class CongNhan extends CanBo {

    public CongNhan(String hoten, int tuoi, String gioitinh, String diachi, int Bac) {
        super(hoten, tuoi, gioitinh, diachi);
        this.Bac = Bac;
    }

    public int getBac() {
        return Bac;
    }

    public void setBac(int bac) {
        Bac = bac;
    }

    private int Bac;

    @Override
    public String toString() {
        return "Cong nhan{" +
                "branch='" + Bac + '\'' +
                ", Họ tên='" + getHoten() + '\'' +
                ", Tuổi=" + getTuoi() +
                ", Giới tính='" + getGioitinh() + '\'' +
                ", Địa chỉ='" + getDiachi() + '\'' +
                '}';
    }
}
