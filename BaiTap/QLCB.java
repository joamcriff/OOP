package BaiTap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLCB {

    private List<CanBo> canbo;

    public QLCB() {
        this.canbo = new ArrayList<>();
    }

    public void add(CanBo canbo) {
        this.canbo.add(canbo);
    }
    public List<CanBo> search(String hoten) {
        return this.canbo.stream().filter(i -> i.getHoten().contains(hoten)).collect(Collectors.toList());
    }
    public void ShowCanBo() {
        for(CanBo canbo : this.canbo) {
            System.out.println(canbo.toString());
        }
    }

}