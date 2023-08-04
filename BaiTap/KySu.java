package BaiTap;

public class KySu extends CanBo {
    public KySu(String hoten, int tuoi, String gioitinh, String diachi, String nganhdaotao) {
        super(hoten, tuoi, gioitinh, diachi);
        this.nganhdaotao = nganhdaotao;
    }

    public String getNganhdaotao() {
        return nganhdaotao;
    }

    public void setNganhdaotao(String nganhdaotao) {
        this.nganhdaotao = nganhdaotao;
    }

    private String nganhdaotao;

    @Override
    public String toString() {
        return "Ky su{" +
                "branch='" + nganhdaotao + '\'' +
                ", Họ tên='" + getHoten() + '\'' +
                ", Tuổi=" + getTuoi() +
                ", Giới tính='" + getGioitinh() + '\'' +
                ", Địa chỉ='" + getDiachi() + '\'' +
                '}';
    }
}
